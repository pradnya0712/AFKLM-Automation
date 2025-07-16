package BasicCodes;

import java.util.Arrays;
import java.util.HashMap;

public class CheckStringAreAnagramOrNot {

	
	public static void main(String[] args) {
		
//		1). input two strings
//		2). convert this 2 string into charArray
//      3). Then sort this two charArray.
//      4). Then compare both array using equal method
		
		
		String str1="Pradnya";
		String str2="adnPrya";
		
		boolean statusOfString= checkAnagramString(str1, str2);
		System.out.println("Both string are Anagram:----- "+ statusOfString);
		
		
	}
	
	public static boolean checkAnagramString(String str1, String str2){
		
		char[] charArrayFromstr1= str1.toCharArray();
		char[] charArrayFromstr2= str2.toCharArray();
		
		Arrays.sort(charArrayFromstr1);
		Arrays.sort(charArrayFromstr2);
		
	
		return Arrays.equals(charArrayFromstr1, charArrayFromstr2);
		
	}
	
	
	public static void anagramstrings() {
		//second way

	    String str1 = "ayndarp";
	    String str2 = "pradnya";
	    
	    HashMap<Character,Integer> map1=new HashMap<>();
	    HashMap<Character,Integer> map2=new HashMap<>();
	    

	    if(str1.length()==str2.length()) {
	    	for(char c1:str1.toCharArray()) {
	    		map1.put(c1, map1.getOrDefault(c1, 0));
	    	}
	    	
	    	for(char c2:str2.toCharArray()) {
	    		map2.put(c2, map2.getOrDefault(c2, 0));
	    	}
	    }
	    else {
	    	System.out.println("Strings are noit anagram");
	    }

	    
	    if(map1.equals(map2)) {
	    	System.out.println("Strings are anagram");
	    }
	    else {
	    	System.out.println("Strings are not anagram");
	    }







	
	}
	
}
