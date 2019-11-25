package com.anntly.design.pattern.structural.composite;

/**
 * @author soledad
 * @Title: Course
 * @ProjectName design_pattern
 * @Description: 课程
 * @date 2019/7/1521:14
 */
public class Course extends CatalogComponent{

    private String name;

    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("名称:"+this.name+" 价格:"+this.price);
    }
}
