package stringexample;

public class ReverseTheString {

	public static void main(String[] args) {
		String s="java html css";
		String s1="";
		for(int i=0;i<s.length();i++) {
			s1=s.charAt(i)+s1;
		}
		System.out.println("the reverse of the "+s+" is: "+s1);

	}

}
