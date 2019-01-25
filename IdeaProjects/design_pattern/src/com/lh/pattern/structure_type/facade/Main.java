package com.lh.pattern.structure_type.facade;

import com.lh.pattern.structure_type.facade.facade.Computer;

/**
 * 客户端类 外观模式
 * 
 * @author liuheng
 * 
 */
public class Main {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.start();
		computer.shutDown();
	}

}
