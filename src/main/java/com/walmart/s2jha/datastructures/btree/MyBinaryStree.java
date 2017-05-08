package com.walmart.s2jha.datastructures.btree;

public class MyBinaryStree<T extends Comparable<T>> {

	T root;
	
	public void addTo(BinaryNode node,T value){
		if(value.compareTo((T)node.value)<0){
			if(node.left==null){
				node.left = new BinaryNode(value);
			}else{
				addTo(node.left, value);
			}
		}else{
			if(node.right==null){
				node.right = new BinaryNode(value);
			}else{
				addTo(node.right, value);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
