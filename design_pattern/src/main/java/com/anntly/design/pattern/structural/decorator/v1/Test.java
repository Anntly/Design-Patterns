package com.anntly.design.pattern.structural.decorator.v1;

/**
 * @author soledad
 * @Title: Test
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/922:48
 */
public class Test {

    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc()+" 消费了:"+battercake.cost());

        BattercakeWithEgg battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc()+" 消费了:"+battercakeWithEgg.cost());

        BattercakeWithEggAndSausage battercakeWithEggAndSausage = new BattercakeWithEggAndSausage();
        System.out.println(battercakeWithEggAndSausage.getDesc()+" 消费了:"+battercakeWithEggAndSausage.cost());
    }
}
