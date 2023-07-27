package stringexample;
import java.util.Scanner;

public class PalindromepresentInString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String substring = input.substring(i, j);
                if (isPalindrome(substring)&&substring.length() > 1) {
                    System.out.println(substring);
                }
            }
        }
	}
	public static boolean isPalindrome(String str)
    {
        
        String rev = "";
        boolean ans = false;
 
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }

}
