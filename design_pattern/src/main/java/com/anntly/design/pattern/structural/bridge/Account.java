package com.anntly.design.pattern.structural.bridge;

/**
 * @author soledad
 * @Title: Account
 * @ProjectName design_pattern
 * @Description: 账号
 * @date 2019/7/1622:07
 */
public interface Account {

    Account openAccount(); // 打开账号

    void showAccountType(); // 账号类型
}
