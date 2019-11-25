package com.anntly.design.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author soledad
 * @Title: CourseList
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/1922:48
 */
public class CourseList implements CourseCollection{

    private List<Course> courses;

    public CourseList() {
        this.courses = new ArrayList<>();
    }

    @Override
    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courses.remove(course);
    }

    @Override
    public Iterator getIterator() {
        return new CourseIterator(courses);
    }
}
