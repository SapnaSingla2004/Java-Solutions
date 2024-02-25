package com.solutions.removeduplicates;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RemoveDuplicatesTest {
	
	@Test
	void testRemoveDuplicates() {
		RemoveDuplicates removeDuplicates = new RemoveDuplicates();
		
		int[] nums1 = new int[] {0,0,1,1,1,2,2,3,3,4};
		
		int count = removeDuplicates.removeDuplicates(nums1);
		
		assertEquals(count, 5);
	}
}
