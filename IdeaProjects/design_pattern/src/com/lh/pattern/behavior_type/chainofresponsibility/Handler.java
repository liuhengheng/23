package com.lh.pattern.behavior_type.chainofresponsibility;

public abstract class Handler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public abstract void operator();
}
