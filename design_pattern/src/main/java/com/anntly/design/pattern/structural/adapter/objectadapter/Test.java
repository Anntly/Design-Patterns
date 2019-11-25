package com.anntly.design.pattern.structural.adapter.objectadapter;

/**
 * @author soledad
 * @Title: Test
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/1021:20
 */
public class Test {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
