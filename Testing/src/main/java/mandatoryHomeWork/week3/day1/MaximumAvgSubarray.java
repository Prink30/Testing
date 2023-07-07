package mandatoryHomeWork.week3.day1;

import org.junit.Test;

public class MaximumAvgSubarray {
	
	@Test
	public void positive() {
		int[] nums = {1,12,-5,-6,50,3};
		int k = 4;
		maxAvgSubarr(nums, k);
	}
	
	private void maxAvgSubarr(int[] nums, int k) {
		double sum=0;
		double avg;
		double max;
		for(int i=0;i<k;i++) {
			sum=sum+nums[i];
		}
		
		avg=sum/k;
		max=avg;
		
		for(int j=1;j<=nums.length-k;j++) {
			sum=sum-nums[j-1]+nums[k+j-1]; 
			avg=sum/k;
			if(avg>max) max=avg;
		}
		System.out.println(max);
		
	}
}


