package com.walmart.s2jha.datastructures.btree;

public class BinaryNode<T extends Comparable<T>> {
	public BinaryNode(T value){
		this.value = value;
	}
	BinaryNode left;
	BinaryNode right;
	T value;
}
