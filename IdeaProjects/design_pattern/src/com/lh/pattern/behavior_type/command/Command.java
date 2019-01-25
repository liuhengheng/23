package com.lh.pattern.behavior_type.command;

/**
 * 第一步：命令接口
 */
public interface Command {
    //执行操作
    public void excute();

    //撤销操作
    public void unDo();
}
