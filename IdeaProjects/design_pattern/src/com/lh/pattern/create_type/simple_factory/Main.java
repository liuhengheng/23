package com.lh.pattern.create_type.simple_factory;

/**
 * 简单工厂模式
 * 
 * @author liuheng
 * 
 */
public class Main {
	public static void main(String[] args) {
		// 实现统一管理、专业化管理
		Car car = new SimpleFactory().getCar("Bmw");
		System.out.println("该工厂生产了：" + car.getName());
	}
}
