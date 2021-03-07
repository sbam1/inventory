package com.sbam.online_shopping.inventory.service;

import com.sbam.online_shopping.inventory.dto.ProductDto;
import com.sbam.online_shopping.inventory.model.Brand;
import com.sbam.online_shopping.inventory.model.Category;
import com.sbam.online_shopping.inventory.model.Product;
import com.sbam.online_shopping.inventory.repository.BrandRepository;
import com.sbam.online_shopping.inventory.repository.CategoryRepository;
import com.sbam.online_shopping.inventory.repository.ProductRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("unit-test")
public class ProductServiceTest {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductService productService;

    @Autowired
    private BrandRepository brandRepository;


    @Test
    public void testGetCategories() {
        Category category1 = new Category();
        category1.setCategoryId(1);
        category1.setName("fake one");
        category1.setDescription("fake Description one");

        Category category2 = new Category();
        category2.setCategoryId(2);
        category2.setName("fake two");
        category2.setDescription("fake Description two");

        Category category3 = new Category();
        category3.setCategoryId(3);
        category3.setName("fake three");
        category3.setDescription("fake Description three");

        categoryRepository.save(category1);
        categoryRepository.save(category2);
        categoryRepository.save(category3);
        categoryRepository.flush();

        Brand apple = new Brand();
        apple.setBrandId(4);
        apple.setName("Apple");
        apple.setDescription("Apple Brand");
        Brand microsoft = new Brand();
        microsoft.setBrandId(5);
        microsoft.setName("Microsoft");
        microsoft.setDescription("Microsoft Brand");

        brandRepository.save(apple);
        brandRepository.save(microsoft);
        brandRepository.flush();

        Product product = new Product();
        product.setProductId(6);
        product.setName("fake product one");
        product.setDescription("fake product one");
        product.setBrand(apple);
        product.setCategory(category1);

        Product product2 = new Product();
        product2.setProductId(7);
        product2.setName("fake product two");
        product2.setDescription("fake product two");
        product2.setBrand(microsoft);
        product2.setCategory(category2);
        productRepository.save(product);
        productRepository.save(product2);
        productRepository.flush();

        List<ProductDto> products = productService.getProducts();
        Assert.assertNotNull(product);


    }



}