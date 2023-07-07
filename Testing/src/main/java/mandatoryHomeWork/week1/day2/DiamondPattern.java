package mandatoryHomeWork.week1.day2;

import org.junit.Test;

public class DiamondPattern {

	/*
   Diamond Shape Pattern Program 
   Number of rows=5
	  *
     * *
    * * *
   * * * *
  * * * * *
   * * * *
    * * *
     * *
      *
   */   
	
	
	@Test
	public void input() {
		int n = 5;
		Pattern(n);
	}

	private void Pattern(int n) {
		for (int i = 0; i <= n-1; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}

			for (int k =n-1; k >=i; k--) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
