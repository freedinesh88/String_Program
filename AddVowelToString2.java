package stringexample;

public class AddVowelToString2 {
	public static void main(String[] args) {
		String s="This is a programming class";
		String str = vowel(s);
		System.out.println(str);

	}

	private static String vowel(String s) {
		String v="",c="";
		String vow="aeiouAEIOU";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(vow.indexOf(ch)==-1) {
				c=c+ch;
			}
			else {
				v=v+ch;
			}
		}
		return c+" "+v;
	}

}
