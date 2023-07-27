package stringexample;

public class RemoveDuplicateCharacterFromString {

	public static void main(String[] args) {
		String s="javav";
		String s1="";
		
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)&&i>j) {
					break;
				}
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
				
			}
			if(count>0) {
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);
		

	}

}
