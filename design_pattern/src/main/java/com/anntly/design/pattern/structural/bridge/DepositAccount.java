package com.anntly.design.pattern.structural.bridge;

/**
 * @author soledad
 * @Title: DepositAccount
 * @ProjectName design_pattern
 * @Description: 定期账号
 * @date 2019/7/1622:08
 */
public class DepositAccount implements Account{

    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
