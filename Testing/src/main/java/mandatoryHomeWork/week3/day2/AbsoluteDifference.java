package mandatoryHomeWork.week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AbsoluteDifference {
	
	@Test
	public void example() {
		int[] array1 = {4,2,1,3};
		System.out.println(Absdifference(array1));
		
	}

	public List<List<Integer>> Absdifference(int[] array1) {
		
	    Arrays.sort(array1);
		
		int min = Integer.MAX_VALUE;
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		for(int i=1;i<array1.length;i++) {
			
		int value =	array1[i] - array1[i-1];
		
		 if(value<min) {
			 min=value;
			
			result.clear();
			 result.add(Arrays.asList(array1[i-1],array1[i]));
			 
		 } else if(value==min) {
			 result.add(Arrays.asList(array1[i-1],array1[i]));
		 }
		 
		} 
		
		return result;
	}
	

}
