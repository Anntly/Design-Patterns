package com.anntly.design.pattern.behavioral.templatermethod;

/**
 * @author soledad
 * @Title: Test
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/1821:36
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("设计模式课程-----start");
        ACourse course = new DesignPatternCourse();
        course.makeCourse();
        System.out.println("设计模式课程-----end");
        System.out.println("前端模式课程-----start");
        ACourse pCourse = new PECourse(false);
        pCourse.makeCourse();
        System.out.println("前端模式课程-----end");
    }
}
