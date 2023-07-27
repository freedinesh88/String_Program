package stringexample;

public class RemoveDuplicateVowelDescendingOrder {

	public static void main(String[] args) {
		String s="this is a process";
		String str = vowel(s);
		String s1="";
		for(int i=0;i<str.length();i++) {
			int c=s1.indexOf(str.charAt(i));
			if(c==-1) {
				s1=s1+str.charAt(i);
			}
		}
		String s2="";
		for(int i=0;i<s1.length();i++) {
			if(vowel1(s1.charAt(i)+"")) {
				s2=s2+s1.charAt(i);
			}
			
		}
		char[] str1=s2.toCharArray();
		char[] str2=sort(str1);
		String q=new String(str2);
		System.out.println(q);
		

	}
	private static String vowel(String s) {
		String v="",c="";
		String vow="aeiouAEIOU";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(vow.indexOf(ch)!=-1) {
				c=c+ch;
			}
			else {
				v=v+ch;
			}
		}
		return c;
	}
	public static char[] sort(char[] a) {
		char max;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					max=a[i];
					a[i]=a[j];
					a[j]=max;
				}
			}
		}
		return a;
	}
	public static boolean vowel1(String s) {
		String vowel="aeiouAEIOU";
		int n=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			n=vowel.indexOf(ch);
		}
		if(n==-1) {
			return false;
		}
		else {
			return true;
		}
	}

}
