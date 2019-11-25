package com.anntly.design.pattern.creational.singleton;

/**
 * @author soledad
 * @Title: LazyDoubleCheckSingleton
 * @ProjectName design_pattern
 * @Description: Double Check
 * @date 2019/7/421:20
 */
public class LazyDoubleCheckSingleton {

    private static volatile LazyDoubleCheckSingleton singleton = null;

    private LazyDoubleCheckSingleton(){

    }

    public static LazyDoubleCheckSingleton getInstance(){
        if(null == singleton){
            synchronized (LazyDoubleCheckSingleton.class){
                if(null == singleton){
                    singleton = new LazyDoubleCheckSingleton();
                    // 1. 分配内存给这个对象
                    // 2. 初始化对象
                    // 3. 设置LazyDoubleCheckSingleton 指向岗分配的内存
                    // intra-thread semantics
                }
            }
        }
        return singleton;
    }
}
