package com.synechron.datastructure;

public class CircularSinglyLinkedList<E> {
	Node<E> head;
	Node<E> tail;

	class Node<E> {
		E data;
		Node<E> next;

		public Node(E data, Node<E> next) {
			super();
			this.data = data;
			this.next = next;
		}

	}

	public Node<E> createNode(E data) {
		return new Node<E>(data, null);
	}

	public void insert(E data) {
		Node<E> current = this.tail;
		Node<E> newNode = createNode(data);
		if (current == null) {
			this.head = newNode;
			this.tail = this.head;
			this.tail.next = this.head;
		} else {
			newNode.next = current.next;
			current.next = newNode;
			this.tail = newNode;

		}
	}

	public String traverse() {
		Node<E> current = this.head;

		if (current == null)
			return null;
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		do {
			sb.append(current.data).append(",");
			current = current.next;
		} while (current != this.head);
		return sb.substring(0, sb.lastIndexOf(",")) + "]";

	}

	public void insertAtBegining(E data) {
		Node<E> current = this.head;
		Node<E> newNode = createNode(data);
		if (current == null) {
			this.head = newNode;
			this.tail = this.head;
			this.tail.next = this.head;
		} else {
			newNode.next = current;
			this.head = newNode;
			this.tail.next = newNode;
		}

	}

	public void insertAtSpecificPosition(E data,int pos) throws Exception {
		Node<E> current = this.head;
		Node<E> newNode = createNode(data);
		if (current == null) {
			throw new Exception("List is empty");
		} else {
			do{
				
			}while(true);
			
		}

	}

	public static void main(String[] args) {
		CircularSinglyLinkedList<Integer> cList = new CircularSinglyLinkedList<>();
		cList.insert(10);
		cList.insert(20);
		cList.insertAtBegining(30);
		cList.insertAtBegining(40);
		cList.insert(50);
		System.out.println(cList.traverse());
	}
}
