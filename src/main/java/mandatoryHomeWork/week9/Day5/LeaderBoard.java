package mandatoryHomeWork.week9.Day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class LeaderBoard {
   @Test
   public void example1() {
  	 int[] Ranked= {100,90,90,80};
  	 int[] player= {70,80,105};
  	 leaderBoard(Ranked, player);
   }

   @Test
   public void example2() {
  	 int[] Ranked= {100,100,50,40,40,20,10};
  	 int[] player= {5,25,50,120};
  	 leaderBoard(Ranked, player);
   }

   
   
	private void leaderBoard(int[] Ranked, int[] player) {
		List<Integer> ls=new ArrayList<>();
		for(int each: Ranked) {
			if(!(ls.contains(each))) {
			ls.add(each);
			}
		}
		int index=0;
		for(int i=0;i<player.length;i++) {
			
			if(!(ls.contains(player[i]))) {
			   ls.add(player[i]);
			 
			   Collections.sort(ls,Collections.reverseOrder());  
			  // System.out.println(ls);
			   index=ls.indexOf(player[i]);
			   System.out.print(index+1+", ");
			
			}
			else {
				  index=ls.indexOf(player[i]);
				  System.out.print(index+1+", ");
			}
			//System.out.println(ls);
		}
		System.out.println();
		
	}
}
