package com.merkle.sokrati.dao;

import java.util.List;
import java.util.Scanner;

import com.merkle.sokrati.util.SokratiTree;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SokratiTree tree1 = new SokratiTree(5);
		SokratiTree tree2 = new SokratiTree(2);
		SokratiTree tree3 = new SokratiTree(3);
		SokratiTree tree4 = new SokratiTree(7);
		SokratiTree tree5 = new SokratiTree(1);
		SokratiTree tree6 = new SokratiTree(9);
		SokratiTree tree7 = new SokratiTree(4);
		SokratiTree tree8 = new SokratiTree(6);
		
		tree1.setLeftChild(tree2);
		tree1.setRightChild(tree3);
		
		tree2.setLeftChild(tree4);
		tree4.setLeftChild(tree6);
		
		tree3.setRightChild(tree5);
		tree5.setLeftChild(tree7);
		tree5.setRightChild(tree8);
		
		List<Integer> list = tree1.getListFormat(tree1);
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter the element value");
		int val1 = Integer.parseInt(sr.nextLine());
		System.out.println("Enter the element value");
		int val2 = Integer.parseInt(sr.nextLine());
		sr.close();
		
		int pos1 = tree1.getHeight(list, val1);
		int pos2 = tree1.getHeight(list, val2);
		if(pos1 == pos2)
			System.out.println((int) Math.abs(list.indexOf(val1) - list.indexOf(val2)) - 1);
		else
			System.out.println("Provided elements don't exists on the same level");
		
		sr.close();
	}

}
