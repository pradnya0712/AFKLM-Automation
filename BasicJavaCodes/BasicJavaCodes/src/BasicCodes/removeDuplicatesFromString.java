package BasicCodes;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicatesFromString {

	public static void main(String[] args) {

		String str = "Praaaa";
		char[] c = str.toCharArray();
		String newStr=removeDuplicateCharacter(str);
		System.out.println(newStr);

	}

	public static String removeDuplicateCharacter(String str) {
		Set<Character> uniqueCharacter = new HashSet<>();
		StringBuffer sb=new StringBuffer();

		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if (!uniqueCharacter.contains(ch)) {
				uniqueCharacter.add(ch);
				sb.append(ch);

			}
		}
		
//return uniqueCharacter.toString();------>> print character in array. and stringbuffer print character in string.
		return sb.toString();

	}
}
