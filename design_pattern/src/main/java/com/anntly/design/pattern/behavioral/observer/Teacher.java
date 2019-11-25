package com.anntly.design.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author soledad
 * @Title: Teacher
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/2022:51
 */
public class Teacher implements Observer {

    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    @Override
    public void update(Observable o, Object arg) { // 0被观察对象,arg参数
        Course course = (Course)o;
        Question question = (Question)arg;

        System.out.println(teacherName+"老师在"+course.getCourseName()+"课程上收到"+question.getUserName()+"提出一个问题:"+question.getQuestionContent());
        System.out.println("老师回复到：多半是废了");
    }
}
