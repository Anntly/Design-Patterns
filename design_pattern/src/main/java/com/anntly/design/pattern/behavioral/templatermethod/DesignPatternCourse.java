package com.anntly.design.pattern.behavioral.templatermethod;

/**
 * @author soledad
 * @Title: DesignPatternCourse
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/1821:32
 */
public class DesignPatternCourse  extends ACourse{

    @Override
    void packageCourse() {
        System.out.println("打包Java源码");
    }

    @Override
    protected boolean needArticle() {
        return true;
    }
}
