package com.example.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dao.CouponMapper;
import com.example.model.Coupon;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CouponService extends ServiceImpl<CouponMapper, Coupon> {
    @Resource
    private CouponMapper couponMapper;


    public String findCouponById(Integer id) {
        return couponMapper.findCouponById(id);
    }
}
