package mandatoryHomeWork.week5.day5;

import org.junit.Test;

public class BalancedString {
	
	
	@Test
	public void example1() {
		String s="RLRRLLRLRL";
		balancedString(s);
	}
	public int balancedString(String s) {
        int leftCount=0;
        int rightCount=0;
        int out=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            switch(ch){
                case 'R':
                rightCount++;
                break;
                default: 
                leftCount++;
            }
            if(rightCount==leftCount){
                out++;
                leftCount=0;
                rightCount=0;
            }
        }
        return out;
    }
}
