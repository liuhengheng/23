package com.lh.pattern.structure_type.component;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite : 定义枝节点行为，用来存储子部件，在 Component 接口中实现与子部件相关的操作。例如 Add 和 Remove。
 * 
 * @author liuheng
 * 
 */
public class Composite extends Component {
	private List<Component> children = new ArrayList<Component>();

	public Composite(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Component c) {
		children.add(c);

	}

	@Override
	public void remove(Component c) {
		children.remove(c);
	}

	@Override
	public void display(int depth) {
		String temp = "";
		for (int i = 0; i < depth; i++)
			temp += '-';
		System.out.println(temp + name);

		for (Component c : children) {
			c.display(depth + 2);
		}
	}

}
