package com.anntly.design.principle.openclose;

import java.math.BigDecimal;

/**
 * @author soledad
 * @Title: Test
 * @ProjectName design_pattern
 * @Description: 测试类
 * @date 2019/6/3010:17
 */
public class Test {

    @org.junit.Test
    public void test1(){
        //ICourse course = new JavaCourse(1,"Java从入门到入坟",new BigDecimal("320.2"));
        ICourse course = new JavaDiscountCourse(1,"Java从入门到入坟",new BigDecimal("320.2"));
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse)course;
        System.err.println("课程编号:"+javaDiscountCourse.getId()+"\n课程名称:"+javaDiscountCourse.getName()+
                "\n课程价格:"+javaDiscountCourse.getOriginPrice()+"\n折扣价格"+javaDiscountCourse.getPrice());
    }
}
