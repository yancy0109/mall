package com.yancy.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yancy.common.utils.PageUtils;
import com.yancy.mall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author yancy0109
 * @email yancy0109@foxmail.com
 * @date 2023-02-04 21:38:58
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

