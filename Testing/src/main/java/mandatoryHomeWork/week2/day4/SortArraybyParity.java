package mandatoryHomeWork.week2.day4;

import java.util.Arrays;

import org.junit.Test;

/*
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
Return any array that satisfies this condition.
Example 1:
Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
Example 2:
Input: nums = [0]
Output: [0]
 */

public class SortArraybyParity {
	
	@Test
	public void input1() {
		int[] arr = {3,1,2,4};
		SortArray(arr);
		
	}
	
	@Test
	public void input2() {
		int[] arr = { };
		SortArray(arr);
		
	}
	
/*
 Pseudocode
 1. Given array consists of odd and even numbers in random order
 2. Keep left pointer at beginning and right pointer at end.Declare size of the pointers -  left & right
 3. Swap the array by specifying the if condition arr[left]%2 !=0 && arr[right]%2==0 under while loop
 4. If the "if condition" satisfies the array will appear as by even numbers at beginning and odd numbers at end 
 */
	
	private void SortArray(int[] arr) {
		int left=0,right=arr.length-1;
		
		while(left<right) {
			if(arr[left]%2 !=0 && arr[right]%2==0) {
			int	temp = arr[left];
			arr[left++]=arr[right];
			arr[right--]=temp;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
