package com.anntly.design.pattern.creational.builder;

/**
 * @author soledad
 * @Title: Test
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/223:40
 */
public class Test {

    @org.junit.Test
    public void test1(){
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("Java从入门到入坟", "Java从入门到入坟.ppt",
                "no result", "perfect", "none");
        System.out.println(course);
    }

    @org.junit.Test
    public void test2(){
        CourseV2 courseV2 = new CourseV2.CourseBuilder().buildCourseName("Java从入门到入坟")
                .buildCoursePPT("Java从入门到入坟.ppt")
                .buildCourseArticle("none").build();
        System.out.println(courseV2);
    }
}
