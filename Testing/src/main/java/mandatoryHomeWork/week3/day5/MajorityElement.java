package mandatoryHomeWork.week3.day5;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MajorityElement {
	
	@Test
	public void input1() {
		int[] nums = {3,2,3};
		MajorityOfElement(nums);
	}
	
	@Test
	public void input2() {
		int[] nums = {2,2,1,1,1,2,2};
		MajorityOfElement(nums);
	}

	private void MajorityOfElement(int[] nums) {
		Map<Integer,Integer> values = new HashMap<Integer,Integer>();
		
		for(int i=0;i<nums.length;i++) {
			values.put(nums[i],values.getOrDefault(nums[i], 0)+1);
		}
		
		//System.out.println(values);
		
		for (Map.Entry<Integer, Integer> newvalue : values.entrySet()) {
			int length = nums.length-1;
			int target= length/2;
			int a = newvalue.getValue();
			if(a>target) {
				System.out.println(newvalue.getKey());
			}
			
		}
		
	}

}
