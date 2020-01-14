package com.merkle.sokrati.util;

import java.util.ArrayList;
import java.util.List;

public class SokratiTree {

	private Integer value;
	private SokratiTree leftChild;
	private SokratiTree rightChild;

	public SokratiTree(Integer value) {
		this.value = value;
		this.leftChild = null;
		this.rightChild = null;
	}
	public SokratiTree(Integer value, SokratiTree leftChild, SokratiTree rightChild) {
		this.value = value;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}
	public Integer getNodeValue() {
		return value;
	}
	public void setNodeValue(int value) {
		this.value = value;
	}
	public SokratiTree getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(SokratiTree leftChild) {
		this.leftChild = leftChild;
	}
	public SokratiTree getRightChild() {
		return rightChild;
	}
	public void setRightChild(SokratiTree rightChild) {
		this.rightChild = rightChild;
	}
	
	public int getHeight(List<Integer> list, Integer value) {
		int pos = list.indexOf(value);
		return (int) (Math.ceil(Math.log(pos+2)/Math.log(2)));
	}
	
	public List<Integer> getListFormat(SokratiTree root){
		List<Integer> list = new ArrayList<Integer>();
		if(root == null)
			return list;
		SokratiQueue queue = new SokratiQueue();
		queue.enqueue(root);
		while(queue.hasElements()) {
			root = queue.dequeue();
			list.add(root.getNodeValue());
			
			if(root.getLeftChild() == null)
				root.setLeftChild(new SokratiTree(null));
			if(root.getRightChild() == null)
				root.setRightChild(new SokratiTree(null));
			
			queue.enqueue(root.getLeftChild());
			queue.enqueue(root.getRightChild());

		}
		return list;
	}
}
