package stringexample;

public class VowelFirst {

	public static void main(String[] args) {
		String s="abcdefgh";
		String s1="";
		String s2="";
		for(int i=0;i<s.length();i++) {
			if(vowel(s.charAt(i))) {
				s1=s1+s.charAt(i);
			}
			else {
				s2=s2+s.charAt(i);
			}
			
		}
		System.out.println(s1+s2);

	}
	public static boolean vowel(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			return true;
		}
		else {
			return false;
		}
	}
	

}
