package com.synechron.datastructure;

public class SinglyLinkedList<E> {
	private Node<E> head;
	private Node<E> tail;

	class Node<E> {
		E data;
		Node<E> next;

		public Node(E data, Node<E> next) {
			super();
			this.data = data;
			this.next = next;
		}

	}

	public void insert(E data) {
		Node<E> newNode = createNode(data);
		if (this.head == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			tail.next = newNode;
			tail = tail.next;
		}

	}

	public E delete(E data) {
		Node<E> current = this.head;
		Node<E> previous = null;
		if (current != null && current.data.equals(data)) {
			if (this.tail.data.equals(data))
				this.tail = previous;
			this.head = this.head.next;
			return this.head.data;
		}
		previous = current;
		while (current != null) {
			current = current.next;

			if (current != null && data.equals(current.data)) {
				if (this.tail.data.equals(data))
					this.tail = previous;
				previous.next = current.next;
				return current.data;
			}
			previous = current;

		}
		return null;
	}

	public String traverse() {
		Node<E> current = this.head;

		if (current == null)
			return null;
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		while (current != null) {
			sb.append(current.data).append(",");
			current = current.next;
		}
		return sb.substring(0, sb.lastIndexOf(",")) + "]";

	}

	public Node<E> createNode(E data) {
		return new Node<E>(data, null);
	}

	public void insertAtBegining(E data) {
		Node<E> current = this.head;
		Node<E> newNode = createNode(data);
		if (current == null) {
			this.head = newNode;
			this.tail = this.head;
		} else {
			
			newNode.next = current;
			this.head = newNode;
		}
	}
	
	public void insertAtLast(E data){
		Node<E> lastNode=this.tail;
		Node<E> newNode=createNode(data);
		if(lastNode==null){
			this.head=newNode;
			this.tail=this.head;
		}
		else{
			lastNode.next=newNode;
			this.tail=newNode;
		}
	}
	
	public void reverse(){
		Node<E> current=this.head;
		Node<E> previous=null;
		Node<E> next=null;
		while(current!=null){
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		this.tail=this.head;
		this.head=previous;
	}

	public static void main(String[] args) {
		SinglyLinkedList<Integer> sList = new SinglyLinkedList<>();
		sList.insertAtBegining(10);
		sList.insertAtBegining(20);
		 sList.insertAtBegining(30);
		 sList.insert(50);
		System.out.println(sList.traverse());
		//System.out.println(sList.delete(20));
		sList.insertAtBegining(40);
		sList.insertAtLast(60);
		sList.insertAtLast(70);
		sList.insertAtBegining(81);
		sList.delete(81);
		sList.delete(20);
		System.out.println(sList.traverse() + sList.tail.data);
		sList.delete(60);
		//sList.reverse();
		System.out.println(sList.traverse() + sList.tail.data);
		//sList.reverse();
		System.out.println(sList.traverse() + sList.tail.data);

	}
}
