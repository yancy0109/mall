package com.yancy.mall.member.dao;

import com.yancy.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yancy0109
 * @email yancy0109@foxmail.com
 * @date 2023-02-04 21:49:35
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
