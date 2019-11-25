package com.anntly.design.pattern.structural.bridge;

/**
 * @author soledad
 * @Title: Bank
 * @ProjectName design_pattern
 * @Description: 银行抽象类
 * @date 2019/7/1622:20
 */
public abstract class Bank {

    protected Account account;

    public Bank(Account account){
        this.account = account;
    }

    abstract Account openAccount();
}
