package com.merkle.sokrati.util;

import java.util.ArrayList;
import java.util.List;

public class SokratiQueue {

	private List<SokratiTree> list;
	private int pos = -1;
	private Integer sum = 0;
	
	public SokratiQueue() {
		this.list = new ArrayList<SokratiTree>();
	}
	
	public int enqueue(SokratiTree value) {
		this.list.add(value);
		if(value.getNodeValue() != null)
			this.sum += value.getNodeValue();
		return this.pos++;
	}
	public SokratiTree dequeue() {
		if(this.pos == -1)
			return null;
		this.pos--;
		if(this.list.get(0).getNodeValue() != null)
			this.sum -= this.list.get(0).getNodeValue();
		return this.list.remove(0);
	}
	public boolean hasElements() {
		return (this.sum != 0);
	}
	
}
