package stringexample;

public class PrimeIndex {

	public static void main(String[] args) {
		String s="abcdefgh";
		String s1="";
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				s1=s1+s.charAt(i);
			}
		}
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count != 2) {
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);
		

	}
	
	

}
