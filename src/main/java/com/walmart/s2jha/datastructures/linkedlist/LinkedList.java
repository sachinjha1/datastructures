package com.walmart.s2jha.datastructures.linkedlist;

import java.util.Iterator;

public class LinkedList {
public int count;	
public Node head;
public Node tail;

public void remove(Object item){
	Node prev = null;
	Node cur = head;
	while(cur != null){
		if(cur.value.equals(item)){
			if(prev==null){
				removeFirst();
			}else{
				prev.next=cur.next;
				if(cur.next==null){
					tail = prev;
				}
			}
		}else{
			prev = cur;
			cur = cur.next;
		}
	}
}

public void addFirst(Node node){
	Node temp = head;
	head = node;
	head.next = temp;
	count++;
	if(count==1){
		tail=head;
	}
	
}

public void removeFirst(){
	if(count>1){
		head = head.next;
		count--;
	}else if(count==1){
		head=null;
		tail=null;
	}
}

public void addLast(Node node){
	Node temp = tail;
	tail = node;
	count++;
	if(count==1){
		head=tail;
	}else{
		temp.next = tail;
	}
	
}

public Iterator<Node> iterator(){
	return new LinkedListIterator(head);
}


public void removeLast(){
	if(count>1){
		Node currentNode = head;
		while(currentNode.next!=tail){
			currentNode = head.next;
		}
		//currentNode is 1 before tail
		currentNode.next=null;
		tail = currentNode;
		count--;
	}else if(count==1){
		head = null; tail =null;
	}
	
}

public static void main(String arg[]){
	System.out.println("Testing using addFirst");
	LinkedList headList = new LinkedList();
	headList.addFirst(new Node<Integer>(3));
	headList.addFirst(new Node<Integer>(5));
	headList.addFirst(new Node<String>("Seven"));
	LinkedListUtil.print(headList.head);
	
	System.out.println("Testing using addLast");
	LinkedList tailList = new LinkedList();
	tailList.addLast(new Node<Integer>(103));
	tailList.addLast(new Node<Integer>(111));
	tailList.addLast(new Node<String>("Barah"));
	LinkedListUtil.print(tailList.head);
	
	System.out.println("Removing last element of addFirst");
	headList.removeLast();
	LinkedListUtil.print(headList.head);
	
	System.out.println("Removing last element of addLast");
	tailList.removeLast();
	LinkedListUtil.print(tailList.head);
	
	Iterator<Node> it = headList.iterator();
	while(it.hasNext()){
		System.out.println("Through Iterator--> "+it.next().value);
	}
	
}

}
