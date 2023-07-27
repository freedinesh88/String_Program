package stringexample;

public class EvenOdd {

	public static void main(String[] args) {
		String s="abcdefgh";
		String s1="";
		for(int i=0;i<s.length();i++) {
			if(i%2==1) {
				s1=s1+s.charAt(i);
			}
		}
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);

	}

}
