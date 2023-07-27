package stringexample;

public class SumOfDigitPresentInString {

	public static void main(String[] args) {
		String s="1din2s4f67h";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9') {
				sum=Integer.parseInt(ch+"")+sum;
			}
		}
		System.out.println("the sum of no of digit present in the "+s+ " is: "+sum);

	}

}
