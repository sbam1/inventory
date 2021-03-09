package com.sbam.online_shopping.inventory.service;

import com.github.dozermapper.core.Mapper;
import com.sbam.online_shopping.inventory.dto.SupplierDto;
import com.sbam.online_shopping.inventory.model.Supplier;
import com.sbam.online_shopping.inventory.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    @Autowired
    private Mapper mapper;

    public List<SupplierDto> getSuppliers() {
        return supplierRepository.findAll().stream().map(it -> mapper.map(it, SupplierDto.class)).collect(Collectors.toList());
    }

    public SupplierDto getSupplier(long supplierId) {
        return supplierRepository.findById(supplierId).map(it -> mapper.map(it, SupplierDto.class)).orElse(null);
    }

    public SupplierDto saveSupplier(SupplierDto supplierDto) {
        Supplier supplier = mapper.map(supplierDto, Supplier.class);
        return mapper.map(supplierRepository.saveAndFlush(supplier), SupplierDto.class);
    }

    public void deleteSupply(long supplierId) {
        supplierRepository.deleteById(supplierId);
    }
}
