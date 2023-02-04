package com.yancy.mall.coupon.dao;

import com.yancy.mall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author yancy0109
 * @email yancy0109@foxmail.com
 * @date 2023-02-04 21:38:58
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
