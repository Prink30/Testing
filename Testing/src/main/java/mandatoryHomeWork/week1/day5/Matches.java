package mandatoryHomeWork.week1.day5;

import org.junit.Test;

public class Matches {
	
	@Test
	public void input1() {
		int n=7;
		test(n);
	}
	
	@Test
	public void input2() {
		int n=8;
		test(n);
	}
	
	private void test(int n) {
		int matches=0;
		
		while(n>1) {
			if(n%2==0) {
			matches=matches+n/2;
			n=n/2;
		
			} else {
				matches=matches+((n-1)/2);
			//	System.out.println(matches);
				n=((n-1)/2)+1;
			//	System.out.println(n);
				
			}
		}
		System.out.println(matches);
		
	}

}
