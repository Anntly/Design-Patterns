package com.anntly.design.principle.dependenceinversion;

/**
 * @author soledad
 * @Title: Student
 * @ProjectName design_pattern
 * @Description: 学生类
 * @date 2019/6/3014:39
 */
public class Student {

//    public void studyJavaCourse(){
//        System.out.println("正在学习Java");
//    }
//
//    public void studyFECourse(){
//        System.out.println("正在学习FE");
//    }
//
//    public void studyPythonCourse(){
//        System.out.println("正在学习Python");
//    }

    private ICourse course;

    public Student() {
    }

    public Student(ICourse course){
        this.course = course;
    }

    public void setCourse(ICourse course) {
        this.course = course;
    }

//        public void studyCourse(ICourse course){
//        course.studyCourse();
//    }

    public void studyCourse(){
        course.studyCourse();
    }
}
