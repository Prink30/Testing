package mandatoryHomeWork.week1.day3;

import org.junit.Test;

/*
Right Pascal's Triangle
Number of rows=5

*
**
***
****
*****
****
***
**
*
        */   

public class RightPascal {

	@Test
	public void input() {
		int n = 5;
		RightPascalPattern(n);
	}

	private void RightPascalPattern(int n) {

		for (int i = 0; i <= n - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();

		}

		for (int i = 0; i <= n - 1; i++) {
			for (int j = n - 1; j > i; j--) {

				System.out.print("*");
			}
			System.out.println();
		}

	}

}
