package com.anntly.design.pattern.behavioral.command;

/**
 * @author soledad
 * @Title: Invoker
 * @ProjectName design_pattern
 * @Description: 请求发送者
 * @date 2019/7/2214:21
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    // 业务方法，用于调用命令类的execute()方法
    public void call(){
        command.execute();
    }
}
