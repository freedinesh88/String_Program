package stringexample;

public class CheckForPalindrome {

	public static void main(String[] args) {
		String s="Madam";
		String s1="";
		for(int i=0;i<s.length();i++) {
			s1=s.charAt(i)+s1;
		}
		if(s.equalsIgnoreCase(s1)) {
			System.out.println(s+" is a palindrome");
		}
		else {
			System.out.println(s+" is not a palindrome");
		}

	}
	

}
