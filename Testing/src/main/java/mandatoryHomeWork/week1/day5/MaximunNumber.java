package mandatoryHomeWork.week1.day5;

import java.util.Arrays;

import org.junit.Test;

//In this problem, we are given an integer num where every digit is either 6 or 9, we can change up to 1 digit (from 6 to 9 or vice versa).
//
//The task is to return the largest integer we can get.
//
//After observation, we can get these conclusions as follows:
//
//We can only increment num by converting a digit 6 to 9.
//We should always convert the highest digit 6. Suppose num = 669, it has multiple digits 6, we must convert the first one to make it 969 rather than 699.
//If every digit of num is 9, we only need to return num since it already stands for the largest integer.

public class MaximunNumber {

//Pseudocode	
//	1. Given a integer number consists of only 6 and 9.
//	2. Convert integer values to String value and then store it in Char[]
//	3. Create for loop to traverse this array from 0 to i.digits.length-1 with condition  i<digits.length-1
//	4. Create if statement with the condition (digits[i]==6)
//	5.If the statement is true it will replace the specific index value with 9

	@Test
	public void input() {
		int num = 9699;
		test(num);
	}

	public void test(int num) {

		char[] digits = String.valueOf(num).toCharArray();
		// System.out.println(Arrays.toString(digits));

		for (int i = 0; i < digits.length; i++) {

			if (digits[i] == '6') {
				digits[i] = '9';
				break;
			}
		}
		System.out.println(Arrays.toString(digits));
	}
}
