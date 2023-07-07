package mandatoryHomeWork.week2.day5;

import org.junit.Test;

public class ReverseWords {
	
	@Test
	public void example() {
		String s = "Let's take LeetCode contest";
		reverseSentence(s);
	}

	private void reverseSentence(String s) {
		String[] words = s.split(" ");
		String output = "";

		char temp = ' ';
		for (String word : words) {
			int left = 0;
			int right = word.length()-1;
			char[] ch = word.toCharArray();
			while (left < right) {
				temp = ch[right];
				ch[right--] = ch[left];
				ch[left++] = temp;
			}

			output = output+" "+String.valueOf(ch).trim();
		}

		System.out.println(output);

	}

}
