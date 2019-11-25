package com.anntly.design.pattern.creational.builder;

/**
 * @author soledad
 * @Title: CourseBuilder
 * @ProjectName design_pattern
 * @Description:
 * @date 2019/7/223:26
 */
public abstract class CourseBuilder {

    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse(); // 返回课程实例
}
