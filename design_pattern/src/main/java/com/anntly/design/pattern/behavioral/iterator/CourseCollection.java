package com.anntly.design.pattern.behavioral.iterator;

/**
 * @author soledad
 * @Title: CourseCollection
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/1922:47
 */
public interface CourseCollection {

    void addCourse(Course course);

    void removeCourse(Course course);

    Iterator getIterator();
}
