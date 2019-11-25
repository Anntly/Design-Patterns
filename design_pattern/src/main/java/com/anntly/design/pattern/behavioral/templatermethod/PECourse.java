package com.anntly.design.pattern.behavioral.templatermethod;

/**
 * @author soledad
 * @Title: PECourse
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/1821:35
 */
public class PECourse extends ACourse{

    private boolean needCourse;

    @Override
    void packageCourse() {
        System.out.println("打包前端源码");
        System.out.println("打包前端资源");
    }

    public PECourse(boolean needCourse) {
        this.needCourse = needCourse;
    }

    @Override
    protected boolean needArticle() {
        return this.needCourse;
    }
}
