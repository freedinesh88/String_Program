package stringexample;

public class CharacterCountMethod_1 {

	public static void main(String[] args) {
		String s="javAA1$$$$T5FrG";
		int cU=0,cL=0,cD=0,cS=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z') {
				cU++;
				
			}
			else if(ch>='a'&&ch<='z') {
				cL++;
			}
			else if(ch>='0'&&ch<='9') {
				cD++;
			}
			else{
				cS++;
			}
		}
		System.out.println("The no of Upper case: "+cU);
		System.out.println("The no of Lower case: "+cL);
		System.out.println("The no of Digit: "+cD);
		System.out.println("The no of Special chacter: "+cS);

	}

}
