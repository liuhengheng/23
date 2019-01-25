package com.lh.pattern.behavior_type.memento;
/**
 * 负责人角色，
 * 控制备份
 */
public class CaretakePlayer {
    //游戏备份对象
    private GameBackup backup;

    public GameBackup getBackup() {
        return backup;
    }

    public void setBackup(GameBackup backup) {
        this.backup = backup;
    }
}
