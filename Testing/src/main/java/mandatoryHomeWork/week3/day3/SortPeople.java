package mandatoryHomeWork.week3.day3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class SortPeople {
	
	@Test
	public void input1() {
		int[] heights = {180,165,170};
		String[] names = {"Mary","John","Emma"};
		sortthepeople(heights,names);
	}

	private void sortthepeople(int[] heights, String[] names) {
		
		int index=0;
		String[] newvalues = new String[names.length];
		
	Map<Integer,String> values= new HashMap<Integer,String>();
	
	for(int i=0;i<names.length;i++) {
		   values.put(heights[i], names[i]);
		
	}
	
	//System.out.println(values);
	
	Arrays.sort(heights);
	
	//System.out.println(Arrays.toString(heights));
	
	for (int nums : heights) {
		 newvalues[index++] = values.get(nums);
	}
      System.out.println(Arrays.toString(newvalues));
	
	}

}
