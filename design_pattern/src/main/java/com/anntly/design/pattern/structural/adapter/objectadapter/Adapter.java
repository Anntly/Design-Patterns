package com.anntly.design.pattern.structural.adapter.objectadapter;

/**
 * @author soledad
 * @Title: Adapter
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/1021:19
 */
public class Adapter implements Target{

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
