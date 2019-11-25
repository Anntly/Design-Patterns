package com.anntly.design.principle.openclose;

import java.math.BigDecimal;

/**
 * @author soledad
 * @Title: JavaDiscountCourse
 * @ProjectName design_pattern
 * @Description: 打折课程类
 * @date 2019/6/3010:29
 */
public class JavaDiscountCourse extends JavaCourse{

    public JavaDiscountCourse(Integer id, String name, BigDecimal price) {
        super(id, name, price);
    }

    /**
     * 获取原价
     * @return
     */
    public BigDecimal getOriginPrice(){
        return super.getPrice();
    }

    /**
     * 重写获取价格方法
     * @return
     */
    @Override
    public BigDecimal getPrice() {
        return super.getPrice().multiply(new BigDecimal("0.8"));
    }
}
