package com.anntly.design.pattern.behavioral.observer;


import java.util.Observable;

/**
 * @author soledad
 * @Title: Course
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/2022:50
 */
public class Course extends Observable { // 声明为被观察对象

    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course,Question question){
        System.out.println(question.getUserName()+"在"+course.courseName+"上提出了一个问题");
        setChanged(); // 代表状态改变
        notifyObservers(question);
    }
}
