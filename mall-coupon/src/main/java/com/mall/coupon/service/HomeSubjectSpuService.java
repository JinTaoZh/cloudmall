package com.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * δΈι’εε
 *
 * @author zjt
 * @email zjintao12581@gmail.com
 * @date 2021-04-08 20:25:02
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

