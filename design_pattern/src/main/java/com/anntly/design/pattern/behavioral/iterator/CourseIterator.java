package com.anntly.design.pattern.behavioral.iterator;

import java.util.List;

/**
 * @author soledad
 * @Title: CourseIterator
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/1922:58
 */
public class CourseIterator implements Iterator{

    private List<Course> tmp;

    private int loopCount;

    public CourseIterator(List<Course> tmp) {
        this.tmp = tmp;
    }

    @Override
    public boolean hasNext() {
        return loopCount < tmp.size();
    }

    @Override
    public Course next() {
        Course course = tmp.get(loopCount);
        loopCount ++;
        return course;
    }
}
