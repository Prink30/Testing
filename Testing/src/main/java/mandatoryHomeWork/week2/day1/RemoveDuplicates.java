package mandatoryHomeWork.week2.day1;

import java.util.Arrays;

import org.junit.Test;

public class RemoveDuplicates {
	
	@Test
	public void input1() {
		int[] ab = { 0, 1, 1, 3, 3,4 };
		RemoveDuplicateElements(ab);
	}
	
	private void RemoveDuplicateElements(int[] ab) {
		int left = 0, right = 1;
		int count = 1;
		while (left < ab.length) {
			if(ab[left]!=ab[right]) {
			ab[count] =  ab[left];
			count++;
			}
			
			left++;
			right++;
			
		}
	}
}
