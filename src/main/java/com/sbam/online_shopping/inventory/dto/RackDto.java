package com.sbam.online_shopping.inventory.dto;

import com.github.dozermapper.core.Mapping;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class RackDto {

    private long rackId;
    private int rackNumber;
    private int totalSize;
    private int totalItems;

    @Mapping("aisle.aisleId")
    private long aisleId;

    @Mapping("aisle.name")
    private String aisleName;
}
