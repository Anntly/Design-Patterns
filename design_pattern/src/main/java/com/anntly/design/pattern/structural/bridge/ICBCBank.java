package com.anntly.design.pattern.structural.bridge;

/**
 * @author soledad
 * @Title: ICBCBank
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/1622:24
 */
public class ICBCBank extends Bank {

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        account.openAccount();
        return account;
    }
}
