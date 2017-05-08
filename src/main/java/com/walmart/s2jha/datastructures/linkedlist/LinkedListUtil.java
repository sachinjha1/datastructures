package com.walmart.s2jha.datastructures.linkedlist;

public class LinkedListUtil {
	public static void main(String agrs[]) {
		// {3, null}
		Node first = new Node(3);
		// {5, null}
		Node middle = new Node(5);
		// {3, *}-->{5,null}
		first.next = middle;
		
		Node last = new Node(7);
		// {3, *}-->{5,null}
		middle.next = last;
		
		print(first);
	}
	
	public static void print(Node node){
		while(node!=null){
		System.out.println(node.value);
		node = node.next;
		}
	}
	
	public void addFirst(){
		
	}
}
