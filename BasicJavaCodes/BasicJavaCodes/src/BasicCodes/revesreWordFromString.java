package BasicCodes;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.management.RuntimeErrorException;

public class revesreWordFromString {
	
	public static void main(String[] args) {
		
	String str="Pradnya";
	char NonRepeatedCharacter=nonRepeatedCharcaterFromString(str);
	System.out.println(NonRepeatedCharacter+ " --->> this is an first non-repeated character from the string");
	
	
}
	
	public static char nonRepeatedCharcaterFromString(String str) {
		
		char[] strTocharArray=str.toCharArray();
		Map<Character,Integer> m=new LinkedHashMap<Character,Integer>();
		
		//inserting values and keys into map
		for(char c:strTocharArray) {
		 m.put(c, m.containsKey(c) ? m.get(c)+1:1);
			
		}
		
		//Iterating throughout the map
		for(Entry<Character,Integer> e:m.entrySet()) {
			System.out.println(e.getKey()+"="+e.getValue());
		}
		
		//checking the non-repeated character from map
		for(Entry<Character,Integer> entry:m.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}
		throw new RuntimeException("Non-Repeated character didnt found");
		
	
		
	}
	

}