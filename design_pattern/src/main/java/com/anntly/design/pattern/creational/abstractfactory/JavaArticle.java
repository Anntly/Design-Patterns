package com.anntly.design.pattern.creational.abstractfactory;

/**
 * @author soledad
 * @Title: JavaArticle
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/217:12
 */
public class JavaArticle extends Article{
    @Override
    public void produce() {
        System.out.println("录制Java手记");
    }
}
