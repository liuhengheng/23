package com.lh.pattern.structure_type.bridge;

/**
 * Mysql数据库实现类
 * 
 * @author liuheng
 * 
 */
public class MysqlDriver implements Driver {

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("连接Mysql数据库");
	}

}
