package com.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.product.entity.BrandEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 品牌
 *
 * @author zjt
 * @email zjintao12581@gmail.com
 * @date 2021-04-06 20:18:37
 */
@Service
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);

}

