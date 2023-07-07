package mandatoryHomeWork.week1.day3;

import org.junit.Test;

/*
Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two, if there exists an integer x such that n == 2x.

Example:
Input: n = 16
Output: true
Explanation: 24 = 16

Constraints:
-231 <= n <= 231 - 1
 
 */

public class PowerofTwo {

		@Test
		public void input1() {
			int num = 8;
			System.out.println(addnumbers(num));
		}
		
		
		@Test
		public void input2() {
			int num = 7;
			System.out.println(addnumbers(num));
		}
		
		

		private boolean addnumbers(int num) {

			if(num==0) {
				return false;	
			} 
            
			while(num!=1) {
				
			if (num%2!=0) {  
				return false; 
				
			} else {
				num=  num/2; 
				
			}
			 
		}
			return true;

}
	}

