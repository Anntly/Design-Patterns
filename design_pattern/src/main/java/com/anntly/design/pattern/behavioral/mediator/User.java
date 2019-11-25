package com.anntly.design.pattern.behavioral.mediator;


/**
 * @author soledad
 * @Title: User
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/2222:05
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendMsg(String msg){
        ChatGroup.showMessage(this,msg);
    }

}
