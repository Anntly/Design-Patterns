package com.anntly.design.pattern.structural.adapter.classadapter;

/**
 * @author soledad
 * @Title: Adapter
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/1021:17
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        // 实际调用的是Adaptee的方法
        super.adapteeRequest();
    }
}
