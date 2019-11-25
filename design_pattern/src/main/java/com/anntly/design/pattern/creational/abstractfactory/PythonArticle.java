package com.anntly.design.pattern.creational.abstractfactory;

/**
 * @author soledad
 * @Title: PythonArticle
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/217:13
 */
public class PythonArticle extends Article{
    @Override
    public void produce() {
        System.out.println("录制Python手记");
    }
}
