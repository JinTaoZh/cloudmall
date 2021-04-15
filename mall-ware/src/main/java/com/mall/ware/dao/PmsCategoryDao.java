package com.mall.ware.dao;

import com.mall.ware.entity.PmsCategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zjt
 * @email zjintao12581@gmail.com
 * @date 2021-04-15 15:15:43
 */
@Mapper
public interface PmsCategoryDao extends BaseMapper<PmsCategoryEntity> {
	
}
