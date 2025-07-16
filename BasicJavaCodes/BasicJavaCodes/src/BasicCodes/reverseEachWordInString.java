package BasicCodes;

public class reverseEachWordInString {
	public static void main(String[] args) {
		String s = "this is my Home";
		String[] c = s.split(" ");

		
		//----------------First approach--------------------//
		String rev = "";

		for (String str : c) {
			String revWord = "";
			for (int i = str.length()-1; i >= 0; i--) {

				revWord += str.charAt(i);
			}
			
			rev+=revWord+" ";

		}
		
		System.out.println(s);
		System.out.println(rev);
		
		//------------------------Second approach--------------------//
		
		StringBuffer str=new StringBuffer("This is me");
	  
				
			StringBuffer re=str.reverse();
			System.out.println(re);
		
		
		
	}
}
