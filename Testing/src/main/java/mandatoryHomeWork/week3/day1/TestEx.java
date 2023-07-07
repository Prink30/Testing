package mandatoryHomeWork.week3.day1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestEx {
	
	@Test
	public void example() {
		String s="xyzzxy";
		int k=3;
		System.out.println(goodSubstring(s,k));
	}
	
	//public static void main( String[] args) {
	/*	Map<Character,Integer> obj = new HashMap<Character, Integer>();
		
		obj.put('d', 1);
		obj.put('e', 2);
		
		System.out.println(obj.getOrDefault('e', 0)); */
		
		private int goodSubstring(String s, int k) {
		// TODO Auto-generated method stub
			int count=0;
			int indexToAdd =0;
			int indexToRemove =0;
			Map<Character, Integer> hm = new HashMap<Character, Integer>();
			//First Window
			
			
			//for(int i=0;i<k;i++)
			
			while(indexToAdd<s.length())
			{
				hm.put(s.charAt(indexToAdd), hm.getOrDefault(s.charAt(indexToAdd), 0)+1);
				indexToAdd++;
				if(hm.get(s.charAt(indexToRemove))>1) {
					hm.put(s.charAt(indexToRemove), hm.get(s.charAt(indexToRemove)-1));
				}else {
					hm.remove(s.charAt(indexToRemove));
					
				}
				
				if(hm.size()==k) count++;
					//System.out.println(Arrays.asList(hm));
			}
			
			return count;
			
			
			
		//	for(int j=1;j<s.length()-1;j++) { 
				
				
				
	}

		
	}


