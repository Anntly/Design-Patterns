package com.anntly.design.pattern.behavioral.chainofresponsibility;

/**
 * @author soledad
 * @Title: MotherApprover
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/2223:40
 */
public class MotherApprover extends Approver{

    public MotherApprover(String name) {
        super(name);
    }

    @Override
    public void think(Man man) {
        if(!man.isHasRoom()){
            System.out.println("我在考虑考虑");
        }else {
            System.out.println("小伙子，"+this.name + "阿姨看好你");
            this.approver.think(man);
        }
    }
}
