package com.sbam.online_shopping.inventory.util;


import com.github.dozermapper.core.Mapper;
import com.sbam.online_shopping.inventory.dto.SupplyDto;
import com.sbam.online_shopping.inventory.exception.NotFoundException;
import com.sbam.online_shopping.inventory.model.Aisle;
import com.sbam.online_shopping.inventory.model.Item;
import com.sbam.online_shopping.inventory.model.Product;
import com.sbam.online_shopping.inventory.model.Rack;
import com.sbam.online_shopping.inventory.model.Supplier;
import com.sbam.online_shopping.inventory.model.Supply;
import com.sbam.online_shopping.inventory.repository.AisleRepository;
import com.sbam.online_shopping.inventory.repository.ItemRepository;
import com.sbam.online_shopping.inventory.repository.ProductRepository;
import com.sbam.online_shopping.inventory.repository.SupplierRepository;
import com.sbam.online_shopping.inventory.repository.SupplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

@Component
public class InventoryGenerator {

    @Autowired
    private SupplyRepository supplyRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private SupplierRepository supplierRepository;

    @Autowired
    private AisleRepository aisleRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private Mapper mapper;

    public void generateAndStoreInventory(SupplyDto supplyDto) {

        Supply supply = mapper.map(supplyDto, Supply.class);
        Optional<Product> product = productRepository.findById(supply.getProduct().getProductId());
        Optional<Supplier> supplier = supplierRepository.findById(supply.getSupplier().getSupplierId());
        if(product.isEmpty()) {
            throw new NotFoundException("product with product id : " + supplyDto.getProductId() + "not exist");
        }

        if(supplier.isEmpty()) {
            throw new NotFoundException("supplier with supplier id : " + supplyDto.getSupplierId() + "not exist");
        }

        List<Aisle> aisles = aisleRepository.findAllBySectionAAndCategory_CategoryId("Store", product.get().getCategory().getCategoryId());

        AtomicReference<Long> totalItems = new AtomicReference<>(supply.getQuantity());

        List<Rack> racks = aisles.stream().flatMap(it -> it.getRacks().stream()).collect(Collectors.toList());
        racks.stream()
                .takeWhile(it -> totalItems.get() > 0)
                .forEach(it -> {
                    if(!it.isRackFull()) {
                        int totalSpace = it.getTotalSize() - it.getTotalItems();
                        if(totalItems.get() <= totalSpace) {
                            storeInventory(it, totalItems.get(), product.get());
                        } else {
                            totalItems.updateAndGet(v -> v - totalSpace);
                            storeInventory(it, totalSpace, product.get());
                        }
                    }
                });
    }

    public void storeInventory(Rack rack, long totalItems, Product product){
        Item item = new Item();
        item.setProduct(product);
        item.setRack(rack);
        itemRepository.saveAndFlush(item);

    }

    public Item buildItem(Rack rack,  Product product){
        Item item = new Item();
        item.setDescription(product.getDescription());
        item.setProduct(product);
        item.setRack(rack);
        return item;
    }

    private String colorPicker() {
        List<String> colors = Arrays.asList("Red", "Black", "Green", "White", "Gray", "Yellow", "Pink", "Blue");
        Random rand = new Random();
       return colors.get(rand.nextInt(colors.size()));
    }


    private int pricePicker() {
        Random rand = new Random();
        return rand.nextInt(2000);
    }
}
