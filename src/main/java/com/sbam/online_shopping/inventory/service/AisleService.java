package com.sbam.online_shopping.inventory.service;

import com.github.dozermapper.core.Mapper;
import com.sbam.online_shopping.inventory.dto.AisleDto;
import com.sbam.online_shopping.inventory.dto.ItemDto;
import com.sbam.online_shopping.inventory.exception.NotFoundException;
import com.sbam.online_shopping.inventory.model.Aisle;
import com.sbam.online_shopping.inventory.model.Category;
import com.sbam.online_shopping.inventory.repository.AisleRepository;
import com.sbam.online_shopping.inventory.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AisleService {

    @Autowired
    private AisleRepository aisleRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private Mapper mapper;

    public List<AisleDto> getAisles() {
        return aisleRepository.findAll().stream().map(it -> mapper.map(it, AisleDto.class)).collect(Collectors.toList());
    }

    public AisleDto getAisleById(long aisleId){
        return aisleRepository.findById(aisleId).map(it -> mapper.map(it, AisleDto.class)).orElse(null);
    }

    public AisleDto saveAisle(AisleDto aisleDto){

        Aisle aisle = mapper.map(aisleDto, Aisle.class);

        Optional<Category> category = categoryRepository.findById(aisle.getCategory().getCategoryId());
        if(category.isPresent()) {
            aisle.setCategory(category.get());
            Aisle savedAisle = aisleRepository.saveAndFlush(aisle);
            return mapper.map(savedAisle, AisleDto.class);
        } else {
            throw new NotFoundException("invalid category!");
        }
    }

    public List<ItemDto> getItems(long aisleId) {
        Optional<Aisle> aisle = aisleRepository.findById(aisleId);

        if(aisle.isEmpty()) {
            throw new NotFoundException("Aisle not found AisleId " + aisleId);
        } else{
            return aisle.get().getRacks().stream().flatMap(it -> it.getItems().stream())
                    .map( it -> mapper.map(it, ItemDto.class)).collect(Collectors.toList());
        }


    }

    public void deleteAisle(long aisleId) {
        aisleRepository.deleteById(aisleId);
    }
 }
