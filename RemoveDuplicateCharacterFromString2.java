package stringexample;

public class RemoveDuplicateCharacterFromString2 {

	public static void main(String[] args) {
		String s="java";
		String s1="";
		for(int i=0;i<s.length();i++) {
			int c=s1.indexOf(s.charAt(i));
			if(c==-1) {
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);

	}

}
