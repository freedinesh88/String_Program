package stringexample;

public class StringManipulation_2 {
	public static void main(String[] args) {
		String s = "a3b2dfkce2";
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch >= '0' && ch <= '9') {
				int n = Integer.parseInt(ch + "");
				for (int j = 0; j < n; j++) {
					res = res + s.charAt(i - 1);
				}
			} else if (s.charAt(i + 1) < '0' || s.charAt(i + 1) > '9') {
				res = res + ch;
			} 
		}
		System.out.println(res);
	}
    
    
}
