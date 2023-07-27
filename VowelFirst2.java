package stringexample;

public class VowelFirst2 {

	public static void main(String[] args) {
		String s="abcdefgh";
		System.out.println(vowel(s));
		

	}
	public static String vowel(String s) {
		String v="",c="";
		String vowel="aeiouAEIOU";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(vowel.indexOf(ch)==-1) {
				c=c+ch;
			}
			else {
				v=v+ch;
			}
		}
		return v+c;
	}

}
