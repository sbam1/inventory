package com.sbam.online_shopping.inventory.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
public class ItemsDto {
    private List<ItemDto> items;

}
