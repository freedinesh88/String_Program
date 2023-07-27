package stringexample;

public class RemoveTargetedWordFromString {

	public static void main(String[] args) {
		String s="This is a java class";
		String target="is";
		String res=removeWord(s,target);
		System.out.println(res);

	}

	public static String removeWord(String s, String target) {
        int index = s.indexOf(target);
        while (index != -1) {
            s = s.substring(0, index) + s.substring(index + target.length());
            index = s.indexOf(target, index);
        }
        return s;
    }

}
