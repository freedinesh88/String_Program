package stringexample;

public class PlaceTheOrderOfPosition {

	public static void main(String[] args) {
		String s="html3 css5 java1 python2 c++4";
		
		String[] s1= s.split(" ");
		String[] sr=new String[s1.length];
		String s2;
		int max;
		for (int i = 0; i < s1.length; i++) {
			s2=s1[i];
			String s3=s2.charAt(s2.length()-1)+"";
			int n=Integer.parseInt(s3);
			sr[n-1]=s2.substring(0,s2.length()-1);
			
			
		}
		for (String string : sr) {
			System.out.print(string+" ");
		}
		
	}

}
