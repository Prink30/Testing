package mandatoryHomeWork.week3.day1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class SubstriDistinct {

	@Test
	public void positive() {
		String str = "xyzzaw";
		int k =3;
		 subStrddDistinct(str, k);
	}
	
	
	@Test
	public void negative() {
		String str = "aaaaaa";
		int k =3;
		 subStrddDistinct(str, k);
	}

	private void subStrddDistinct(String str, int k) {
		
		int count=0;
		Map<Character,Integer> value = new HashMap<Character,Integer>();
		
		
		for(int i=0;i<str.length()-k;i++) {
			value.put(str.charAt(i), value.getOrDefault(str.charAt(i), 0)+1);
		}
		
		System.out.println(Arrays.asList(value));
		
		if(value.size()==k) {
			count++;
		}
		
	//	System.out.println();
		
		for(int j=1;j<=str.length()-k;j++) { // 1, 1<3 , 2 ;  2<3 ;
			//if the value is greater than 1
			
			if(value.get(str.charAt(j-1))>1) {
				value.put(str.charAt(j-1), value.getOrDefault(str.charAt(j-1), 0)-1);
			} else {
				value.remove(str.charAt(j-1));
			}
			
			
			value.put(str.charAt(j+k-1), value.getOrDefault(str.charAt(j+k-1), 0)+1);
		//	System.out.println(Arrays.asList(value));
			}
	//	System.out.println(Arrays.asList(value));
		if(value.size()==k) {
			count++;
		}
		
		System.out.println(count);
}
}


