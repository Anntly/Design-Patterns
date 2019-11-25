package com.anntly.design.pattern.creational.abstractfactory;

/**
 * @author soledad
 * @Title: CourseFactory
 * @ProjectName design_pattern
 * @Description:
 * @date 2019/7/217:13
 */
public abstract class CourseFactory {

    abstract Video getVideo();

    abstract Article getArticle();
}
