package mandatoryHomeWork.week3.day3;

import java.util.Arrays;

import org.junit.Test;

public class MinDifference {

	
	@Test
	public void input1() {
		int[] nums = {9,4,1,7};
		int k=2;
		MinimumDifference(nums,k);

}
	
	@Test
	public void input2() {
		int[] nums = {9};
		int k=1;
		MinimumDifference(nums,k);

} 
	
	

	private void MinimumDifference(int[] nums, int k) {

		
		Arrays.sort(nums);
		int minVal=Integer.MAX_VALUE;
		int min,max,diff;
		
		for(int i=0;i<=nums.length-k;i++) { //O(n)
			min=nums[i];
			max=nums[i+k-1];
			diff=max-min;
			if(minVal>diff) {
				minVal=diff;
				
			 } 
		
		
		}
		
		System.out.println(minVal); 
}
}
