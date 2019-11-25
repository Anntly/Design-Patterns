package com.anntly.design.pattern.structural.decorator.v2;

/**
 * @author soledad
 * @Title: AbstractDecorator
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/922:54
 */
public class AbstractDecorator extends AbstractBattercake{

    private AbstractBattercake abstractBattercake;

    public AbstractDecorator(AbstractBattercake abstractBattercake){
        this.abstractBattercake = abstractBattercake;
    }

    @Override
    protected String getDesc() {
        return this.abstractBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.abstractBattercake.cost();
    }
}
