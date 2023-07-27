package stringexample;

public class ReverseTheStringType2 {

	public static void main(String[] args) {
		String s="java html css";
		String[] s1=s.split(" ");
		String str="";
		for(int i=s1.length-1;i>=0;i--) {
			str=str+s1[i]+ " ";
		}
		System.out.println(str);

	}

}
