package com.sagar.arraymanager.utils;

import com.sagar.arraymanager.base.Search;

public class LinearSearch extends Search{
	
	/*
	 * public LinearSearch(int[] nums,int key) { super.nums=nums; super.key=key; }
	 */
	@Override
	public boolean search(int[] nums, int key) {
		for(int i=0;i<nums.length;i++) {
			if(key==nums[i]) {
				return true;
			}
		}
		return false;
	}
	
	

}
