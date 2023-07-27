package stringexample;

public class ReverseTheStringType3 {

	public static void main(String[] args) {
		String s="java html css";
		String[] s1=s.split(" ");
		String str="";
		for(int i=s1.length-1;i>=0;i--) {
			str=rev(s1[i])+" "+str;
			
		}
		System.out.println(str.trim());
		

	}
	public static String rev(String s) {
		String s1="";
		for(int i=0;i<s.length();i++) {
			s1=s.charAt(i)+s1;
		}
		return s1;
	}

}
