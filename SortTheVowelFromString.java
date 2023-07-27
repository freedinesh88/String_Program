package stringexample;

public class SortTheVowelFromString {
public static void main(String[] args) {
	String s="This is a programming class";
	String s1="";
	for(int i=0;i<s.length();i++) {
		if(vowel(s.charAt(i)+"")) {
			s1=s1+s.charAt(i);
		}
		
	}
	char[] str=s1.toCharArray();
	char[] str1=sort(str);
	String q=new String(str1);
	System.out.println(q);
}
public static boolean vowel(String s) {
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
public static char[] sort(char[] a) {
	char max;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				max=a[i];
				a[i]=a[j];
				a[j]=max;
			}
		}
	}
	return a;
}

}
