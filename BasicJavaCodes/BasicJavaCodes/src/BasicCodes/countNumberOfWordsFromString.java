package BasicCodes;

public class countNumberOfWordsFromString {

	public static void main(String[] args) {
		String s="This is my home and this is my Bike.";
		
		
//	for(String d:c) {
//		System.out.println(d);
//	}
	int count=0;	
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				count++;
			}
		}
	System.out.println("There are "+count+" words in a string");
		
	}
}
