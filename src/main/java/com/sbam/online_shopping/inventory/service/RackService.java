package com.sbam.online_shopping.inventory.service;

import com.github.dozermapper.core.Mapper;
import com.sbam.online_shopping.inventory.dto.RackDto;
import com.sbam.online_shopping.inventory.exception.NotFoundException;
import com.sbam.online_shopping.inventory.model.Aisle;
import com.sbam.online_shopping.inventory.model.Rack;
import com.sbam.online_shopping.inventory.repository.AisleRepository;
import com.sbam.online_shopping.inventory.repository.RackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RackService {

    @Autowired
    private RackRepository rackRepository;

    @Autowired
    private AisleRepository aisleRepository;

    @Autowired
    private Mapper mapper;

    public List<RackDto> getRacks() {
        return rackRepository.findAll().stream().map(it -> mapper.map(it, RackDto.class)).collect(Collectors.toList());
    }

    public RackDto getRack(long rackId) {
        return rackRepository.findById(rackId).map(it -> mapper.map(it, RackDto.class)).orElse(null);
    }

    public void saveRack(RackDto rackDto) {
        Rack rack = mapper.map(rackDto, Rack.class);

        Optional<Aisle> aisle = aisleRepository.findById(rack.getAisle().getAisleId());
        if(aisle.isPresent()) {
            rack.setAisle(aisle.get());
            rackRepository.saveAndFlush(rack);
        } else {
            throw new NotFoundException("Invalid Aisle Id: " + rack.getAisle().getAisleId());
        }
    }

    public void deleteRack(long rackId) {
        rackRepository.deleteById(rackId);
    }
}
