package mandatoryHomeWork.week14.day2;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

/*
 * 804. Unique Morse Code Words
 * Store key as alphabet and value as morse code in hash map
 * get words[i] => and store it in char array to get morse code of each character in a word
 * and concat it and store it in new hashset , if that word is not already present
 */

public class MorseCodeWorks {
	@Test
	public void example1() {
     String[] words= {"gin","zen","gig","msg"};
     System.out.println(moreCodeWords(words));
	}
	
	@Test
	public void example2() {
     String[] words= {"a"};
     System.out.println(moreCodeWords(words));
	}

	private int moreCodeWords(String[] words) {
		HashMap<Character,String> morsecode=new HashMap<>();
		morsecode.put('a',".-");
		morsecode.put('b',"-...");
		morsecode.put('c',"-.-.");
		morsecode.put('d',"-..");
		morsecode.put('e',".");
		morsecode.put('f',"..-.");
		morsecode.put('g',"--.");
		morsecode.put('h',"....");
		morsecode.put('i',"..");
		morsecode.put('j',".---");
		morsecode.put('k',"-.-");
		morsecode.put('l',".-..");
		morsecode.put('m',"--");
		morsecode.put('n',"-.");
		morsecode.put('o',"---");
		morsecode.put('p',".--.");
		morsecode.put('q',"--.-");
		morsecode.put('r',".-.");
		morsecode.put('s',"...");
		morsecode.put('t',"-");
		morsecode.put('u',"..-");
		morsecode.put('v',"...-");
		morsecode.put('w',".--");
		morsecode.put('x',"-..-");
		morsecode.put('y',"-.--");
		morsecode.put('z',"--..");
		HashSet<String> hs=new HashSet<>();
		for(int i=0;i<words.length;i++) {
			String str=words[i];
			String code = null;
			for(int j=0;j<str.length();j++) {			
		    if(morsecode.containsKey(str.charAt(j))){
		    	code+=morsecode.get(str.charAt(j));
		    }
			}
			hs.add(code);
			}
		return hs.size();
			
		}
	}
