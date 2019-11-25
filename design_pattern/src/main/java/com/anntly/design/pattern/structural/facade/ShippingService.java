package com.anntly.design.pattern.structural.facade;

/**
 * @author soledad
 * @Title: ShippingService
 * @ProjectName design_pattern
 * @Description:
 * @date 2019/7/820:42
 */
public class ShippingService {

    public String shipGift(PointGift pointGift){
        // 物流系统的对接逻辑
        System.out.println(pointGift.getName()+"物流对接");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
