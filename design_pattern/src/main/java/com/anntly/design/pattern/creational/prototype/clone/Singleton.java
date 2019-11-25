package com.anntly.design.pattern.creational.prototype.clone;

/**
 * @author soledad
 * @Title: Singleton
 * @ProjectName design_pattern
 * @Description:
 * @date 2019/7/714:47
 */
public class Singleton implements Cloneable{

    private static final Singleton singleton;

    static {
        singleton = new Singleton();
    }

    private Singleton(){}

    public static Singleton getInstance(){
        return singleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
