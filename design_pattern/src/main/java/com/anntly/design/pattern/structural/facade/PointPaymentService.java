package com.anntly.design.pattern.structural.facade;

/**
 * @author soledad
 * @Title: PointPaymentService
 * @ProjectName design_pattern
 * @Description:
 * @date 2019/7/820:38
 */
public class PointPaymentService {

    public boolean pay(PointGift pointGift){
        // 扣减积分
        System.out.println("支付"+pointGift.getName()+"积分成功");
        return true;
    }
}
