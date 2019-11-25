package com.anntly.design.pattern.creational.abstractfactory;

/**
 * @author soledad
 * @Title: Test
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/217:16
 */
public class Test {

    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        CourseFactory courseFactory1 = new PythonCourseFactory();
        Video javaVideo = courseFactory.getVideo();
        Article javaArticle = courseFactory.getArticle();
        javaVideo.produce();
        javaArticle.produce();


        Video pythonVideo = courseFactory1.getVideo();
        Article pythonArticle = courseFactory1.getArticle();
        pythonArticle.produce();
        pythonVideo.produce();
    }
}
