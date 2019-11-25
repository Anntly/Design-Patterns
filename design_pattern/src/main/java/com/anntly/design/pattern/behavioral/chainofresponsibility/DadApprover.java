package com.anntly.design.pattern.behavioral.chainofresponsibility;

/**
 * @author soledad
 * @Title: DadApprover
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/2223:48
 */
public class DadApprover extends Approver{

    public DadApprover(String name) {
        super(name);
    }

    @Override
    public void think(Man man) {
        if(!man.isHasCar()){
            System.out.println("我在考虑考虑");
        }else {
            System.out.println("小伙子，"+this.name + "叔叔看好你");
            this.approver.think(man);
        }
    }
}
