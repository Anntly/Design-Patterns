package com.anntly.design.pattern.behavioral.mediator;

/**
 * @author soledad
 * @Title: Test
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/2222:08
 */
public class Test {

    public static void main(String[] args) {
        User user = new User("小红");
        User user1 = new User("小丁");

        user.sendMsg("七万个嫂夫人挨个了biu");
        user1.sendMsg("我不草拟吧");
    }
}
