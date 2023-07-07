package mandatoryHomeWork.week1.day2;

import java.util.Arrays;

/*
 Remove the first and last occurrence of a given number in the input array
input = {1,2,3,4,5,1}, number = 1
output = {2,3,5}
 */

import org.junit.Test;

public class RemovefirstandLast {

	@Test
	public void input() {
		int[] array1 = { 1, 2, 3, 4, 1 };
		int elementtoremove = 1;
		firstandlast(array1, elementtoremove);

	}

	private void firstandlast(int[] array1, int elementtoremove) {

		//find first index
		
	int	firstindex =0; 
	int lastindex = 0;
		for(int i=0;i<array1.length;i++) {
			if(array1[i]==elementtoremove) {
			 firstindex = i; // 0
			 break;
			}
		}
		   System.out.println(firstindex);
		   
		  //find last index
		                     
		   for(int i=array1.length-1;i>=0;i--) {
			   if(array1[i]==elementtoremove) {
				       lastindex= i; // 4
				       break;
			   }
		   }
		   System.out.println(lastindex);
		   
		   // create a new array with required length
		   
		   int[] newarray = new int[array1.length-2];
		   int j=0;
		   for(int i=0;i<array1.length;i++) {
			   if(i != firstindex && i != lastindex ) {
			   newarray[j++] = array1[i];
		   }
		   }
		    System.out.println(newarray);
		    }
	
		   
	}

