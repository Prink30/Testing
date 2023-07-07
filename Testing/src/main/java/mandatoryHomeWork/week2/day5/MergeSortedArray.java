package mandatoryHomeWork.week2.day5;

import java.util.Arrays;

import org.junit.Test;

public class MergeSortedArray {
	
	@Test
	public void test1() {
		int [] nums1 = {1,2,5};
		int [] nums2 = {5,7,8};
		MergeArray(nums1, nums2);
	}

	@Test
	public void test2() {
		int [] nums1 = {1,3,5,7};
		int [] nums2 = {2,8};
		MergeArray(nums1, nums2);
	}



		private void MergeArray(int [] nums1, int [] nums2) {
			int left=0, right =0;
			int index = 0;
			int ouput [] = new int[nums1.length+nums2.length];
			while(left<nums1.length || right<nums2.length) {
				if(left==nums1.length) {
					ouput[index++] = nums2[right++];
				}
				else 	if(right==nums2.length) {
					ouput[index++] = nums1[left++];
					
				}
				else if(nums1[left]<=nums2[right]) {
				ouput[index++] = nums1[left++];
				}
				else {
					ouput[index++] = nums2[right++];
					
				}
				}
			System.out.println(Arrays.toString(ouput));
	}

}
