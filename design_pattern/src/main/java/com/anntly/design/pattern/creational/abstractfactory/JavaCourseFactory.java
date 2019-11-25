package com.anntly.design.pattern.creational.abstractfactory;

/**
 * @author soledad
 * @Title: JavaCourseFactory
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/217:14
 */
public class JavaCourseFactory extends CourseFactory{
    @Override
    Video getVideo() {
        return new JavaVideo();
    }

    @Override
    Article getArticle() {
        return new JavaArticle();
    }
}
