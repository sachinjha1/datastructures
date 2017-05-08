package com.walmart.s2jha.datastructures.linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedListIterator implements Iterator<Node>{
	
	public LinkedListIterator(Node head){
		nextNode = head;
	}

	public Node nextNode = null;
	
	public boolean hasNext() {
		if(nextNode!=null){
			return true;
		}
		return false;
	}

	public Node next() {
		Node currentNode = nextNode;
		if(hasNext()){
			nextNode = nextNode.next;
		}else{
			throw new NoSuchElementException();
		}
		return currentNode;
	}

}
