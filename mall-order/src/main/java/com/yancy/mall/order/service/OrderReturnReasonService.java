package com.yancy.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yancy.common.utils.PageUtils;
import com.yancy.mall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * ้่ดงๅๅ 
 *
 * @author yancy0109
 * @email yancy0109@foxmail.com
 * @date 2023-02-04 21:57:21
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

