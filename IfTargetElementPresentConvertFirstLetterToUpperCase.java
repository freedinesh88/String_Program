package stringexample;
import java.util.Scanner;

public class IfTargetElementPresentConvertFirstLetterToUpperCase {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Sentence: ");
		String sentence=sc.nextLine();
		System.out.println("Enter the target element");
		char target=sc.next().charAt(0);
		String[] ch=sentence.split(" ");
		String str1="";
		for(String word:ch) {
			if(checkWord(word,target)) {
				str1=str1+" "+capitalizeFirstLetter(word);
			}
			else {
				str1=str1+" "+word;
			}
		}
		System.out.println(str1.trim());
		


	}
	public static boolean checkWord(String str,char ch) {
		for(int i=0;i<str.length();i++) {
			if(ch==str.charAt(i)) {
				return true;
			}
		}
		return false;
	}
	public static String capitalizeFirstLetter(String original) {
	    
	   return original.substring(0, 1).toUpperCase() + original.substring(1);
		
	}

}
