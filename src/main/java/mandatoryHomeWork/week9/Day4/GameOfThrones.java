package mandatoryHomeWork.week9.Day4;

import java.util.HashSet;

import org.junit.Test;

public class GameOfThrones {
   @Test
    public void example1() {
    	String s="aaabbbb";
    	System.out.println(gameOfThronesSolution(s));
    }
    
    @Test
    public void example2() {
    	String s="cdefghmnopqrstuvw";
    	System.out.println(gameOfThronesSolution(s));
    }
    
    

	private String gameOfThronesSolution(String s) {
		String output="";
        HashSet<Character> hs=new HashSet<>();
        for(int i=0; i< s.length();i++){
            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
            }
            else {
            	hs.add(s.charAt(i));
            }
        }
      //  System.out.print(hs);
        if(hs.size()==0 || hs.size()==1){
            output="YES";
        }
        else{
            output="NO";
        }
        
        return output;
		
	}
}
