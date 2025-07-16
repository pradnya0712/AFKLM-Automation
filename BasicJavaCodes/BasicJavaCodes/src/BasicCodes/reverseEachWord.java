package BasicCodes;

public class reverseEachWord {

	
	public static void main(String[] args) {
		
		String s="Hello Pradnya Good Afternoon";
		
		String[] words=s.split(" ");
		String revString="";
		
		for(String word:words) {
			
			String reverseWord="";
			
			for(int j=word.length()-1;j>=0;j--) {
				reverseWord=reverseWord+word.charAt(j);
			}
			
			revString=revString+reverseWord+" ";
		}
		
		System.out.println(s);
		System.out.println(revString);
		
	}
}
