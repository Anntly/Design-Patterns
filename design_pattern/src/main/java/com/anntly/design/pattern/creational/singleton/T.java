package com.anntly.design.pattern.creational.singleton;

/**
 * @author soledad
 * @Title: T
 * @ProjectName design_pattern
 * @Description:
 * @date 2019/7/416:43
 */
public class T implements Runnable{


    @Override
    public void run() {
        //LazySingleton lazySingleton = LazySingleton.getInstance();
        //LazyDoubleCheckSingleton singleton = LazyDoubleCheckSingleton.getInstance();
        StaticInnerClassSingleton singleton = StaticInnerClassSingleton.getInstance();
        System.out.println(singleton);
    }
}
