package com.anntly.design.pattern.behavioral.command;

/**
 * @author soledad
 * @Title: ConcreteCommand
 * @ProjectName design_pattern
 * @Description: 实际命令
 * @date 2019/7/2214:24
 */
public class ConcreteCommand implements Command{

    private Receiver receiver;

    @Override
    public void execute() {
        receiver.action();
    }
}
