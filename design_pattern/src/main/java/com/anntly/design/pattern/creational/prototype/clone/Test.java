package com.anntly.design.pattern.creational.prototype.clone;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author soledad
 * @Title: Test
 * @ProjectName design_pattern
 * @Description:
 * @date 2019/7/714:17
 */
public class Test {

//    public static void main(String[] args) throws CloneNotSupportedException {
//        Date birthday = new Date(0L);
//        Pig pig1 = new Pig("佩琪",birthday);
//        Pig pig2 = (Pig) pig1.clone();
//        System.out.println(pig1);
//        System.out.println(pig2);
//        pig1.getBirthday().setTime(66666L);
//
//        System.out.println("---------------");
//        System.out.println(pig1);
//        System.out.println(pig2);
//    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Singleton singleton = Singleton.getInstance();
        Method method = singleton.getClass().getDeclaredMethod("clone");
        method.setAccessible(true);
        Singleton newSingleton = (Singleton) method.invoke(singleton);
        System.out.println(singleton);
        System.out.println(newSingleton);
    }
}
