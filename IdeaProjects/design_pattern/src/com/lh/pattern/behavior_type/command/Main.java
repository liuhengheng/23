package com.lh.pattern.behavior_type.command;

public class Main {
    public static void main(String[] args) {
        // 创建命令的接受者
        Receiver receiver = new Receiver();
        // 创建命令对象，并设定它的接受者
        Command command = new ConcreteCommand(receiver);
        // 创建命令执行者，并将相应的命令作为参数传递给Invoker
        Invoker invoker = new Invoker(command);
        // 执行
        invoker.excuteCommmand();
        invoker.undoCommand();
    }

}
