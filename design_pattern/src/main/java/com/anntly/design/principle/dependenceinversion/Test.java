package com.anntly.design.principle.dependenceinversion;

/**
 * @author soledad
 * @Title: Test
 * @ProjectName design_pattern
 * @Description: 测试
 * @date 2019/6/3014:40
 */
public class Test {

//    @org.junit.Test
//    public void test1(){
//        Student student = new Student();
//        student.studyJavaCourse();
//        student.studyFECourse();
//        student.studyPythonCourse();
//    }

//    @org.junit.Test
//    public void test2(){
//        Student student = new Student();
//        student.studyCourse(new JavaCourse());
//        student.studyCourse(new PECourse());
//        student.studyCourse(new PythonCourse());
//    }

    @org.junit.Test
    public void test3(){
        Student student = new Student(new JavaCourse());
        student.studyCourse();
    }

    @org.junit.Test
    public void test4(){
        Student student = new Student();
        ICourse course1 = new JavaCourse();
        ICourse course2 = new PECourse();
        ICourse course3 = new PythonCourse();

        student.setCourse(course1);
        student.studyCourse();

        student.setCourse(course2);
        student.studyCourse();

        student.setCourse(course3);
        student.studyCourse();
    }
}
