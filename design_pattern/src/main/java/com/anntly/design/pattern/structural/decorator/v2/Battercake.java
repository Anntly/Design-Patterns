package com.anntly.design.pattern.structural.decorator.v2;

/**
 * @author soledad
 * @Title: Battercake
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/922:52
 */
public class Battercake  extends AbstractBattercake
{
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
