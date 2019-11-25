package com.anntly.design.pattern.creational.builder;

/**
 * @author soledad
 * @Title: Coach
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/223:36
 */
public class Coach {

    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName,String coursePPT,String courseVideo,
                                String courseArtical,String courseQA){
        courseBuilder.buildCourseName(courseName);
        courseBuilder.buildCoursePPT(coursePPT);
        courseBuilder.buildCourseArticle(courseArtical);
        courseBuilder.buildCourseQA(courseQA);
        courseBuilder.buildCourseVideo(courseVideo);
        return courseBuilder.makeCourse();
    }
}
