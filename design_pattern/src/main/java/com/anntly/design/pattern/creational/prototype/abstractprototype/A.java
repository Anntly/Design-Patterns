package com.anntly.design.pattern.creational.prototype.abstractprototype;

/**
 * @author soledad
 * @Title: A
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/714:07
 */
public abstract class A implements Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
