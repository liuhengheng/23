package com.lh.pattern.structure_type.proxy.cglib_mode;

/**
 * 目标对象,没有实现任何接口
 */
public class UserDao {

    public void save() {
        System.out.println("----已经保存数据!----");
    }
}