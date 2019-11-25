package com.anntly.design.pattern.creational.singleton;

/**
 * @author soledad
 * @Title: StaticInnerClassSingleton
 * @ProjectName design_pattern
 * @Description:
 * @date 2019/7/422:40
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton(){
        if(null != InnerClass.singleton){
            throw new RuntimeException("阻止反射创建实例");
        }
    }

    private static class InnerClass{
        private static StaticInnerClassSingleton singleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.singleton;
    }
}
