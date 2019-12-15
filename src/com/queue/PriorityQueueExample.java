package com.queue;

public class PriorityQueueExample {

	public static void main(String[] args) {

		PriorityQueueAlgo pq = new PriorityQueueAlgo(10);
		pq.insert(81);
		pq.insert(91);
		pq.insert(5);
		pq.insert(99);
		pq.insert(8);

		pq.display();
		pq.remove();
		pq.remove();
		pq.display();
	}

}
