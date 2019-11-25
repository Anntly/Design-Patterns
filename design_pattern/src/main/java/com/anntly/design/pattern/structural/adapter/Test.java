package com.anntly.design.pattern.structural.adapter;

/**
 * @author soledad
 * @Title: Test
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/1021:30
 */
public class Test {

    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        System.out.println("输出电压是(V):"+dc5.lowOutput());
    }
}
