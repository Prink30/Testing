package mandatoryHomeWork.week2.day1;

import java.util.Arrays;

import org.junit.Test;

/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 Note that you must do this in-place without making a copy of the array.
Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]
*/

public class MovetoZeoes {

	@Test
	public void input1() {
		int[] ab = { 0, 1, 0, 3, 12 };
		MoveZeroes(ab);
	}

	@Test
	public void input2() {
		int[] ab = { 1, 1, 1, 3, 12 };
		MoveZeroes(ab);
	}
	
	@Test
	public void input3() {
		int[] ab = { 0 };
		MoveZeroes(ab);
	}
	
	/*
	 Pseudocode
	 1. Given integer array ab
	 2. Keep left pointer right pointer at the same position i.e at the start. 
	 3. Declare size of the pointers -  left & right
	 3. Swap the array with the condition if (ab[right] != 0)
	 4. If the condition satisfies array will appear as by having numbers at beginning and zeroes at last
	 5. 
	 */

	private void MoveZeroes(int[] ab) {
		int left = 0, right = 0;
		while (right < ab.length) {
			if (ab[right] != 0) {
				int temp = ab[right];
				ab[right] = ab[left];
				ab[left++] = temp;
			}
			right++;
		}
		System.out.println(Arrays.toString(ab));

	}
}
