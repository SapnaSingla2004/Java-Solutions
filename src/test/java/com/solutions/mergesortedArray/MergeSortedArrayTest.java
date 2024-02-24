package com.solutions.mergesortedArray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MergeSortedArrayTest {
	
	@Test
	void testMergeSortedArrayCase1() {
		
		MergeSortedArray mergeSortedArray = new MergeSortedArray();
		
		int[] nums1 = new int[6];
		nums1[0] =  1;
		nums1[1] =  2;
		nums1[2] =  3;
		nums1[3] =  0;
		nums1[4] =  0;
		nums1[5] =  0;
		
		int[] nums2 = new int[3];
		nums2[0] =  2;
		nums2[1] =  5;
		nums2[2] =  6;
		
		int[] mergedArray = mergeSortedArray.mergeUsingSort(nums1, 3, nums2, 3);
		
		assertEquals(mergedArray.length, 6);
		assertEquals(nums1[0], mergedArray[0]);
		assertEquals(nums2[2], mergedArray[5]);
	}
	
	@Test
	void testMergeSortedArrayCase2() {
		
		MergeSortedArray mergeSortedArray = new MergeSortedArray();
		
		int[] nums1 = new int[6];
		nums1[0] =  4;
		nums1[1] =  5;
		nums1[2] =  6;
		nums1[3] =  0;
		nums1[4] =  0;
		nums1[5] =  0;
		
		int[] nums2 = new int[3];
		nums2[0] =  1;
		nums2[1] =  2;
		nums2[2] =  3;
		
		int[] mergedArray = mergeSortedArray.mergeWithoutSort(nums1, 3, nums2, 3);
		
		assertEquals(mergedArray.length, 6);
		assertEquals(nums2[0], mergedArray[0]);
		assertEquals(6, mergedArray[5]);
	}
	
	@Test
	void testMergeSortedArrayCase3() {
		
		MergeSortedArray mergeSortedArray = new MergeSortedArray();
		
		int[] nums1 = new int[11];
		nums1[0] =  -1;
		nums1[1] =  0;
		nums1[2] =  0;
		nums1[3] =  0;
		nums1[4] =  3;
		nums1[5] =  0;
		nums1[6] =  0;
		nums1[7] =  0;
		nums1[8] =  0;
		nums1[9] =  0;
		nums1[10] =  0;
		
		int[] nums2 = new int[6];
		nums2[0] =  -1;
		nums2[1] =  -2;
		nums2[2] =  0;
		nums2[3] =  0;
		nums2[4] =  1;
		nums2[5] =  2;
		
		int[] mergedArray = mergeSortedArray.mergeWithoutSort(nums1, 5, nums2, 6);
		assertEquals(mergedArray.length, 11);
		assertEquals(-1, mergedArray[0]);
		assertEquals(3, mergedArray[10]);
	}

}
