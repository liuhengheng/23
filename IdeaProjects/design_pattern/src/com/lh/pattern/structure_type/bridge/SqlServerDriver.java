package com.lh.pattern.structure_type.bridge;

/**
 * SqlServer数据库实现类
 * 
 * @author liuheng
 * 
 */
public class SqlServerDriver implements Driver {

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("连接SQLServer数据库");
	}

}
