package com.mall.member.feign;

import com.mall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zjt
 * @date 2021-05-11
 */
@FeignClient("cloud-mall-coupon")
public interface CouponRPCService {

    @GetMapping("/coupon/coupon/user")
    R getAllCouponByUser();


}
