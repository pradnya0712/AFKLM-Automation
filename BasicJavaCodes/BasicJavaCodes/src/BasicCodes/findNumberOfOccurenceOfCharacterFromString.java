package BasicCodes;

public class findNumberOfOccurenceOfCharacterFromString {
	public static void main(String[] args) {
		
		String s="Hello Pradnya How Are You lllllll ??";
		int bLength=s.length();
		String replaceChar="l";
		System.out.println("Length of string before replacing character: "+bLength);
		int aLength=s.replaceAll(replaceChar, "").length();
		System.out.println("Length of string after replacing character: "+aLength);
		
		
		int OccOfChar=bLength-aLength;
		System.out.println("No. of occurence of character "+replaceChar+" in a string is : "+ OccOfChar);
		
	}

}
