package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.model.Coupon;

public interface CouponMapper extends BaseMapper<Coupon> {
    String findCouponById(Integer id);
}
