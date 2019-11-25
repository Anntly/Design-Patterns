package com.anntly.design.pattern.behavioral.chainofresponsibility;

/**
 * @author soledad
 * @Title: Approver
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/2223:33
 */
public abstract class Approver {

    protected String name;

    protected Approver approver; // 指向下一个

    public Approver(String name) {
        this.name = name;
    }

    public Approver setNextApprover(Approver nextApprover){
        this.approver = nextApprover;
        return this.approver;
    }

    public abstract void think(Man man);
}
