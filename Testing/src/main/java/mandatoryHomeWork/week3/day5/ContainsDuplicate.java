package mandatoryHomeWork.week3.day5;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ContainsDuplicate {

	@Test
	public void input1() {
		
		int[] nums = {1,2,3,1}; 
		int k = 3;
		System.out.println(ContainsDuplicateValues(nums, k));
		
	}
	
	@Test
	public void input2() {
		
		int[] nums = {1,2,3,5,6,1}; 
		int k = 3;
		System.out.println(ContainsDuplicateValues(nums, k));
		
	}
	
	

	private Boolean ContainsDuplicateValues(int[] nums, int k) {
		
	Map<Integer,Integer> values = new HashMap<Integer,Integer>();
	
	for(int i=0;i<nums.length;i++) {
		if(!values.containsKey(nums[i])) {
			values.put(nums[i], i);
		} else {
		int	pastindex  = values.get(nums[i]);
		if(Math.abs(pastindex-i)<=k) {
			return true;
		} else {
			values.put(nums[i], i);
		}
		}
		
	}
	return false;			
}
}
