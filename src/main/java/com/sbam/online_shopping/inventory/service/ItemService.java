package com.sbam.online_shopping.inventory.service;

import com.github.dozermapper.core.Mapper;
import com.sbam.online_shopping.inventory.dto.ItemDto;
import com.sbam.online_shopping.inventory.exception.InvalidInputException;
import com.sbam.online_shopping.inventory.exception.NotFoundException;
import com.sbam.online_shopping.inventory.model.Item;
import com.sbam.online_shopping.inventory.model.Product;
import com.sbam.online_shopping.inventory.model.Rack;
import com.sbam.online_shopping.inventory.repository.ItemRepository;
import com.sbam.online_shopping.inventory.repository.ProductRepository;
import com.sbam.online_shopping.inventory.repository.RackRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Log4j2
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private RackRepository rackRepository;

    @Autowired
    private Mapper mapper;

    public ItemDto getItem(long itemId){
       return itemRepository.findById(itemId).map(it -> mapper.map(it, ItemDto.class)).orElse(null);
    }

    public ItemDto createItem(ItemDto itemDto) {
        Item item = mapper.map(itemDto, Item.class);

        Optional<Rack> rack = rackRepository.findById(item.getRack().getRackId());
        Optional<Product> product = productRepository.findById(item.getProduct().getProductId());
        if(rack.isPresent() && rack.get().getTotalSize() == rack.get().getTotalItems()) {
            log.error("rack is currently full please use another rack rackId: {}", item.getRack().getRackId());
            throw new InvalidInputException("rack is currently full please use another rack");
        }
        else if(rack.isPresent() && product.isPresent()) {
            item.setRack(rack.get());
            item.setProduct(product.get());
            return mapper.map(itemRepository.saveAndFlush(item), ItemDto.class);
        } else {
            log.error("rack with rackId: {} or product with productId: {}", item.getRack().getRackId(), item.getProduct().getProductId());
            throw new NotFoundException("rack is currently full please use another rack");
        }
    }

    public void deleteItem(long itemId) {
        itemRepository.deleteById(itemId);
    }
}
