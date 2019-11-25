package com.anntly.design.pattern.structural.adapter;

/**
 * @author soledad
 * @Title: PowerAdapter
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/1021:29
 */
public class PowerAdapter extends AC220 implements DC5{


    @Override
    public int lowOutput() {
        int U = super.output();
        int O = U/44;
        return O;
    }
}
