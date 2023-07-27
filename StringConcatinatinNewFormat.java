package stringexample;

public class StringConcatinatinNewFormat {
public static void main(String[] args) {
	String s="aaabbbbefcc";
	String str="";
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
			str=str+s.charAt(i)+count;
		}
		
	}
	System.out.println(str);
}
}
