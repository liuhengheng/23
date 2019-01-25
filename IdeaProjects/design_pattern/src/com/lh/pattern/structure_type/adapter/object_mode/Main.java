package com.lh.pattern.structure_type.adapter.object_mode;
/**
 * 对象适配器模式
 * @author liuheng
 *
 */
public class Main {
	public static void main(String[] args){
		Ps2 a = new Adapter(new Usber());
		a.isPs2();
	}
}
