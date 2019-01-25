package com.lh.pattern.structure_type.bridge;
/**
 * 桥接模式
 * @author liuheng
 *
 */
public class Main {
	public static void main(String[] args) {
		Bridge mysqlBridge = new MyBridge();
		Driver mysqlDriver = new MysqlDriver();
		mysqlBridge.setDriver(mysqlDriver);
		mysqlBridge.connect();

		Driver sqlserverDriver = new SqlServerDriver();
		mysqlBridge.setDriver(sqlserverDriver);
		mysqlBridge.connect();

	}
}
