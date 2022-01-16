package com.sbam.online_shopping.inventory.service;


import com.sbam.online_shopping.inventory.dto.BrandDto;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("unit-test")
public class BrandServiceTest {

    @Autowired
    private BrandService service;

    @Test
    public void saveBrands() {
        BrandDto apple = new BrandDto(1,"Apple", "best electronic goods with high quality");
        BrandDto microsoft = new BrandDto(2,"Microsoft", "best software service with cloud");
        BrandDto google = new BrandDto(3,"Google", "awesome service with innovative mindset");
        BrandDto tesla = new BrandDto(4,"Tesla", "future of car industry");
        BrandDto square = new BrandDto(5,"Square", "online payment system for stores");
        BrandDto lg = new BrandDto(6,"LG", "best electronics with affordable prise");
        BrandDto sony = new BrandDto(7,"Sony", "amazing electronics with high quality");
        BrandDto localFarm = new BrandDto(8, "Local Farm", "best Organic foods");
        BrandDto ohioFarms = new BrandDto(9,"Ohio Farms", "local pottery and vegetables");

        service.saveAll(Arrays.asList(apple, microsoft, google, tesla, square, lg, sony, localFarm, ohioFarms));


    }

    @Test
    public void getByBrandName() {

        BrandDto apple = new BrandDto(100,"Apple2", "best electronic goods with high quality");

        service.save(apple);

        BrandDto brand = service.getBrand("Apple2");
        Assert.assertNotNull(brand);
        Assert.assertEquals("Apple2", brand.getName());

    }
}