package com.lh.pattern.behavior_type.memento;

/**
 * 备忘录模式
 * 三个角色
 * 1.发起人（Originator）角色
 * 2.备忘录（Memento）角色
 * 3.负责人（Caretaker）角色
 */
public class Main {
    public static void main(String[] args) {
        //创建人物
        GamePlayer player = new GamePlayer("习伟", 100, 100, 1);
        //控制备份数据的对象
        CaretakePlayer caretakePlayer = new CaretakePlayer();
        //进行备份
        caretakePlayer.setBackup(player.saveBackup());

        //打怪
        player.killBoss();

        //恢复备份
        player.resumePlayer(caretakePlayer.getBackup());
        System.out.println("====================================");
        System.out.println("满血复活。。。");
        System.out.println("====================================");
        //继续打怪
        player.killBoss();
    }
}
