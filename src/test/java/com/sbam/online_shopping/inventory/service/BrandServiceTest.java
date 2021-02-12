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
@ActiveProfiles("dev")
public class BrandServiceTest {

    @Autowired
    private BrandService service;

    @Test
    public void saveBrands() {
        BrandDto apple = new BrandDto("Apple", "best electronic goods with high quality");
        BrandDto microsoft = new BrandDto("Microsoft", "best software service with cloud");
        BrandDto google = new BrandDto("Google", "awesome service with innovative mindset");
        BrandDto tesla = new BrandDto("Tesla", "future of car industry");
        BrandDto square = new BrandDto("Square", "online payment system for stores");
        BrandDto lg = new BrandDto("LG", "best electronics with affordable prise");
        BrandDto sony = new BrandDto("Sony", "amazing electronics with high quality");
        BrandDto localFarm = new BrandDto("Local Farm", "best Organic foods");
        BrandDto ohioFarms = new BrandDto("Ohio Farms", "local pottery and vegetables");

        service.saveAll(Arrays.asList(apple, microsoft, google, tesla, square, lg, sony, localFarm, ohioFarms));


    }

    @Test
    public void getByBrandName() {

        BrandDto apple = new BrandDto("Apple", "best electronic goods with high quality");
        BrandDto microsoft = new BrandDto("Microsoft", "best software service with cloud");
        BrandDto google = new BrandDto("Google", "awesome service with innovative mindset");
        BrandDto tesla = new BrandDto("Tesla", "future of car industry");
        BrandDto square = new BrandDto("Square", "online payment system for stores");
        BrandDto lg = new BrandDto("LG", "best electronics with affordable prise");
        BrandDto sony = new BrandDto("Sony", "amazing electronics with high quality");
        BrandDto localFarm = new BrandDto("Local Farm", "best Organic foods");
        BrandDto ohioFarms = new BrandDto("Ohio Farms", "local pottery and vegetables");

        service.saveAll(Arrays.asList(apple, microsoft, google, tesla, square, lg, sony, localFarm, ohioFarms));

        BrandDto brand = service.getBrand("Apple");
        Assert.assertNotNull(brand);
        Assert.assertEquals("Apple", brand.getName());

    }
}