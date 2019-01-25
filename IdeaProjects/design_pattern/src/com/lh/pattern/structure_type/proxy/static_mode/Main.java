package com.lh.pattern.structure_type.proxy.static_mode;
 
/**
 * 静态代理模式
 * @author liuheng
 *
 */
public class Main {
	public static void main(String[] args){
		UserDaoProxy proxy = new UserDaoProxy(new UserDaoImpl());
		
		proxy.save();
	}
}
