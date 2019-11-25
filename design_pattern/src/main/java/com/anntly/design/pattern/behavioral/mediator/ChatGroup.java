package com.anntly.design.pattern.behavioral.mediator;


/**
 * @author soledad
 * @Title: ChatGroup
 * @ProjectName design_pattern
 * @Description: 聊天室
 * @date 2019/7/2222:05
 */
public class ChatGroup {

    public static void showMessage(User user,String msg){
        System.out.println(System.currentTimeMillis() + "   " +user.getName()+"发出信息:"+msg);
    }
}
