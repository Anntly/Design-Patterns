package com.anntly.design.pattern.creational.singleton;

/**
 * @author soledad
 * @Title: LazySingleton
 * @ProjectName design_pattern
 * @Description: 懒汉时单例模式
 * @date 2019/7/416:25
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null; // 私有属性

    private static boolean flag = true;

    private LazySingleton(){ // 私有构造函数
        if(flag){
            flag = false;
        }else {
            throw new RuntimeException("阻止反射调用构造函数");
        }
    }

    public static LazySingleton getInstance(){ // 暴露获取方法
        synchronized (LazySingleton.class){
            if(null == lazySingleton){
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
    }
}
