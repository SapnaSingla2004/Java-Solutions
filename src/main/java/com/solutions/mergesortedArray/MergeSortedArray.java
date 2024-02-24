package com.solutions.mergesortedArray;

import java.util.Arrays;

public class MergeSortedArray {
	
	public int[] mergeUsingSort(int[] nums1, int m, int[] nums2, int n) {
		
        if( n > 0) {
        	for (int i=0; i<n; i++) {
        		nums1[m+i] = nums2[i];
        	}
        }
        
        Arrays.sort(nums1);
        
        return nums1;
    }
	
	public int[] mergeWithoutSort(int[] nums1, int m, int[] nums2, int n) {
		
		int i = 0;
        int j = 0;
        
        while(i < nums1.length && j < n) {
        		
        		if(nums1[i] >= nums2[j]) {
        			for(int k=nums1.length-1; k>i; k--) {
        				nums1[k] = nums1[k-1];
        			}
        			nums1[i] = nums2[j];
        			j++;
                    m++;
                    i++;
                    continue;
        		}else if(i >= m && nums1[i] == 0) {
        			nums1[i] = nums2[j];
        			j++;
                    m++;
                    i++;
                    continue;
        		}
        	
        	i++;
        }
        
        return nums1;
    }

}
