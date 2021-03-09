package com.sbam.online_shopping.inventory.controller;

import com.sbam.online_shopping.inventory.dto.ItemDto;
import com.sbam.online_shopping.inventory.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping(path = "/inventory/items/{itemId}")
    public ResponseEntity<ItemDto> getItemsByProduct( @PathVariable String itemId) {
        ItemDto item = itemService.getItem(Long.parseLong(itemId));
        return ResponseEntity.status(HttpStatus.OK).body(item);
    }

    @PostMapping(path = "/inventory/items")
    public ResponseEntity<ItemDto> saveItem(@RequestBody ItemDto dto) {
        return ResponseEntity.status(HttpStatus.OK).body(itemService.createItem(dto));
    }

    @DeleteMapping("inventory/items/{itemId}")
    public ResponseEntity<Void> deleteItem(@PathVariable String itemId) {
        itemService.deleteItem(Long.parseLong(itemId));
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
