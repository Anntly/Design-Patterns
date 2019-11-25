package com.anntly.design.pattern.structural.adapter.objectadapter;

/**
 * @author soledad
 * @Title: ConcreteTarget
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/1021:13
 */
public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("目标方法");
    }
}
