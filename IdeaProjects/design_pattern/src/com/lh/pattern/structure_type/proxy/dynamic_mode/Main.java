//package com.lh.pattern.structure_type.proxy.dynamic_mode;
//
//import com.lh.pattern.proxy.static_mode.IUserDao;
//import com.lh.pattern.proxy.static_mode.UserDaoImpl;
///**
// * 动态代理模式
// * @author liuheng
// *
// */
//public class Main {
//	public static void main(String[] args) {
//		// 目标对象
//		IUserDao target = new UserDaoImpl();
//		// 【原始的类型 class cn.itcast.b_dynamic.UserDao】
//		System.out.println(target.getClass());
//
//		// 给目标对象，创建代理对象
//		IUserDao proxy = (IUserDao)new ProxyFactory(target).getProxyInstance();
//		// class $Proxy0 内存中动态生成的代理对象
//		System.out.println(proxy.getClass());
//
//		// 执行方法 【代理对象】
//		proxy.save();
//	}
//}
