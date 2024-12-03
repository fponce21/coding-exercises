package com.ponce.stacksandqueues;

import java.util.Stack;

public class QueuesUsingStacks {
	private Stack<Integer> first;
	private Stack<Integer> second;

	public QueuesUsingStacks() {
		first = new Stack<Integer>();
		second = new Stack<Integer>();
	}

	public void add(int item) {
		first.push(item);
	}

	public int remove() throws Exception {
		while (!first.isEmpty()) {
			second.push(first.pop());
		}
		int removed = second.pop();
		while (!second.isEmpty()) {
			first.push(second.pop());
		}
		return removed;
	}
	
	public int peek() throws Exception {
		while (!first.isEmpty()) {
			second.push(first.pop());
		}
		int peeked = second.peek();
		while (!second.isEmpty()) {
			first.push(second.pop());
		}
		return peeked;
	}
	
	public boolean isEmpty() {
		return first.isEmpty();
	}

}
