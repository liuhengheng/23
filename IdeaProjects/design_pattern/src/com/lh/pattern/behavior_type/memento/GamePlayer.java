package com.lh.pattern.behavior_type.memento;

/**
 * 发起人角色，
 * 用来储存需要备份的游戏角色信息和行为
 */
public class GamePlayer {
    private String name;//
    private int hp;//血量
    private int mp;//精气量
    private int level;//等级

    public GamePlayer(String name, int hp, int mp, int level) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.level = level;
    }

    //保存备份角色信息
    public GameBackup saveBackup() {
        System.out.println("保存游戏角色备份。。。");
        return new GameBackup(name, hp, mp, level);
    }

    //恢复游戏角色
    public void resumePlayer(GameBackup backup) {
        name = backup.getName();
        hp = backup.getHp();
        mp = backup.getMp();
        level = backup.getLevel();
    }

    //闯关
    public void killBoss() {
        System.out.println(name + "开始打Boss");
        double hpBoss = 100;
        while (hp > 0) {
            System.out.println(name + "使用技能攻击Boss");
            hpBoss = hpBoss - Math.random() * 80;
            if (hpBoss <= 0) {
                break;
            }
            mp = mp - 30;
            System.out.println("剩余血量：" + hp + "\t剩余精气量" + mp);

            System.out.println("Boss攻击" + name);
            hp = hp - 50;
        }

        if (hp <= 0) {
            System.out.println("游戏角色：" + name + "被Boss杀死，Boss还有+" + (int) hpBoss + "+血。");
        } else if (hpBoss <= 0) {
            System.out.println("游戏角色：" + name + "杀死Boss开始下一关。");
        }

    }

    @Override
    public String toString() {
        return "游戏角色名：" + name + "\n" +
                "血量：" + hp + "\n" +
                "精气量" + "\n" +
                "等级" + level + "\n";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
