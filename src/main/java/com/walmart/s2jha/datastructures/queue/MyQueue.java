package com.walmart.s2jha.datastructures.queue;

import java.util.LinkedList;

public class MyQueue<T> {
	
	private LinkedList<T> list;
	
	public MyQueue(){
		list = new LinkedList<>();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void enqueue(T item){
		list.addLast(item);
	}

	public T dequeue(){
		T item = list.getFirst();
		list.removeFirst();
		return item;
	}
}
