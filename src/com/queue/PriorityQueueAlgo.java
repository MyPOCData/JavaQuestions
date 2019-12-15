package com.queue;

public class PriorityQueueAlgo {

	int[] pQueue;
	int size;
	int num;
	
	public PriorityQueueAlgo(int size){
		this.size = size;
		pQueue = new int[this.size];
		num = 0;
	}
	
	public void insert(int value){
		int i;
		if(num == size)
			System.out.println("Queue is Full");
		if(num ==0){
			pQueue[num++]=value;
		}else{
			for(i=num-1; i>=0; i--){
				if(value > pQueue[i])
					pQueue[i+1] = pQueue[i];
				else
					break;
			}
			pQueue[++i]=value;
			num++;
		}
	}
	
	public int remove(){
		if(num ==0)
			System.out.println("Queue is empty");
		return pQueue[--num];			
	}
	
	public void display(){
		for(int i=0; i<num; i++)
			System.out.println(pQueue[i]);
	}
}
