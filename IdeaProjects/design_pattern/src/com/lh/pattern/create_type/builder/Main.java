package com.lh.pattern.create_type.builder;

/**
 * 构造者模式
 * 
 * @author liuheng
 * 
 */
public class Main {
	public static void main(String[] args) {
		Student student = new Student.Builder().name("ddd").passwd("aaa")
				.build();
		System.out.println(student.getName() + "" + student.getPasswd());
	}
}
