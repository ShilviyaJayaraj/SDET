package mandatoryHomeWork.week3.Day4;

import org.junit.Test;

public class KBeautynumbers {

	@Test
    public void example1(){
    	int num=430043;
    	int k=2;
    	System.out.print("return"+kBeautynum(num, k));
    }

	private int kBeautynum(int num, int k) {
		 String Sint = "";
			int count=0;
			String[] S=Integer.toString(num).split("");
			for(String S1:S) {
				Sint+=S1;
			}
			if(Sint.length()>0) {
			//System.out.println(Arrays.toString(S));
			int left=0,right=1;
			while(right<S.length) {
				String input=Sint.charAt(left)+""+Sint.charAt(right);
				//System.out.println("left - "+left+""+"right - "+right);
				int in=Integer.valueOf(input);
				//System.out.println("in value - "+in);
				if(in>0) {
				int div=num%in;
				//System.out.println("divide value - "+div);
				if(div==0) {
					count++;
					left++;
					right++;
				//	System.out.println("count - "+count);
			}
				else {
					left++;
					right++;
				//	System.out.println("else");
				}
			}
				else {
					left++;
					right++;
				//	System.out.println("div less than zero");
				}
			}

			}
			   return count;
			}
	}
		/*String Sint = "";
		int count=0;
		String Sout=Integer.toString(num);
        for(int i=0;i<k;i++) {
			Sint+=Sout.charAt(i);
		}
     //  System.out.println(Sint.length());
		if(Sint.length()>1) {
		System.out.println("intial - "+Sint);
	for(int j=1; j<Sout.length();j++) {
			System.out.println("j - "+j);
			int n=Integer.parseInt(Sint);
			//System.out.println(n);
		if(n>0) {
			int div=num%n;
			System.out.println("divide value - "+div);
			if(div==0) {
				count++;
				if(j<k) {
				Sint+=Sout.charAt(j+k-1);
				 System.out.println("Sint before substring of if part "+Sint);
				Sint=Sint.substring(1);
               System.out.println("Sint - "+Sint);
				}
		}
			else {
				//System.out.println("else - Sint - "+Sint);
				Sint+=Sout.charAt(j+k-1);
			//	System.out.println("else - Sint - "+Sint);
				Sint=Sint.substring(1);
				System.out.println("else - Sint - "+Sint);
			}
		}
		else {
			// System.out.println("else - Sint - "+Sint);
			    Sint+=Sout.charAt(j+k-1);
			//	System.out.println("else - Sint - "+Sint);
				Sint=Sint.substring(1);
				System.out.println("less than  0 else - Sint - "+Sint);
		}
	}
		
	}
		else {
			int div=num/(Integer.parseInt(Sint));
			count++;
		}
		return count;
}*/