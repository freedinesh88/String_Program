package stringexample;

public class StringManipulation {

	public static void main(String[] args) {
		String s="a3b2d1c2";
		String res="";
		for(int i=0;i<s.length();i+=2) {
			char ch=s.charAt(i);
			char a=s.charAt(i+1);
			int b=Integer.parseInt(a+"");
			for (int j = 0; j < b; j++) {
				res=res+ch;
			}
			
		}
		System.out.println(res);
	}

}
