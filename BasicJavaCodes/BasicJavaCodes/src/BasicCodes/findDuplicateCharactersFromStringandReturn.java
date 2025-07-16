package BasicCodes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class findDuplicateCharactersFromStringandReturn {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter String");
	    String str=sc.nextLine();
	    char[] ca = str.toCharArray();
	    
	    Map<Character,Integer> m=new HashMap<Character,Integer>();
	    
	    for(Character c:ca) {
	    	if(m.containsKey(c)) {
	    		m.put(c, m.get(c)+1);
	    	}
	    	else {
	    		m.put(c, 1);
	    	}
	    	
	    }
	    
	    for(Character ch:m.keySet()) {
	    	if(m.get(ch)>1) {
	    		System.out.println("character " +ch+" is repeated "+m.get(ch)+" times");
	    	}
	    }
	
	}
}
