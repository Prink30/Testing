package mandatoryHomeWork.week1.day1;

import org.junit.Test;

public class ArrayToString {
    
	// Print the array values to String
	
	@Test
	public void Input() {
		int[] arr1 = { 2, 5, 8, 7 };
		printArrayAsString(arr1);
	}

	private void printArrayAsString(int[] arr1) {

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		}
	}

}
