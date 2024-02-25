package com.solutions.mergesortedArray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MergeSortedArrayTest {
	
	@Test
	void testMergeSortedArrayCase1() {
		
		MergeSortedArray mergeSortedArray = new MergeSortedArray();
		
		int[] nums1 = new int[] {1,2,3,0,0,0};
		
		int[] nums2 = new int[] {2,5,6};
		
		int[] mergedArray = mergeSortedArray.mergeUsingSort(nums1, 3, nums2, 3);
		
		assertEquals(mergedArray.length, 6);
		assertEquals(nums1[0], mergedArray[0]);
		assertEquals(nums2[2], mergedArray[5]);
	}
	
	@Test
	void testMergeSortedArrayCase2() {
		
		MergeSortedArray mergeSortedArray = new MergeSortedArray();
		
		int[] nums1 = new int[] {4,5,6,0,0,0};
		
		int[] nums2 = new int[] {1,2,3};
		
		int[] mergedArray = mergeSortedArray.mergeWithoutSort(nums1, 3, nums2, 3);
		
		assertEquals(mergedArray.length, 6);
		assertEquals(nums2[0], mergedArray[0]);
		assertEquals(6, mergedArray[5]);
	}
	
	@Test
	void testMergeSortedArrayCase3() {
		
		MergeSortedArray mergeSortedArray = new MergeSortedArray();
		
		int[] nums1 = new int[] {-1,0,0,0,3,0,0,0,0,0,0};
		
		int[] nums2 = new int[] {-1,-2,0,0,1,2};
		
		int[] mergedArray = mergeSortedArray.mergeWithoutSort(nums1, 5, nums2, 6);
		assertEquals(mergedArray.length, 11);
		assertEquals(-1, mergedArray[0]);
		assertEquals(3, mergedArray[10]);
	}

}
