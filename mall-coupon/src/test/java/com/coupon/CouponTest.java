package com.coupon;

import com.mall.coupon.MallCouponApplication;
import com.mall.coupon.entity.CouponEntity;
import com.mall.coupon.service.CouponService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author zjt
 * @date 2021-04-14
 */

@Slf4j
@SpringBootTest(classes = MallCouponApplication.class)
@RunWith(SpringRunner.class)
public class CouponTest {

    private CouponService couponService;

    @Autowired
    public void setCouponService(CouponService couponService) {
        this.couponService = couponService;
    }

    @Test
    public void QueryTest() {
        List<CouponEntity> couponList = couponService.list();
        couponList.forEach(item -> System.out.println(item.toString()));
    }

}
