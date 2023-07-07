package mandatoryHomeWork.week1.day1;

import java.util.Arrays;

import org.junit.Test;

public class TrimArray {

	@Test
	public void input() {
		int[] array1 = { 4, 6, 1, 2 };
		trimarray(array1);

	}

	private void trimarray(int[] array1) {

		int[] newarray = new int[array1.length - 2];
		for (int i = 0; i < newarray.length; i++) {
			newarray[i] = array1[i];
		}
		System.out.println(Arrays.toString(newarray));
	}

}
