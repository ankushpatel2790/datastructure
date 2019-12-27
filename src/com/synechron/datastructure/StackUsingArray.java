package com.synechron.datastructure;

public class StackUsingArray<E> {
	Object[] elementArray = null;
	int top = -1;
	int size;

	StackUsingArray(int size) {
		this.size = size;
		this.elementArray = new Object[size];
	}

	public StackUsingArray() {
		this(10);
	}

	public synchronized void push(E element) throws Exception {
		if (isFull())
			throw new Exception("Stack has been full");
		this.elementArray[++top] = element;
	}

	public boolean isEmpty() {
		return top < 0;
	}

	public boolean isFull() {
		return top > size;
	}

	public synchronized E pop() throws Exception {

		if (isEmpty())
			throw new Exception("Stack is empty!");
		E element = (E) this.elementArray[top--];
		return element;
	}

	public synchronized E peek() throws Exception {
		if (isFull())
			throw new Exception("Stack has been full");
		return (E) this.elementArray[top];
	}

	public void traverse() {
		for (int i = 0; i < elementArray.length; i++) {
			if (elementArray[i] != null)
				System.out.println(elementArray[i]);
		}
	}

	public static void main(String[] args) {
		StackUsingArray<String> stack = new StackUsingArray<String>();
		try {
			stack.push("aa");
			stack.push("bb");
			stack.push("cc");
			stack.push("dd");
			stack.traverse();
			System.out.println(stack.peek());
			stack.pop();
			System.out.println(stack.peek());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
