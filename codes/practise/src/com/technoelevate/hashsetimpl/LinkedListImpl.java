	package com.technoelevate.hashsetimpl;

public class LinkedListImpl {	
	Node head;
	public void insert(int data) {
		Node node = new Node();
		node.data=data;
		node.next=null;
		if(head==null) {
			head=node;
		}else {
			Node n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
			
		}
	}
	@Override
	public String toString() {
		return "LinkedListImpl [head=" + head + "]";
	}
	
	
}
