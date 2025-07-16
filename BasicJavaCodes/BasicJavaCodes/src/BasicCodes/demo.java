package BasicCodes;

import java.awt.AWTException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class demo {

	
	public static void main(String[] args) throws AWTException, IOException {
		
		//1. calculate simple interest
		
//		int p=13000;
//		int r=3;
//		double t=2.2;
//		
//		double interest=p*r*t/100;
//		
//		System.out.println(interest);
//		
		//2. Calcuate compund interset
		
//		double amount=p*Math.pow((1+r/100.0), t);
//		double compundInterest=amount-p;
//		System.out.println(compundInterest);
		
		
		//3. find duplicate number from array
		
//		int[] a= {10,20,30,80,40};
//		boolean duplicate=false;
//		
//		for(int i=0;i<a.length-1;i++) {
//		for(int j=i+1;j<a.length;j++) {
//			if(a[i]==a[j]) {
//				duplicate=true;
//				System.out.println(a[i]);
//				break;
//			}
//		
//		}
//		
//		}
//		System.out.println(duplicate);
//		int count=0;
//		//4. print a-z alphabets
//		for (char a='A'; a<='Z';a++) {
//			System.out.print(a+" ");
//			count++;
//		}
//		
//		System.out.println("\n"+count);
		
		
//		String str="Java@1234Program";
//		String newStr=str.replaceAll("[^a-zA-Z]", "");
//		System.out.println(str);
//		System.out.println(newStr);
		
 //--------      String str="Pra$^%$&dunya";
       String newStr=str.replaceAll("[a-zA-Z]", "");
       newStr.trim();
       System.out.println(newStr);
       String newStr1=str.replace(newStr, "-");
       System.out.println(newStr1);
       String[] newStr2=newStr1.split("-");
       System.out.println(Arrays.toString(newStr2));
       String revword="";
       String revString="";
       for(String s:newStr2) {
    	   String word=s;
    	   for(int i=word.length()-1;i>=0;i--){
    		   revword+=word.charAt(i);
    	
    	   }
    	revword=revword+" ";
       }
      String r=revword.trim();
       System.out.println(r);
       System.out.println(r.replace(" ", newStr));
       
       
       ///-----------------
      
       
 


		
		  
	
 }
 

		




}
