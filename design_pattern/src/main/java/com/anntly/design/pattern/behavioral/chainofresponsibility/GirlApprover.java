package com.anntly.design.pattern.behavioral.chainofresponsibility;

/**
 * @author soledad
 * @Title: GirlApprover
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/2223:50
 */
public class GirlApprover extends Approver{

    public GirlApprover(String name) {
        super(name);
    }

    @Override
    public void think(Man man) {
        if(man.isHasMoney()){
            System.out.println(man.getName()+"♡"+this.name);
        }else {
            System.out.println("你是个好人");
        }
    }
}
