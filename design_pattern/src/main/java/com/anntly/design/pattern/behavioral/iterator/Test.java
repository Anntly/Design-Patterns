package com.anntly.design.pattern.behavioral.iterator;

/**
 * @author soledad
 * @Title: Test
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/1923:03
 */
public class Test {

    public static void main(String[] args) {
        CourseList courseList = new CourseList();
        for (int i = 0; i < 10; i++) {
            courseList.addCourse(new Course("《book"+i+"》"));
        }
        Iterator<Course> iterator = courseList.getIterator();
        while (iterator.hasNext()){
            System.out.println((iterator.next()).getName());
        }
    }
}
