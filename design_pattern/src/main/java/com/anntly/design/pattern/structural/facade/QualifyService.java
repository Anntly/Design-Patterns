package com.anntly.design.pattern.structural.facade;

/**
 * @author soledad
 * @Title: QualifyService
 * @ProjectName design_pattern
 * @Description:
 * @date 2019/7/820:36
 */
public class QualifyService {

    public boolean isAvailable(PointGift pointGift){
        System.out.println("校验"+pointGift.getName()+"积分资格通过");
        return true;
    }
}
