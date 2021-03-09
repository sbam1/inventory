package com.sbam.online_shopping.inventory.controller;

import com.sbam.online_shopping.inventory.dto.RackDto;
import com.sbam.online_shopping.inventory.dto.RacksDto;
import com.sbam.online_shopping.inventory.service.RackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RackController {

    @Autowired
    private RackService rackService;

    @GetMapping(path = "inventory/racks")
    public ResponseEntity<RacksDto> getRacks() {
        List<RackDto> racks = rackService.getRacks();
        return ResponseEntity.status(HttpStatus.OK).body(new RacksDto(racks));
    }

    @GetMapping(path = "inventory/aisles/{aisleId}/racks")
    public ResponseEntity<RacksDto> getRacksByAisle(@PathVariable long aisleId) {
        List<RackDto> racks = rackService.getRacksByAisle(aisleId);
        return ResponseEntity.status(HttpStatus.OK).body(new RacksDto(racks));
    }


    @GetMapping(path = "inventory/aisles/{aisleId}/racks/{rackId}")
    public ResponseEntity<RackDto> getRack(@PathVariable long rackId, @PathVariable String aisleId) {
        return ResponseEntity.status(HttpStatus.OK).body(rackService.getRack(rackId));
    }

    @PostMapping(path = "inventory/aisles/{aisleId}/racks/")
    public ResponseEntity<RackDto> saveRack(@RequestBody RackDto rackDto) {
        return ResponseEntity.status(HttpStatus.OK).body(rackService.saveRack(rackDto));
    }

    @DeleteMapping(path = "inventory/aisles/{aisleId}/racks/{rackId}")
    public ResponseEntity<Void> deleteBrand(@PathVariable long aisleId, @PathVariable long rackId) {
        rackService.deleteRack(aisleId);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
