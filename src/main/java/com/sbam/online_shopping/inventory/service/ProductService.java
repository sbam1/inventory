package com.sbam.online_shopping.inventory.service;

import com.github.dozermapper.core.Mapper;
import com.sbam.online_shopping.inventory.dto.ItemDto;
import com.sbam.online_shopping.inventory.dto.ProductDto;
import com.sbam.online_shopping.inventory.exception.NotFoundException;
import com.sbam.online_shopping.inventory.model.Brand;
import com.sbam.online_shopping.inventory.model.Category;
import com.sbam.online_shopping.inventory.model.Product;
import com.sbam.online_shopping.inventory.repository.BrandRepository;
import com.sbam.online_shopping.inventory.repository.CategoryRepository;
import com.sbam.online_shopping.inventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private BrandRepository brandRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private Mapper mapper;

    public List<ProductDto> getProducts() {
        List<Product> products = productRepository.findAll();
       return products.stream().map(it -> mapper.map(it, ProductDto.class)).collect(Collectors.toList());
    }

    public ProductDto getProduct(long productId) {
        return productRepository.findById(productId).map(it -> mapper.map(it, ProductDto.class)).orElse(null);
    }

    public void deleteProduct(long productId) {
        productRepository.deleteById(productId);
    }

    public void saveProduct(ProductDto productDto) {

        Brand brand = brandRepository.findById(productDto.getBrandId()).orElse(null);
        Category category = categoryRepository.findById(productDto.getCategoryId()).orElse(null);

        Product product = new Product();
        product.setBrand(brand);
        product.setCategory(category);
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        productRepository.save(product);
    }

    public List<ItemDto> getItems(long productId) {
        Optional<Product> product = productRepository.findById(productId);
        if(product.isEmpty()) {
            throw new NotFoundException("product with product id : " + productId + "not exist");
        } else {
            return product.get().getItems().stream().map(it -> mapper.map(it, ItemDto.class)).collect(Collectors.toList());
        }
    }
}
