package stringexample;

public class FirstHalfRevPlusSecHalfRev {
	public static void main(String[] args) {
		String s="abcdefgh";
		String s1="";
		s1=rev(s.substring(0,s.length()/2))+rev(s.substring(s.length()/2));
		System.out.println(s1);
		
		
	}
	public static String rev(String s) {
		String s1="";
		for(int i=0;i<s.length();i++) {
			s1=s.charAt(i)+s1;
		}
		return s1;
	}

}
