package mandatoryHomeWork.week1.day4;

import java.util.Arrays;

import org.junit.Test;

/*
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
Example:
Input: nums = [3,0,1]
Output: 2 
*/


public class MissingNumer {
	
	    
	@Test
	   public void input() {
		int[] array1 = {0,1,3,8,5,2,4,7};
		FindMissingNumber(array1);
	}
	
	private void FindMissingNumber(int[] array1) {
		
		// sum up the input array
		
		int sum=0;
		for(int i=0;i<array1.length;i++) {
			    sum=sum+array1[i];      
		}
		
		System.out.println(sum);
		
	 int actualsum= (array1.length*(array1.length+1))/2;	
	 int missingnumber = actualsum-sum;
	 System.out.println(missingnumber);
		
	}
}
