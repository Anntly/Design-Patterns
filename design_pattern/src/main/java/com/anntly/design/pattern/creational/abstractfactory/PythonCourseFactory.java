package com.anntly.design.pattern.creational.abstractfactory;

/**
 * @author soledad
 * @Title: PythonCourseFactory
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/217:15
 */
public class PythonCourseFactory  extends CourseFactory{
    @Override
    Video getVideo() {
        return new PythonVideo();
    }

    @Override
    Article getArticle() {
        return new PythonArticle();
    }
}
