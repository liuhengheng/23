package com.lh.pattern.behavior_type.interpret;

/**
 * 解释器模式
 */
public class Main {
    public static void main(String[] args) {
        String instruction = "down run 10 and left move 20";
        InstructionHandler iHandler = new InstructionHandler();
        iHandler.Handle(instruction);
        String outString = iHandler.output();
        System.out.println(outString);
    }
}
