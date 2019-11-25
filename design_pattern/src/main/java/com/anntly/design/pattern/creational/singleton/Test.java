package com.anntly.design.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/**
 * @author soledad
 * @Title: Test
 * @ProjectName design_pattern
 * @Description:
 * @date 2019/7/416:37
 */
public class Test {

    @org.junit.Test
    public void test1(){
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton);
    }


//    public static void main(String[] args) {
//        for (int i = 0; i < 3; i++) {
//            T t = new T();
//            Thread thread = new Thread(t);
//            thread.start();
//        }
//
//        System.out.println("end");
//    }

//    public static void main(String[] args) {
////
////        HungrySingleton singleton = HungrySingleton.getInstance();
////        File file = new File("temp");
////        try(
////
////                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("temp"));
////                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))
////        ){
////            oos.writeObject(singleton);
////
////            HungrySingleton newSingleton = (HungrySingleton) ois.readObject();
////            System.out.println(singleton);
////            System.out.println(newSingleton);
////            System.out.println(newSingleton == singleton);
////
////        } catch (FileNotFoundException e) {
////            e.printStackTrace();
////        } catch (IOException e) {
////            e.printStackTrace();
////        } catch (ClassNotFoundException e) {
////            e.printStackTrace();
////        }
////    }

    // 饿汉式
//    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Class objectClass = HungrySingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true); // 跳过权限检查
//        HungrySingleton singleton = HungrySingleton.getInstance();
//        HungrySingleton newSingleton = (HungrySingleton) constructor.newInstance();
//        System.out.println(singleton);
//        System.out.println(newSingleton);
//        System.out.println(newSingleton == singleton);
//    }

    // 静态内部类
//    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Class objectClass = StaticInnerClassSingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//
//        StaticInnerClassSingleton singleton = StaticInnerClassSingleton.getInstance();
//        StaticInnerClassSingleton newSingleton = (StaticInnerClassSingleton) constructor.newInstance();
//        System.out.println(singleton);
//        System.out.println(newSingleton);
//        System.out.println(singleton == newSingleton);
//    }

    // 懒汉式
//    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
//        Class objectClass = LazySingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//
//
//        LazySingleton newSingleton = (LazySingleton) constructor.newInstance();
//        LazySingleton singleton = LazySingleton.getInstance();
//
////        Field flag = singleton.getClass().getDeclaredField("flag");
////        flag.setAccessible(true);
////        flag.set(singleton,true);
//
//
//
//        System.out.println(singleton);
//        System.out.println(newSingleton);
//        System.out.println(singleton == newSingleton);
//    }

    // 枚举类-序列化测试
//    public static void main(String[] args) {
//        EnumInstance singleton = EnumInstance.getInstance();
//        File file = new File("temp");
//        try(
//
//                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("temp"));
//                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))
//        ){
//            oos.writeObject(singleton);
//
//            EnumInstance newSingleton = (EnumInstance) ois.readObject();
//            System.out.println(singleton);
//            System.out.println(newSingleton);
//            System.out.println(newSingleton == singleton);
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

    // 枚举类-反射测试
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class objectClass = EnumInstance.class;
        Constructor constructor = objectClass.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);


        EnumInstance newSingleton = (EnumInstance) constructor.newInstance("hello",2);
        EnumInstance singleton = EnumInstance.getInstance();

        System.out.println(singleton);
        System.out.println(newSingleton);
        System.out.println(singleton == newSingleton);
    }
}
