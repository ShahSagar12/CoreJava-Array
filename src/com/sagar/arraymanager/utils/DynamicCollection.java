package com.sagar.arraymanager.utils;

import com.sagar.arraymanager.base.Search;
import com.sagar.arraymanager.base.Sort;

public class DynamicCollection {
	private int[] array=new int[0];

	private int pos=0;
	private int value=-1;


	Sort bubbleSort=new BubbleSort();
	Search linearSearch=new LinearSearch();

	public int[] add(int num) {
		if(array.length==0) {
			array=new int[1];
			array[0]=num;
		}else {
			int[] array1=new int[array.length+1];
			for(int i=0;i<array.length;i++) {
				array1[i]=array[i];
			}
			array1[array.length]=num;
			array=array1;
		}
		return array;
	}

	public int[] remove(int num) {
		int index=getIndex(num);
		
		int[] mergedArray=new int[array.length-1];
		int counter=0;
		if(search(num)==true) {
			for(int i=0;i<index-1;i++) {
				mergedArray[i]=array[i];
				counter++;
				
			}
			for(int i=index;i<array.length;i++) {
				mergedArray[counter]=array[i];
				counter++;
				}
		}else {
			System.out.println("Not Found Array");
			
		}
		array=mergedArray;
		return array;
	}
	
	/**
	 * returning 0:means that the num is not in array;
	 * 
	 * */
	
	public int getIndex(int num) {
		int counter=0;
		if(search(num)) {
			for(int i=0;i<array.length;i++) {
				if(array[i]==num) {
					counter=i;
				}
			}
		}else {
			System.out.println("Not Found");
			return 0;
		}
		return counter+1;
	}
	
	public int[] sort(boolean ascending){
		while(ascending) {
			return bubbleSort.sort(array, true);
		}
		return bubbleSort.sort(array, false);
	}

	public boolean search(int key) {
		return linearSearch.search(array, key);
	}

	public int[] get() {

		return array;
	}

	public boolean next() {
		if(pos==array.length) {
			return false;
		}
		value=array[pos];
		pos++;
		return true;
	}

	public int getValue() {

		return value;
	}

	public int[] merge(int[] array1,int[] array2) {
		int counter=0;
		int[] mergedArray=new int[array1.length+array2.length];
		for(int i=0;i<array1.length;i++) {
			mergedArray[i]=array1[i];
			counter++;
		}
		for(int j=0;j<array2.length;j++) {
			mergedArray[counter]=array2[j];
			counter++;
		}
		
		return mergedArray;
	}



}
