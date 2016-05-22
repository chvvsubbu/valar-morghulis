package com.subbu.lists;

public class Node {
	
	public Object data;
	public Node left;
	public Node right;
	public Node prev;
	public Node next;
	
	public Node(Object data){
		this.data=data;
	}
	
	public Node(int data){
		this.data=data;
	}
	
	public Node(float data){
		this.data=data;
	}
	
	public Node(char c){
		this.data=c;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return data.toString();
	}
	
	
	
	
	
	

}
