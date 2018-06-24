package com.example.jpa.jpaonetoonedemo;

public class BubbleSort {

	
	public static void main(String[] args) {
	
		int[] number = {3, 1, 7, 4, 6};
		int [] newNumber = bubbleSort(number);
		
		for(int i : newNumber) {
			System.out.println(i);
		}
		
	}
	
	
	public static int[] bubbleSort(int[] list) {
		
		int i, j, temp=0;
		
		for(i=0; i < list.length - 1; i++) {
			for(j=0; j < list.length - 1; j++) {
				if(list[j] > list[j + 1]) {
					temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}	
			}
		}
		
		return list;
	}
	
	
	
	
	
	
	
}
