package com.acadglid.java.core.session4.assignment2;

import java.util.Scanner;

public class ArraySortInsert {
	static void printArray(int[] arr){
		for(int i=0; i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

		
	
	static int[] sortArray(int[] arr){

		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j] > arr[j+1]){
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			
			}
		}
		return arr;
	}
	static int[] addElement(int[] arr1,int number){
		int[] arr2=new int[arr1.length+1];
		System.out.println(arr2.length);
		boolean insert=true;
		for(int i=0;i<arr1.length;i++){
			
			if(arr1[i]>number){
				if(insert){
					arr2[i]=number;
					insert=false;
				}
				arr2[i+1]=arr1[i];
				
				
			}else{
				arr2[i]=arr1[i];
			}
			
		}
		
	return arr2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={12,13,1,9,7,50};
		
		System.out.println("Array before sort");
		printArray(arr);
		System.out.println("Arrays after sort");
		int arr1[]=sortArray(arr);
		printArray(arr1);
		System.out.println("Enter the number to be inserted");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
//		System.out.println("Enter the position where it is to be added. The index should be within the array size " + arr1.length);;
//		int index=s.nextInt();
		
		
		
//		if(index>arr2.length){
//			System.out.println("invalid index");
//		}
		int[] arr2=addElement(arr1, number);
		printArray(arr2);
		
	}

}
