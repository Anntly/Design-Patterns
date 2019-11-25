package com.anntly.design.pattern.structural.composite;

/**
 * @author soledad
 * @Title: Test
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/1521:22
 */
public class Test {

    public static void main(String[] args) {
        CatalogComponent myCourses = new CourseCatalog("我的课程",1);
        CatalogComponent javaCourses = new CourseCatalog("Java学习路径",2);
        CatalogComponent javaCourse = new Course("Java从入门到精通",20);
        CatalogComponent springCourse = new Course("Spring从入门到精通",20);
        CatalogComponent mybatisCourse = new Course("Mybatis从入门到精通",20);
        CatalogComponent oracleCourse = new Course("Oracle从入门到精通",20);
        CatalogComponent mysqlCourse = new Course("Mysql从入门到精通",20);
        javaCourses.add(javaCourse);
        javaCourses.add(springCourse);
        javaCourses.add(mybatisCourse);
        myCourses.add(javaCourses);
        myCourses.add(oracleCourse);
        myCourses.add(mysqlCourse);

        myCourses.print();
    }
}
