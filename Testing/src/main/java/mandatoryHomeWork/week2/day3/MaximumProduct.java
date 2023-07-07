package mandatoryHomeWork.week2.day3;

import org.junit.Test;

public class MaximumProduct {

	@Test
	public void input1()
	{
		int[] nums = { 3, 4, 5, 2 };
		System.out.println(MaxProduct(nums));
	}
	
	@Test
	public void input2()
	{
		int[] nums = { 1, 5, 4, 5 };
		System.out.println(MaxProduct(nums));
	}
	
	public static int MaxProduct(int[] nums) {
		
		int firstMaxValue = 0, secondMaxValue = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > firstMaxValue) {
				firstMaxValue = nums[i];
			}
		}
		
		for (int j = 0; j <= nums.length - 1; j++) {
			if (nums[j] < firstMaxValue && nums[j] > secondMaxValue) {
				secondMaxValue = nums[j];
			}
		}

		return firstMaxValue * secondMaxValue;
	}
	
}
