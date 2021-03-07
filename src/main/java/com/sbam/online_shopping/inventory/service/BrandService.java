package com.sbam.online_shopping.inventory.service;

import com.sbam.online_shopping.inventory.dto.BrandDto;
import com.sbam.online_shopping.inventory.model.Brand;
import com.sbam.online_shopping.inventory.repository.BrandRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BrandService {

    private BrandRepository brandRepository;


    public BrandService(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    public BrandDto getBrand(long brandId) {
        Optional<Brand> brand = brandRepository.findById(brandId);
        return brand.map(value -> new BrandDto(value.getBrandId(), value.getName(), value.getDescription())).orElse(null);

    }

    public BrandDto getBrand(String brandName) {
        Optional<Brand> brand = brandRepository.findByName(brandName);
        return brand.map(value -> new BrandDto(value.getBrandId(), value.getName(), value.getDescription())).orElse(null);

    }

    public List<BrandDto> getBrands() {
        return brandRepository.findAll().stream().map(it -> new BrandDto(it.getBrandId(), it.getName(), it.getDescription())).collect(Collectors.toList());
    }

    public BrandDto save(BrandDto dto) {
        Brand brand = new Brand();
        brand.setName(dto.getName());
        brand.setDescription(dto.getDescription());

        Brand savedEntity = brandRepository.save(brand);

        return new BrandDto(savedEntity.getBrandId(), savedEntity.getName(), savedEntity.getDescription());
    }


    public void saveAll(List<BrandDto> brandDtos) {
        brandDtos.forEach(it-> save(it));
    }

    public void deleteBrand(String brandId) {
       brandRepository.deleteById(Long.valueOf(brandId));
    }
}
