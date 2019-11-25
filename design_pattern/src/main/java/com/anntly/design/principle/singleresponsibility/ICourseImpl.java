package com.anntly.design.principle.singleresponsibility;

/**
 * @author soledad
 * @Title: ICourseImpl
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/6/3021:32
 */
public class ICourseImpl implements ICourseManager,ICourseContent{

    public String getCourseName() {
        return null;
    }

    public byte[] getCourseVideo() {
        return new byte[0];
    }

    public void studyCourse() {

    }

    public void refundCourse() {

    }
}
