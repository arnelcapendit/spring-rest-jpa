package com.example.easynotes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author arnelcapendit
 *
 */
public class test {
	
	public static void main(String[] args) {
		
		System.out.println(fact(5));
		
//		int[] arrnum = {7, 9, 3 , 5, 1, 2, 4};
//		
//		List<int[]> oldnum = Arrays.asList(arrnum);
//		System.out.println("Original");
//		for(int x : arrnum) {
//			System.out.println(x);
//		}
//		
//		bubbleSort(arrnum);
//	
//		
//		System.out.println("New");
//		for(int y : arrnum) {
//			System.out.println(y);
//		}
		
	}
	
	public static int fact(int x) {
		if(x == 1) {
			return 1;
		}
		
		return x * fact(x -1);
	}
	
	
	public static void bubbleSort(int[] arrnum) {
	int i, j, temp=0;
		
		for(i = 0; i < arrnum.length; i++) {
			for(j = 1; j < arrnum.length; j++) {
				if(arrnum[j - 1] < arrnum[j]) {
					temp = arrnum[j - 1];
					arrnum[j - 1] = arrnum[j];
					arrnum[j] = temp;
				}
			}
		}
	}
}
