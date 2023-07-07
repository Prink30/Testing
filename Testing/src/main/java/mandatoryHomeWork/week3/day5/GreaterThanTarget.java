package mandatoryHomeWork.week3.day5;

import org.junit.Test;

public class GreaterThanTarget {

	/*
	 * 1. loop the given array till its array length with the condition
	 * letters.length-1 2. Check the condition whether letters[i]>target, it it
	 * satisfies return letters[i] 3. If the condition does not satifies return
	 * letters[0]
	 */
	@Test
	public void input1() {
		char[] letters = { 'c', 'f', 'j' };
		char target = 'a';
		smallerlettergreaterthantarget(letters, target);
	}

	@Test
	public void input2() {
		char[] letters = { 'd', 'g', 'h' };
		char target = 'c';
		smallerlettergreaterthantarget(letters, target);
	}

	@Test
	public void input3() {
		char[] letters = { 'x', 'x', 'y', 'y' };
		char target = 'z';
		smallerlettergreaterthantarget(letters, target);
	}

	private void smallerlettergreaterthantarget(char[] letters, char target) {

		for (int i = 0; i < letters.length - 1; i++) {

			if (letters[i] > target) {
				System.out.println(letters[i]);
				break;

			} else
				System.out.println(letters[0]);
			break;

		}

	}

}
