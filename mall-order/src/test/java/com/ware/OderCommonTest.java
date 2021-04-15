package com.ware;

import com.mall.order.MallOrderApplication;
import com.mall.order.entity.OrderEntity;
import com.mall.order.service.OrderService;
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
@SpringBootTest(classes = MallOrderApplication.class)
@RunWith(SpringRunner.class)
public class OderCommonTest {

    private OrderService orderService;

    @Autowired
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    @Test
    public void queryOrderTest() {
        List<OrderEntity> list = orderService.list();
        list.forEach(item -> System.out.println(item.toString()));
    }


}
