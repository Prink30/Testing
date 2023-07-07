package mandatoryHomeWork.week2.day4;

import java.util.Arrays;

import org.junit.Test;

/*
 Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.
 For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
Return the resulting string.

Example 1:
Input: word = "abcdefd", ch = "d"
Output: "dcbaefd"
Explanation: The first occurrence of "d" is at index 3. 
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".

Example 2:
Input: word = "abcd", ch = "z"
Output: "abcd"
Explanation: "z" does not exist in word.
You should not do any reverse operation, the resulting string is "abcd".
*/

public class PrefixOfWord {

	@Test
	public void input1() {
		String s = "abcdef";
		String ab = "d";
		
		test(s,ab);
	}
	
	@Test
	public void input2() {
		String s = "abcef";
		String ab="d";
		test(s,ab);
	}
	
	@Test
	public void input3() {
		String s = " ";
		String ab=" ";
		test(s,ab);
	}
	
	/*
	 Pseudocode
	 1. Converting the given string into char array upto specified index (not converting entire string into char array) using Substring method
	 2. Keep left pointer at beginning and right pointer at end. Declare size of the pointers -  left & right
	 3. Swap the char array under the while loop with the condition while (left < right) 
	 4. After swapping convert char array into String 
	 5. Then append the remaining values of the string to the newly converted string 
	 */
	
	

	private void test(String s,String ab) {
		String subsring = s.substring(0, s.indexOf(ab) + 1);
		char[] c = subsring.toCharArray();
		int left = 0, right = c.length - 1;

		while (left < right) {
			char temp = c[left];
			c[left++] = c[right];
			c[right--] = temp;

		}

		System.out.println(Arrays.toString(c));
		String value = new String(c);
	//	System.out.println(value);
		String string2 = s.substring(s.indexOf(ab)+1, (s.length()));
	//	System.out.println(string2);
		
		  String finalvalue = value + string2;
		  System.out.println( finalvalue);
		 
	}

}
