package com.mail.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mall.product.MallProductApplication;
import com.mall.product.entity.BrandEntity;
import com.mall.product.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author zjt
 * @date 2021-04-06
 */
@Slf4j
@SpringBootTest(classes = MallProductApplication.class)
@RunWith(SpringRunner.class)
public class MallProductApplicationTest {

    @Autowired
    private BrandService brandService;

    @Test
    public void test() {


        List<BrandEntity> list = brandService.list();

        list.forEach(e -> log.info(e.toString()));

        List<BrandEntity> brandList = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        brandList.forEach(System.out::println);

    }

}
