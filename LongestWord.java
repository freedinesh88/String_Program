package stringexample;

public class LongestWord {

	public static void main(String[] args) {
		String s="This is a programming class";
		String[] str=s.split(" ");
		int max=str[0].length();
		String temp=str[0];
		for(int i=0;i<str.length;i++) {
			String ss=str[i];
			if(ss.length()>max) {
				max=ss.length();
				temp=ss;
			}
		}
		System.out.println(temp);

	}

}
