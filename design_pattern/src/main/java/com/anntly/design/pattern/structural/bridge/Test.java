package com.anntly.design.pattern.structural.bridge;

/**
 * @author soledad
 * @Title: Test
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/1622:25
 */
public class Test {

    public static void main(String[] args) {
        Bank abcBank = new ABCBank(new DepositAccount());
        Bank abcBank1 = new ABCBank(new SavingAccount());

        Bank icbcBank = new ICBCBank(new DepositAccount());
        Bank icbcBank1 = new ICBCBank(new SavingAccount());

        Account account = abcBank.openAccount();
        account.showAccountType();

        Account account1 = abcBank1.openAccount();
        account1.showAccountType();

        Account account2 = icbcBank.openAccount();
        account2.showAccountType();

        Account account3 = icbcBank.openAccount();
        account3.showAccountType();
    }
}
