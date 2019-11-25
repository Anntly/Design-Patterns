package com.anntly.design.pattern.structural.decorator.v1;

/**
 * @author soledad
 * @Title: BattercakeWithEgg
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/922:41
 */
public class BattercakeWithEgg  extends Battercake{

    @Override
    public String getDesc() {
        return super.getDesc() + "加个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
