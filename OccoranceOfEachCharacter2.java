package stringexample;
import java.util.Scanner;

public class OccoranceOfEachCharacter2 {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the string :");
		String s=sc.nextLine();
		String str="";
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
				if(i>j && (s.charAt(i)==s.charAt(j))) {
					break;
				}
				if(s.charAt(i)==s.charAt(j)) {
					str=str+s.charAt(i);
					break;
				}
			}
		}
		
		for(int i=0;i<str.length();i++) {
			int count=0;
			for(int j=0;j<s.length();j++) {
				if(str.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			System.out.println(str.charAt(i)+ "----->"+count);
			
		}

	}

}
