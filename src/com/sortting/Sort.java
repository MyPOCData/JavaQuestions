package com.sortting;

public class Sort {
	int[] arr;
	int index;
	
	Sort(int size){
		arr = new int[size];
		index = 0;
	}
	
	void insertData(int value){
		arr[index++] = value;
	}
	
	void bubbleAlgo(){
		for(int i=index-1; i>0; i--){
			for(int j=0; j<index-1; j++){
				if(arr[j] > arr[j+1]){
					swap(j, j+1);
				}
			}
		}
	}
	
	void selectionAlgo(){
		int min;
		for(int i=0; i< index-1;i++){
			min=i;
			for(int j=i+1; j<index; j++){
				if(arr[j] < arr[min]){
					min=j;
				}
			}
			swap(i, min);
		}
	}
	
	public void insertionSort() {
        int j, temp;
        for (int i=1; i < index; i++){            
               temp = arr[i]; 
               for (j = i; j > 0 && arr[j - 1] >= temp; --j){             
                     arr[j] = arr[j - 1]; 
               }
               arr[j] = temp;
        }
	} 
	
	void swap(int x, int y){
		int temp;
		temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	
	void displayArr(){
		for(int i=0; i<index; i++){
			System.out.println(arr[i]);
		}
	}

}
