package com.ponce.stacksandqueues;

public class QueueMain {
	public static void main(String[] args) throws Exception {
		DynamicQueue queue = new DynamicQueue(5);
		
		queue.insert(3);
		queue.insert(6);
		queue.insert(5);
		queue.insert(19);
		queue.insert(1);
		queue.insert(10);
		queue.insert(13);

		
		queue.display();
		
		System.out.println(queue.remove());
		queue.insert(109);
		queue.display();
		
		System.out.println(queue.remove());
		queue.insert(134);
		queue.display();
 
	}
}
