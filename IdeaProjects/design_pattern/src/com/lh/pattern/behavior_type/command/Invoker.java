package com.lh.pattern.behavior_type.command;

/**
 * 第四步：定义Invoker，要求该命令执行这个请求。
 */
public class Invoker {
    // 调用者持有一个命令对象
    Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    // 执行命令
    public void excuteCommmand() {
        command.excute();
    }

    // 撤销命令
    public void undoCommand() {
        command.unDo();
    }
}
