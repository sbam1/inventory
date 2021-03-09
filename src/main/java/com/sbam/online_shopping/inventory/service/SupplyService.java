package com.sbam.online_shopping.inventory.service;

import com.github.dozermapper.core.Mapper;
import com.sbam.online_shopping.inventory.dto.SupplyDto;
import com.sbam.online_shopping.inventory.exception.NotFoundException;
import com.sbam.online_shopping.inventory.model.Product;
import com.sbam.online_shopping.inventory.model.Supplier;
import com.sbam.online_shopping.inventory.model.Supply;
import com.sbam.online_shopping.inventory.repository.ProductRepository;
import com.sbam.online_shopping.inventory.repository.SupplierRepository;
import com.sbam.online_shopping.inventory.repository.SupplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SupplyService {

    @Autowired
    private SupplyRepository supplyRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private SupplierRepository supplierRepository;

    @Autowired
    private Mapper mapper;

    public List<SupplyDto> getSupplies() {
        return supplyRepository.findAll().stream().map(it -> mapper.map(it, SupplyDto.class)).collect(Collectors.toList());
    }

    public SupplyDto getSupply(long supplyId) {
        return supplyRepository.findById(supplyId).map(it -> mapper.map(it, SupplyDto.class)).orElse(null);
    }

    public SupplyDto createSupply(SupplyDto supplyDto) throws NotFoundException {
        Supply supply = mapper.map(supplyDto, Supply.class);

        Optional<Product> product = productRepository.findById(supply.getProduct().getProductId());

        Optional<Supplier> supplier = supplierRepository.findById(supply.getSupplier().getSupplierId());

        if(product.isPresent() && supplier.isPresent()) {
            supply.setSupplier(supplier.get());
            supply.setProduct(product.get());
           return mapper.map(supplyRepository.save(supply), SupplyDto.class);
        } else {
            throw new NotFoundException("Invalid Supplier or Product, supplierId" + supply.getSupplier().getSupplierId()
            + "productId: " + supply.getProduct().getProductId());
        }
    }

    public void deleteSupply(long supplyId) {
        supplyRepository.deleteById(supplyId);
    }
}
