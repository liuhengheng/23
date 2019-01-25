package com.lh.pattern.structure_type.component;

/**
 * Leaf : 表示叶节点对象。叶子节点没有子节点。
 * 
 * @author liuheng
 * 
 */
public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		System.out.println("Can not add to a leaf");

	}

	@Override
	public void remove(Component c) {
		System.out.println("Can not remove from a leaf");

	}

	@Override
	public void display(int depth) {
		String temp = "";
		for (int i = 0; i < depth; i++)
			temp += '-';
		System.out.println(temp + name);
	}

}
