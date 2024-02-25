package com.solutions.removeduplicates;

public class RemoveDuplicates {
	
	public int removeDuplicates(int[] nums) {
        
		int count = 1;
		
		int i =0;
		while(i < nums.length-1) {
			
			if(nums[i] == nums[i+1]) {
				i++;
				continue;
			}else {
				nums[count] = nums[i+1];
				count ++;
				i++;
			}
			
		}
		
		return count;
    }

}
