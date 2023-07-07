package mandatoryHomeWork.week2.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class RemoveElement {
	
//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
//Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
//Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
//Return k.
	
/*Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores). */
	
	
	@Test
	public void example() {
		int[] arr = { 0, 1, 2, 2, 3, 0, 4, 5 };
		int target = 2;
		removeElement(arr, target);
	}

	private void removeElement(int[] arr, int target) {
		int left = 0, right = arr.length - 1, temp = 0;

		while (left < right) {
			if (arr[left] != target) {
				arr[left] = arr[left];
				left++;

			} else {
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}

		for (int output : arr)
			System.out.print(output);

	}


}

	 


