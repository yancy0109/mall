package com.yancy.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yancy.common.utils.PageUtils;
import com.yancy.mall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author yancy0109
 * @email yancy0109@foxmail.com
 * @date 2023-02-04 15:50:50
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
