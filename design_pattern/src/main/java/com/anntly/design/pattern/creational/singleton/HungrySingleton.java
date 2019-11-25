package com.anntly.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @author soledad
 * @Title: HungrySingleton
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/423:15
 */
public class HungrySingleton implements Serializable {

    private final static HungrySingleton singleton;

    static {
        singleton = new HungrySingleton();
    }

    private HungrySingleton (){
        if(singleton != null){ // 当对象已经存在，阻止创建
            throw new RuntimeException("阻止反射创建实例");
        }
    }

    public static HungrySingleton getInstance(){
        return singleton;
    }

    private Object readResolve(){
        return singleton;
    }
}
