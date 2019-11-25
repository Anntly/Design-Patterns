package com.anntly.design.pattern.structural.decorator.v1;

/**
 * @author soledad
 * @Title: BattercakeWithEggAndSausage
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/922:44
 */
public class BattercakeWithEggAndSausage extends BattercakeWithEgg{

    @Override
    public String getDesc() {
        return super.getDesc() + "加根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
