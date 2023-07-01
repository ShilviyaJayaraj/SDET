package mandatoryHomeWork.week8.day4;

import org.junit.Test;

public class MarsExplorer {

	@Test
	public void example1() {
		String s="SOSSOS";
		changedByRadiation(s);
	}
	
	@Test
	public void example2() {
		String s="SOSSOT";
		changedByRadiation(s);
	}
	
	@Test
	public void example3() {
		String s="SOSSOTSOPPOS";
		changedByRadiation(s);
	}
	
	@Test
	public void example4() {
		String s="TOP";
		changedByRadiation(s);
	}
	@Test
	public void example5() {
		String s="";
		changedByRadiation(s);
	}

	private void changedByRadiation(String s) {
		String message="SOS";
		int j=1;
		int radiationchange=0;
	//	int signalLength=s.length()/3;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=message.charAt(j-1)) {
				radiationchange++;
			//	System.out.println(s.charAt(i));
			}
			if(j<3) {
			j++;
			}
			else {
				j=1;
			}
		}
		
		System.out.println(radiationchange);
		
	}
	
	
}
