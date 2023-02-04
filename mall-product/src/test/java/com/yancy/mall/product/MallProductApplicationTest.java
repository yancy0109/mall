package com.yancy.mall.product;

import com.yancy.mall.product.entity.BrandEntity;
import com.yancy.mall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试类
 * @author yancy0109
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MallProductApplicationTest {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(14L);
        brandEntity.setName("华为2");
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        System.out.println("Success");
        brandService.updateById(brandEntity);
    }
}
