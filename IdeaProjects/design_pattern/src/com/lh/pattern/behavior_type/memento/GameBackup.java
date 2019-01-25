package com.lh.pattern.behavior_type.memento;

public class GameBackup {
    private String name;
    private int hp;
    private int mp;
    private int level;

    public GameBackup(String name, int hp, int mp, int level) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public int getLevel() {
        return level;
    }
}
