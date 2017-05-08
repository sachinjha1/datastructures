package com.walmart.s2jha.datastructures.stack;

import java.util.LinkedList;

public class MyStack<T> {
	
	private LinkedList list = null;
	
	public MyStack(){
		list = new LinkedList<T>();
	}

	public static void main(String[] args) {
		

	}
	
	public void push(T item){
		list.addFirst(item);
	}
	
	public T pop(){
		T value = (T)list.getFirst();
		list.removeFirst();
		return (T)list.getFirst();
	}
	
	public T peek(){
		return (T)list.getFirst();
	}

}
