package com.mall.order.dao;

import com.mall.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author zjt
 * @email zjintao12581@gmail.com
 * @date 2021-04-15 11:52:19
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
