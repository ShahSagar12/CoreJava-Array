package com.sagar.arraymanager.utils;

import com.sagar.arraymanager.base.Sort;

public class BubbleSort extends Sort {

	@Override
	public int[] sort(int[] nums, boolean ascending) {
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(ascending==true) {
					if(nums[i]>nums[j]) {
						int temp=nums[i];
						nums[i]=nums[j];
						nums[j]=temp;
					}
				}else {
					if(nums[i]<nums[j]) {
						int temp=nums[i];
						nums[i]=nums[j];
						nums[j]=temp;
					}
				}
			}
			
		}
		return nums;
	}

}
