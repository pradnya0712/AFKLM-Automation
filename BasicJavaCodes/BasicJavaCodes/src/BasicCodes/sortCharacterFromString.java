package BasicCodes;

import java.util.Arrays;

public class sortCharacterFromString {

	public static void main(String[] args) {
		
		String str="pratik sadupatil";
		char[] newStr=str.toCharArray();
		
		Arrays.sort(newStr);
		for(char c:newStr) {
			System.out.print(c+" ");
		}
		
	}
	
}
