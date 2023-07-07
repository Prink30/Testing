package mandatoryHomeWork.week1.day2;

import org.junit.Test;

/*
 Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
 
Example 1:
Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.

Example 2:
Input: num = 0
Output: 0
 
Constraints:
0 <= num <= 231 - 1
 */

public class AddDigits {

	@Test
	public void input1() {
		int num = 0;
		System.out.println(addnumbers(num));
	}

	@Test
	public void input2() {
		int num = 36;
		System.out.println(addnumbers(num));
	}

	@Test
	public void input3() {
		int num = 50;
		System.out.println(addnumbers(num));
	}

	private int addnumbers(int num) {

		if (num == 0) {
			return 0;
		}

		if (num % 9 == 0) {
			return 9;
		} else
			return num % 9;

	}

}
