package BasicCodes;

public class countOccuranceOfCharactersFromString {
	public static void main(String[] args) {
		
		//----------------First approach-----------------//
		String s=" hello how are you guyz...??";
		int OriginalLength=s.length()-1;
		System.out.println(OriginalLength);
//		char[] c=s.toCharArray();
		
		String w=s.replaceAll("z", "");
		int len=w.length()-1;
		System.out.println(len);
		
		System.out.println("z occurs "+(OriginalLength-len)+" times in a given string");
		
	}

}