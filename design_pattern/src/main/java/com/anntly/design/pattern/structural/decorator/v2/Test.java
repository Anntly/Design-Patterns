package com.anntly.design.pattern.structural.decorator.v2;

/**
 * @author soledad
 * @Title: Test
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/923:02
 */
public class Test {

    public static void main(String[] args) {
        // 加两个烤肠
        AbstractBattercake battercake = new SausageDecorator(new SausageDecorator(new Battercake()));
        System.out.println(battercake.getDesc()+" 消费了:"+battercake.cost());

        // 加一根烤肠一个鸡蛋
        AbstractBattercake battercake1 = new SausageDecorator(new EggDecorator(new Battercake()));
        System.out.println(battercake1.getDesc()+" 消费了:"+battercake1.cost());
    }
}
