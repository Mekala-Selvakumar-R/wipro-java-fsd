package com.demo.day2;

public class ArrayDemo1 {

	public static void main(String[] args) {
 
		int []arr1 = {10,20,30,40,50};
		System.out.println(arr1.length);
		
//		int arr2[],arr3[],x,y,arr4[];
//		arr2=new int[10];
//		System.out.println(arr2.length);
		
		int []arr2,arr3,arr4 ;
		arr2=new int[15];
		arr3=new int[20];
		System.out.println(arr2.length);
		System.out.println(arr3.length);
		arr2[3] =100;
		arr2[5]=200;
		arr2[1]=500;
		for(int i=0;i<15;i++) {
		System.out.print(arr2[i]+"  ");
		}
//		System.out.println(arr2[1]);
System.out.println();
for(int i=0;i<arr2.length;i++) {
	System.out.print(arr2[i]+"  ");
	}
		
		
		
	}

}
