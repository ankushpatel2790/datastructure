package com.synechron.datastructure;

import com.synechron.datastructure.CircularSinglyLinkedList.Node;

public class DoublyLinkedList<E> {
	Node<E> head = null;
	Node<E> tail = null;

	class Node<E> {
		E data;
		Node<E> next = null;
		Node<E> previous = null;

		public Node(E data, Node<E> next, Node<E> previous) {
			super();
			this.data = data;
			this.next = next;
			this.previous = previous;
		}

	}

	public Node<E> createNode(E data) {
		return new Node<E>(data, null, null);
	}

	public void insertAtEnd(E data) {
		Node<E> current = this.tail;
		Node<E> newNode = createNode(data);
		if (current != null) {
			this.head = newNode;
			this.tail = this.head;
		}else{
			current.previous=current;
			current.next=newNode;
			
			
		}
	}

}
