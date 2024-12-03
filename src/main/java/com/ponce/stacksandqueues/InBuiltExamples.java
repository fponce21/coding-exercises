package com.ponce.stacksandqueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuiltExamples {
	
	public static void main(String[] args) {
		//no capacity restrictions
		//can delete and insert from first and last positions
		Deque<Integer> dq = new ArrayDeque<>();
		
		dq.add(89);
		dq.addLast(78);
		dq.removeFirst();


	}
	
//	public static void main(String[] args) {
//		Queue<Integer> queue = new LinkedList<Integer>();
//		
//		queue.add(3);
//		queue.add(6);
//		queue.add(5);
//		queue.add(19);
//		queue.add(1);
//		
//		//peek shows the first element w/o removing
//		System.out.println(queue.peek());
//		System.out.println(queue.remove());
//		System.out.println(queue.remove());
//
//
//	}

	
	//stack
//	public static void main(String[] args) {
//		Stack<Integer> stack = new Stack<>();
//		stack.push(34);
//		stack.push(45);
//		stack.push(2);
//		stack.push(9);
//		stack.push(18);
//		
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//
//	}

}
