package com.mall.member.dao;

import com.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zjt
 * @email zjintao12581@gmail.com
 * @date 2021-04-15 11:32:34
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
