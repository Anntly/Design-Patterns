package com.anntly.design.principle.openclose;

import java.math.BigDecimal;

/**
 * @author soledad
 * @Title: JavaCourse
 * @ProjectName design_pattern
 * @Description: Java课程类
 * 需要扩展一个获取打折价格的方法，根据开闭法则，作为底层的接口不应当对其进行修改，否则可能会“牵一发而动全身”
 * 采用一个高层的类来继承JavaCourse重写price方法即可
 * @date 2019/6/3010:16
 */
public class JavaCourse implements ICourse{

    private Integer id;

    private String name;

    private BigDecimal price;

    public JavaCourse() {
    }

    public JavaCourse(Integer id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public BigDecimal getPrice() {
        return this.price;
    }
}
