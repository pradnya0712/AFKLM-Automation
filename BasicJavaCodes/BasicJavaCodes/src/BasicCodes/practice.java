package BasicCodes;

import java.util.HashMap;
import java.util.Map;

public class practice {
public static void main(String[] args) {
//	//swap two numbers
//	int n1=102;
//	int n2=400;
//	System.out.println("Before swapping "+n1+" "+n2);
//	
//	n1=n1+n2;
//	n2=n1-n2;
//	n1=n1-n2;
//	
////	int temp=n1;
////	n1=n2;
////	n2=temp;
//	System.out.println("After swapping "+n1+" "+n2);
	
	//-----------java program to find even and odd numbers from array separately.------------------------//
	
	int arr[]= {1,3,4,7,8,9,10};
	int even=0;
	int odd=0;
	
	for(int i:arr) {
		if(i%2==0){
			even++;
		}
		else {
			odd++;
		}
	}
	
	System.out.println("There are "+even+" even numbers present in the given array.");
	System.out.println("There are "+odd+" odd numbers present in the given array.");
	
	
	//---------------------java program to reverse the number---------------------------//
	int a=1568;
	int originalNum=a;
	int remainder=0;
	int rev=0;
	while(a>0) {
		
		 remainder=a%10;
		 rev=remainder+(rev*10);
		a=a/10;
		
	}
	System.out.println(originalNum);
	
	System.out.println(rev);
	
	
	//-------------------------------java program to remove special characters space from the the string---------------//
	
	String s="Hello Pradnya12@";
	
	String str=s.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(str);
	
	
	///----------------java program to remove all  white spaces between string----------------------------//
	
	String str1="A B C D";
	System.out.println(str1.replaceAll("[\\s]", ""));
	
	
	
	//-------------------count number of occurances of character in s string ------------------------------//
	
	String str2=" Hello Pradnya. How are you??";
	
	char[] c=str2.toCharArray();
	System.out.println(c.length);
	
	Map<Character,Integer> m=new HashMap<Character, Integer>();
	
	for(Character ch:c) {
		
		if(m.containsKey(ch)) {
			m.put(ch, m.get(ch)+1);
			
		}
		else {
			m.put(ch, 1);
		}
		
		
		
		
	}
	
	//------to take the count of each character in strings.-----//
	for(Character cha:m.keySet()) {
		if(m.get(cha)>0) {
			System.out.println(cha+" occurs "+m.get(cha)+" times");
			
		}
	}
	
	
	
	//---Second approach to find the occurance of character in String----------------------//
	
	String str3="Hellli lovely man..";
	
	char[] c1=str3.toCharArray();
	char find='a';
	int count=0;
	
	for(int i=0;i<c1.length;i++) {
		if(find==c1[i]) {
			count++;
			
			
		}

	}
	System.out.println(find+ " is occur "+count+" times");
	
	
	
	//---------------------reverse string-------------------//
	
	String st4="Hello Mona";
	
	String reverse="";
	
	for(int i=st4.length()-1;i>=0;i--) {
		
		reverse+=st4.charAt(i);
	}
	
	System.out.println(reverse);
	
	
	//-------------
	
	
	
	
	
}
	

	
}
