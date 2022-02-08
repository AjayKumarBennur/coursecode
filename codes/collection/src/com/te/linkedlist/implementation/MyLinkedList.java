package com.te.linkedlist.implementation;

import java.util.Iterator;

public class MyLinkedList {
	Node head;
	public void insert(int data) {
		Node node = new Node();
		node.data= data;
		if(head==null) {
			head = node;
		}else {
			Node n = head;
			while(n.next!=null) {
				n= n.next;
			}
			n.next= node;
		}
	}
	
	public Iterator iterator() {
		return new MyItr();
	}
	@Override
	public String toString() {
		return "MyLinkedList [head=" + head + "]";
	}
	
	private class MyItr implements Iterator{
		
		Node n = head;
		
		@Override
		public boolean hasNext() {
		  if(n.next!=null) {
			return  true;
		  }
		  return false;
		  
		}

		@Override
		public Object next() {
			Object obj = n.data;
			n=n.next;
			return obj;
		}
		
	}
}
