package mandatoryHomeWork.week9.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SparseArrays {
       @Test
       public void example1() {
    	   List<String> stringList=Arrays.asList("aba","baba","aba","xzxb");
    	   List<String> queries=Arrays.asList("aba","xzxb","ab");
    	   System.out.println(sparseArraySoluion(stringList, queries));
       }
       
       @Test
       public void example2() {
    	   List<String> stringList=Arrays.asList("def","de","fgh");
    	   List<String> queries=Arrays.asList("de","lmn","fgh");
    	   System.out.println(sparseArraySoluion(stringList, queries));
       }

       @Test
       public void example3() {
    	   List<String> stringList=Arrays.asList("abcde","sdaklfj","asdjf","na","basdn","sdaklfj","asdjf","na","asdjf","na","basdn","sdaklfj","asdjf");
    	   List<String> queries=Arrays.asList("abcde","sdaklfj","asdjf","na","basdn");
    	   System.out.println(sparseArraySoluion(stringList, queries));
       }

       
	private List<Integer> sparseArraySoluion(List<String> stringList, List<String> queries) {
		List<Integer> out=new ArrayList<>(); 
		int count=0;
for(int i=0;i<queries.size();i++) {
	for(int j=0;j<stringList.size();j++) {
		if(queries.get(i)==stringList.get(j)) {
			count++;
		}
	}
	out.add(count);
	count=0;
}

return out;
		
	}
}
