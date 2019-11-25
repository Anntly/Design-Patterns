package com.anntly.design.pattern.structural.bridge;

/**
 * @author soledad
 * @Title: ABCBank
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/1622:21
 */
public class ABCBank extends Bank{

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();
        return account;
    }
}
