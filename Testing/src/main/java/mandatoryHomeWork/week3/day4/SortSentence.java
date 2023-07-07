package mandatoryHomeWork.week3.day4;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

public class SortSentence {
	
	@Test
	public void input1() {
		String s = "is2 sentence4 This1 a3";
		sortthesentence(s);
	}

	private void sortthesentence(String s) {
		
		String[] str = s.split(" ");
		
		TreeMap<Integer,String> values = new TreeMap<Integer,String>();
		
		for(int i=0;i<str.length;i++) {
			String s1 = str[i];
			int nums= s1.charAt(s1.length()-1);
			String s2  = s1.substring(0, s1.length()-1);
		
		
		values.put(nums,s2);
	}

		System.out.println(values);
		
		String newstring = " ";
		for (Map.Entry<Integer,String> newvalues : values.entrySet()) {
			 newstring =  newstring	+ newvalues.getValue() + " ";
			
		}
		
		System.out.println(newstring);
		
}
}
