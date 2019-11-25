package com.anntly.design.pattern.structural.decorator.v2;

/**
 * @author soledad
 * @Title: EggDecorator
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/923:00
 */
public class EggDecorator extends AbstractDecorator{

    public EggDecorator(AbstractBattercake abstractBattercake) {
        super(abstractBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
