package com.yancy.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yancy.common.utils.PageUtils;
import com.yancy.mall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author yancy0109
 * @email yancy0109@foxmail.com
 * @date 2023-02-04 21:49:35
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

