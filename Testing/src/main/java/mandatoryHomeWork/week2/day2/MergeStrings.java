package mandatoryHomeWork.week2.day2;

import java.util.Arrays;

import org.junit.Test;

public class MergeStrings {

//You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
//Return the merged string.
/*	Example 1:

		Input: word1 = "abc", word2 = "pqr"
		Output: "apbqcr"
		Explanation: The merged string will be merged as so:
		word1:  a   b   c
		word2:    p   q   r
		merged: a p b q c r */
	
	
	@Test
	public void input1() {
		String word1 = "abc"; String word2 = "gtyu";
		
		System.out.println(MergeStrings(word1, word2));
	}
	@Test
	public void input2() {
		String word1 = "abcd"; String word2 = "st";
		
		System.out.println(MergeStrings(word1, word2));
	}
	@Test
	public void input3() {
		String word1 = "abcdefg"; String word2 = "lmn";
		
		System.out.println(MergeStrings(word1, word2));
	}
	
	
	public String MergeStrings(String word1, String words2) {
		int left=0,right=0;
		char [] Array1 = word1.toCharArray();
		char [] Array2= words2.toCharArray();
		char [] NewArray = new char[word1.length()];
		String str="";
		while(left<Array1.length || right<Array2.length) {
		if(left<Array1.length) {
			str=str+Array1[left++];	
		}
		if(right<Array2.length) {
			str=str+Array2[right++];	
		}
		
		}
		return str;
	
	}
}

