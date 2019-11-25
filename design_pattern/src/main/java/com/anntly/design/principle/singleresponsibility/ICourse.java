package com.anntly.design.principle.singleresponsibility;

/**
 * @author soledad
 * @Title: ICourse
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/6/3021:26
 */
public interface ICourse {

    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();
}
