package com.queue;

public class QueueAlgo {

	int[] arr;
	int size;
	int front;
	int rear;
	int number;
	
	QueueAlgo(int size){
		this.size = size;
		arr = new int[this.size];
		front = 0;
		rear = 0;
	}
	
	String insert(int value){
		if(number == size){
			return "Queue is Full";
		}
		if(rear == size){
			rear = 0;
		}
		arr[rear++] = value;
		number++;
		return "Value: "+ value+" inserted";
	}
	
	int remove(){
		if(number == 0){
			System.out.println("Queue is Empty");
			return 0;
		}
		int deleteValue = arr[front++];
		if(front == size){
			front=0;
		}
		number--;
		return deleteValue;
	}
	
	void display(){
		for(int i=front; i<rear;i++){
			System.out.println(arr[i]);
		}
	}
}
