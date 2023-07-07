package mandatoryHomeWork.week1.day3;

import java.util.Arrays;

import org.junit.Test;

/*
 Remove all occurrence of a number which is present in the given index number
input = {1,2,3,4,5,1}, indexToRemove = 5
output = {2,3,4,5}
 
 */

public class RemoveAllOccurence {

	@Test
	public void input() {
		int[] array1 = { 1,2,3,4,5,1 };
		int indextoremove=5;

		removeelement(array1, indextoremove);

	}

	private void removeelement(int[] array1, int indextoremove) {

		int totalcount=0;
		
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == array1[indextoremove]) { 
				totalcount = totalcount+1;
				
			}
			
			
		}
		System.out.println(totalcount);
		
		int[] array2 = new int[array1.length-totalcount]; 
		int index=0;		
		for(int i=0;i<array1.length;i++) {
			if(array1[i]!=array1[indextoremove]) {
			array2[index++]	=array1[i];
			}
			
		}
		
		System.out.println(Arrays.toString(array2));

	}
	}
	
