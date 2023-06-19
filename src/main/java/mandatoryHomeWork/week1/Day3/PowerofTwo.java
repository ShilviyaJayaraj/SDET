package mandatoryHomeWork.week1.Day3;

import org.junit.Test;

public class PowerofTwo {
	
	@Test
	public void example1() {
		int n=33;
		powertwo(n);
	}
	
private void powertwo(int n) {
	while(n%2==0) {
		n=n/2;
	}
	if(n==1) {
		System.out.print("Is power of two");
	}
	else {
		System.out.print("Not a power of two");
	}
		
	}
}
