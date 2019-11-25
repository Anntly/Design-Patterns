package com.anntly.design.pattern.structural.decorator.v2;

/**
 * @author soledad
 * @Title: SausageDecorator
 * @ProjectName design_pattern
 * @Description:
 * @date 2019/7/923:01
 */
public class SausageDecorator extends AbstractDecorator{

    public SausageDecorator(AbstractBattercake abstractBattercake) {
        super(abstractBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加个烤肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
