package com.sbam.online_shopping.inventory.service;

import com.sbam.online_shopping.inventory.dto.CategoryDto;
import com.sbam.online_shopping.inventory.model.Category;
import com.sbam.online_shopping.inventory.repository.CategoryRepository;
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
public class CategoryServiceTest {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryService categoryService;


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

        List<CategoryDto> categories = categoryService.getCategories();

        Assert.assertNotNull(categories);
        Assert.assertEquals(6, categories.size());

    }

}