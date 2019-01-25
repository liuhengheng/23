package com.lh.pattern.behavior_type.state;

/**
 * 状态模式
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        State startState = new StartState();
        context.setState(startState);
        startState.doAction(context);

        State stopState = new StopState();
        context.setState(stopState);
        stopState.doAction(context);
    }
}
