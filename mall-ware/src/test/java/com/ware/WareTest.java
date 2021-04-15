package com.ware;

import com.mall.ware.MallWareApplication;
import com.mall.ware.entity.PurchaseEntity;
import com.mall.ware.service.PurchaseService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author zjt
 * @date 2021-04-15
 */
@Slf4j
@SpringBootTest(classes = MallWareApplication.class)
@RunWith(SpringRunner.class)
public class WareTest {

    private PurchaseService purchaseService;

    @Autowired
    public void setPurchaseService(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @Test
    public void queryPurchaseTest() {
        List<PurchaseEntity> list = purchaseService.list();
        list.forEach(item -> System.out.println(item.toString()));
    }

}
