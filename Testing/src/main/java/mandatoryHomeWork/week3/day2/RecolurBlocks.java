package mandatoryHomeWork.week3.day2;

import org.junit.Test;

public class RecolurBlocks {
	
	@Test
	public void input1() {
		
		String blocks = "WBBWWBBWBW";
		int k=7;
		RecolourBlack(blocks,k);
	}
	
	@Test
	public void input2() {
		
		String blocks = "WBBBWW";
		int k=4;
		RecolourBlack(blocks,k);
	}
	
	

	private void RecolourBlack(String blocks,int k) {
		// TODO Auto-generated method stub
		
		int count =0;
		int min =Integer.MAX_VALUE;
		
		//first Window
		for(int i=0;i<k;i++)
		{
			if(blocks.charAt(i)=='W')
				count++;
		}
		
		min =count;//3 
		
		//second window left
		
		
		for(int j=1;j<blocks.length()-k;j++)// 1,1<2,
		{
			if(blocks.charAt(j-1)=='W') 
			{
				count--;
			}
				if(blocks.charAt(j+k-1)=='W') 
               {
					count++;
				}			
		      if(count<min) 
		    	  min=count;
		      
		}
		System.out.println(min);
		
}

}
