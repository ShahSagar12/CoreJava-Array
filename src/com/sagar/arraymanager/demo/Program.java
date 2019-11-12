package com.sagar.arraymanager.demo;

import com.sagar.arraymanager.utils.DynamicCollection;

public class Program {

	public static void main(String[] args) {
		DynamicCollection coll = new DynamicCollection();
		coll.add(12);
		coll.add(13);
		coll.add(25);
		coll.add(7);
		coll.add(57);
		coll.add(102);
		
		
		/*
		 * for(int num:coll.sort(false)) { System.out.println(num); }
		 */

		coll.remove(25);
		
		for(int i:coll.get()) {
			System.out.println(i);
		}
		
		 

	}

}
