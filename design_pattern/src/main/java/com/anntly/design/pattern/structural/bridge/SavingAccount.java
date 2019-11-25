package com.anntly.design.pattern.structural.bridge;

/**
 * @author soledad
 * @Title: SavingAccount
 * @ProjectName design_pattern
 * @Description: 活期账号
 * @date 2019/7/1622:11
 */
public class SavingAccount implements Account{

    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}
