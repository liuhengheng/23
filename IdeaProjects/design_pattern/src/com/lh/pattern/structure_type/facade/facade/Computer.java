package com.lh.pattern.structure_type.facade.facade;

import com.lh.pattern.structure_type.facade.children.Cpu;
import com.lh.pattern.structure_type.facade.children.Disk;
import com.lh.pattern.structure_type.facade.children.Memory;

 
 

/**
 * 门面类 facade核心
 * 
 * @author liuheng
 * 
 */
public class Computer {
	Cpu cpu;
	Disk disk;
	Memory memory;

	public Computer() {
		cpu = new Cpu();
		disk = new Disk();
		memory = new Memory();
	}

	public void start() {
		cpu.start();
		disk.start();
		memory.start();
	}

	public void shutDown() {
		cpu.shutDown();
		disk.shutDown();
		memory.shutDown();
	}

}
