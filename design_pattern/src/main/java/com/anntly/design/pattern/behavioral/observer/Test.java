package com.anntly.design.pattern.behavioral.observer;


/**
 * @author soledad
 * @Title: Test
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/2023:11
 */
public class Test {

    public static void main(String[] args) {
        Course course = new Course("小葵花妈妈课堂");
        Teacher teacher = new Teacher("小葵花");
        course.addObserver(teacher); // 添加观察者
        Question question = new Question("热心网友","孩子咳嗽老不好");

        course.produceQuestion(course,question);
    }
}
