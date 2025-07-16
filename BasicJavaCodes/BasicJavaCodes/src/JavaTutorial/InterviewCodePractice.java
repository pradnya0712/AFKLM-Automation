package JavaTutorial;

import java.io.IOException;
import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class InterviewCodePractice {
	public static void main(String[] args) throws IOException {

		// 1. Swap two numbers
//		int a=10;
//		int b=30;
//		int temp=0;
//		System.out.println(a+" "+b);
//		temp=a;
//		a=b;
//		b=temp;
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a+" "+b);

		// 2. Reverse number

//		int a=12345;
//		int orgNum=a;
//		int revNum=0;
//		
//		while(a!=0) {
//			revNum=revNum*10+a%10;
//			a=a/10;
//		}
//		
//		System.out.println(orgNum);
//		System.out.println(revNum);

		// 3. reverse string
//		String str="Pradnya Bhausaheb Gund";
//		StringBuilder sb=new StringBuilder();
//		StringBuilder s1=sb.append(str);
//		System.out.println(s1.reverse());
//		
//		String revStr="";
//		for(int i=str.length()-1;i>=0;i--) {
//			revStr+=str.charAt(i);
//		}
//		System.out.println(" ");
//		System.out.println(str);
//		
//		String[] arrStr=str.split(" ");
//		String str2="";
//		for(int i=arrStr.length-1;i>=0;i--) {
//			str2+=arrStr[i]+" ";
//		}
//		
//		System.out.println(str2);
//		System.out.println(revStr);

		// 4. check Pallindrome number

//		int a=1551;
//		int orgNum=a;
//		int paalindromeNum=0;
//		
//		while(a!=0) {
//			paalindromeNum=paalindromeNum*10+a%10;
//			a=a/10;
//			
//		}
//		
//		if(paalindromeNum==orgNum) {
//			System.out.println(orgNum+" is Pallindorme number");
//		}
//		else {
//			System.out.println(orgNum+" is not Pallindorme number");
//		}

		// 5. check pallindrome string

//		String str="Nayan";
//		String orgStr=str;
//		String revStr="";
//		System.out.println(str);
//		for(int i=str.length()-1;i>=0;i--) {
//			revStr+=str.charAt(i);
//		}
//		
//		System.out.println(revStr);
//		
//		if(revStr.equalsIgnoreCase(orgStr)) {
//			System.out.println(orgStr+" is Pallindorme string");
//		}
//		else {
//			System.out.println(orgStr+" is not Pallindorme string");
//		}

		// 6. count number of digits
//	     int a=435;
//	     int revNum=a;
//	     int count=0;
//	     
//	     while(a!=0) {
//	    	 revNum=revNum*10+a%10;
//	    	 count++;
//	    	 a=a/10;
//	     }
//	     
//	     System.out.println("There are "+count+" digits in the number");

		// 7. even and odd digits in the number

//		int i=56544;
//		int revNum=0;
//		int even=0;
//		int odd=0;
//		
//		while(i!=0) {
//			revNum=revNum*10+i%10;
//			if(revNum%2==0) {
//				even++;
//			}
//			else {
//				odd++;
//			}
//			i=i/10;
//			
//		}
//		 System.out.println("There are "+even+" even digits in the number");
//		 System.out.println("There are "+odd+" odd digits in the number");

		// 8.count sum of digits in the number

//		int a=342;
//		int revNum=0;
//		int sum=0;
//		int count=0;
//		while(a!=0) {
//			revNum=revNum*10+a%10;
//			count++;
//			sum=sum+count;
//			a=a/10;
//		}
//		System.out.println("Sum of "+count+" is "+sum);

		// 9. largest number out of 3

//		int a=45;
//		int b=78;
//		int c=142;
//		
//		int largestNumber=a>(b>c?b:c)?a:(b>c?b:c);
//		System.out.println(largestNumber +" is largest number out of three numbers");
//		int smallestNumber=a<(b<c?b:c)?a:(b<c?b:c);
//		System.out.println(smallestNumber +" is smallest number out of three numbers");

		// 10. fibbonacci series
//		
//		int a=0;
//		int b=1;
//		int temp=0;
//		
//		
//		for(int i=2;i<=10;i++) {
//			temp=a+b;
//			a=b;
//			b=temp;
//			System.out.print(temp+" ");
//		}

		// 11. check number is prime or not

//		int a=3;
//		int count=0;
//		int prime=0;
//		
//		
//		for(int i=1;i<=a;i++) {
//			if(a%i==0) {
//				count++;
//			}
//			
//		}
//		System.out.println(count);
//		if(count==2) {
//			System.out.println(a +" is prime number");
//		}

		// 12. Generate random numbers and strings

//		RandomStringUtils rn=new RandomStringUtils();
//		String randomStr=rn.randomAscii(4)+rn.randomAlphanumeric(5)+rn.randomNumeric(6);
//		System.out.println(randomStr);

		// 13. factorial of number

//		int fact=1;
//		int n=5;//120
//		for(int i=1;i<=n;i++) {
//			fact=fact*i;
//		}
//		
//		System.out.println("Factorial of "+n+" is "+fact);

		// 14. find sum of array elements

//		int[] arr= {1,5,2,8};
//		ArrayList<Integer> a=new ArrayList<>();
//		a.add(4);
//		a.add(5);
//		a.add(10);
//		a.add(2);
//		a.add(6);
//		
//		System.out.println(a);
//		int sum=0;
//		for(int i=0;i<arr.length;i++) {
//			
//			sum=sum+arr[i];
//		}
//		System.out.println("Sum of all array elements is "+sum);

		// 15. print even or odd numbers from array

//		int[] arr= {1,5,2,8,12};
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]%2==0) {
//				System.out.println("Even "+arr[i]);
//			}
//			else {
//				System.out.println("odd "+arr[i]);
//			}
//		}

		// 16. check equality of two arrays

//		int[] a= {1,5,2,81,12};
//		int[] b= {1,5,2,81,12};
//		int len1=a.length;
//		//System.out.println(len1);
//		int len2=b.length;
//		//System.out.println(len2);
//		boolean arrayEqualStatus=false;
//		if((len1-len2)==0) {
//			arrayEqualStatus=true;
//		}
//		
//		boolean status=true;
//		if(arrayEqualStatus==true) {
//			
//			for(int i=0;i<a.length;i++) {
//				if(a[i]!=b[i]) {
//					System.out.println("Arrays are not equal");
//					status=false;
//				}
//				
//				
//					
//				
//			}
//			
//			
//		}
//		else {
//			status=false;
//		}
//		
//		if(status==true) {
//			System.out.println("Both arrays are equal");
//		}
//		

		// 17. find missing number from array
//		int[] a= {1,5,2,3};
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
//		int range=a[a.length-1];
//		System.out.println(range);
//		
//		int sumTillRange=0;
//		for(int i=0;i<=range;i++) {
//			sumTillRange+=i;
//		}
//		System.out.println("Sum of all elements with missing number- "+sumTillRange);
//		int sumWithMissingNum=0;
//		for(int i=0;i<a.length;i++) {
//			sumWithMissingNum+=a[i];
//		}
//		
//		System.out.println("Sum of all elements without  missing number- "+sumWithMissingNum);
//		
//		System.out.println(sumTillRange-sumWithMissingNum+" it is missing element from array");

		// 18. find min and mx element from array
//		int[] a= {1,5,2,3};
//		Arrays.sort(a);
//		System.out.println(a[0]+" smallest array element");
//		System.out.println(a[a.length-1]+" largest array element");
//		int minValue=a[0];
//		int maxValue=0;
//		for(int i=0;i<a.length;i++) {
//			
//				if(a[i]>minValue) {
//					maxValue=a[i];
//				}
//				else {
//					minValue=a[i];
//				}
//			
//			
//		}
//		System.out.println(minValue+" smallest array element");
//		System.out.println(maxValue+" largest array element");

		// 19. find duplicate element from array
//		int[] a= {1,5,2,3,53,2};
//		boolean flag=false;
//		for(int i=0;i<a.length-1;i++) {
//			for(int j=i;j<a.length-1;j++){
//				if(a[i]==a[j+1]) {
//					flag=true;
//					System.out.println(a[i]);
//					break;
//				}
//		}
//		
//		
//		
//	}
//		if(flag==true) {
//			System.out.println("Array contain duplicate element");
//		}

		// 20. Search element in the array by linear search
//		int[] a= {1,5,2,3,53};
//		int search=1;
//		boolean elementFoundStatus=false;
//		
//		for(int i=0;i<a.length;i++) {
//			if(a[i]==search) {
//				elementFoundStatus=true;
//				System.out.println(search+ "  found at index "+ i);
//			}
//			
//		}
//		
//		if(elementFoundStatus==false) {
//			System.out.println("Element not present in the array");
//		}

		// 21.Search element in the array by binary search

//		int[] a= {1,5,2,3,53};
//		int search=3;
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
//		int l=0;
//		int h=(a.length-1);
//		int midvalue=l+h/2;
//		//System.out.println(midvalue);
//		boolean elementFoundStatus=false;
//		
//		if(search>midvalue) {
//			for(int i=midvalue;i<a.length;i++) {
//				if(a[i]==search) {
//					System.out.println(search+" found ata index "+i);
//					elementFoundStatus=true;
//				}
//		
//			}
//		}else {
//			for(int i=0;i<=midvalue;i++) {
//				if(a[i]==search) {
//					System.out.println(search+" found at index "+i);
//					elementFoundStatus=true;
//				}
//			}
//			
//		}
//		if(elementFoundStatus==false) {
//			System.out.println(search+" not present in the array");
//		}

		// 22. sort elements using bubble sort
//		int[] a= {1,5,2,3,53};
//		int minValue=0;
//		int maxValue=0;
//		
//		for(int i=0;i<a.length-1;i++) {
//			if(a[i]>a[i+1]) {
//				int temp=a[i];
//				a[i]=a[i+1];
//				a[i+1]=temp;
//			}
//		}
//		
//		System.out.println(Arrays.toString(a));
//		

		// 23. sort elements using built in methods
//		int[] a= {1,5,2,3,53};
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
//		Arrays.parallelSort(a);
//		
//		System.out.println(Arrays.toString(a));
//		

		// 24. remove junk or spl characters from the String

//		String str="^Pradnya%&^%&^$^_53543 rt%";
//		String newStr=str.replaceAll("[^a-zA-Z0-9]", "");
//		System.out.println(newStr);

		// 25. remove white space from the string

//		String str=" Pradnya Bhausaheb Gund ";
//		
//		String newStr=str.replaceAll("\\s", "");
//		System.out.println(newStr);

		// 26. count occurrences of character from the string
//		String str="Pradnya Bhausaheb Gund";
//		int strLength=str.length();
//		String countofCharacter="y";
//		String newStr=str.replace(countofCharacter, "");
//		int newLength=newStr.length();
//		
//		System.out.println(countofCharacter+" occurrs "+(strLength-newLength)+" times in the whole string");

		// 27. count total words in the string

//		String str="Pradnya Bhausaheb Gund";
//		String[] newStr=str.split(" ");
//		System.out.println(Arrays.toString(newStr));
//		
//		System.out.println("There are "+newStr.length+" words in the whole string");

		// 28. reverse each word of the string
//		
//		String str="Pradnya Bhausaheb Gund";
//		String[] newStr=str.split(" ");
//		System.out.println(str);
//		String revStr="";
//		
//		
//		
//			for(String word:newStr) {
//				String revWord="";
//				for(int i=word.length()-1;i>=0;i--) {
//					revWord=revWord+word.charAt(i);
//				}
//				
//				revStr=revStr+revWord+" ";
//			}
//			
//		System.out.println(revStr);

		// 29. write dow into text file

//		FileWriter fw=new FileWriter("C:\\Users\\Pradnya Gund\\Downloads\\practice1");
//		
//		fw.write("Pradnya Bhausaheb Gund \n");
//		fw.write("Pratik Bhausaheb Gund \n");
//		fw.write("Pratiksha Bhausaheb Gund \n");
//		fw.write("Shaila Bhausaheb Gund \n");
//		System.out.println("File written successfully.");
//		fw.close();
//		System.out.println("File closed successfully");
//		
//		//30. Read the data from file
//		
//		FileReader fb=new FileReader("C:\\\\Users\\\\Pradnya Gund\\\\Downloads\\\\practice1");
//		String str="";
//		BufferedReader br=new BufferedReader(fb);
//		System.out.println("File opened successfully");
//		while((str=br.readLine())!=null){
//			System.out.println(str);
//			
//		}
//		
//		br.close();
//		fb.close();
//		System.out.println("File closed successfully");

		// 31. check even and odd number

//		int from=1000;
//		int to=20000;
//		
//		int even=0;
//		int odd=0;
//		
//		for(int i=from;i<=to;i++) {
//			if(i%2==0) {
//				System.out.println("Even "+i);
//				even++;
//			}
//			else {
//				System.out.println("odd "+i);
//				odd++;
//			}
//		}
//		System.out.println("There are "+even+" even number between "+from+" to "+ to);
//		System.out.println("There are "+odd+" even number between "+from+" to "+ to);

		// 31. find median of odd and even array size

//		int[] a= {1,3,12,2,4,6,6,45};
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
//		int arrayLength=a.length;
//		int l=0;
//		int h=a.length-1;
//		int j=0;
//		int id=0;
//		
//		if(arrayLength%2==1) {
//			id=h/2;
//			System.out.println("Median of array is "+a[id]);
//		}
//		else {
//			 id=h/2;
//			double median=(double)(a[id]+a[id+1])/2;
//			System.out.println("Median of array is "+median);
//			
//		
//		}

		// 32. print alternate elements of array

//		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//
//		for (int i = 0; i < a.length - 1; i += 2) {
//
//			System.out.println(a[i]);
//
//		}

		// 33.
//		String str = "programming";
//		StringBuilder sb = new StringBuilder();
//		str.chars().distinct().forEach(c -> sb.append((char)c));
//		System.out.println();
//		System.out.println(sb);

//		char[] newStr=str.toCharArray();
//		for(int i=0;i<str.length();i++) {
//			char id=str.charAt(i);
//			int c=str.indexOf(id,i+1);
//			
//			if(c==-1) {
//				sb.append(id);	
//			}
//			else {
//				
//			}
//			
//		}
//		System.out.println(sb);

//		char[] ch = str.toCharArray();
//		
//		for (int i = 0; i < ch.length; i++) {
//			boolean repeatedStatus = false;
//			for (int j = i + 1; j < ch.length; j++) {
//				if (ch[i] == ch[j]) {
//					repeatedStatus = true;
//					break;
//				}
//			}
//			if (repeatedStatus == false) {
//				sb.append(ch[i]);
//			}
//		}
//
//		System.out.println(sb);

//		Set<Character> s=new LinkedHashSet();
//		for(int i=0;i<str.length()-1;i++) {
//			s.add(str.charAt(i));
//		}
//		
//		System.out.println(s);

//		System.out.println("Enter string to count vowels from string");
//		Scanner sc=new Scanner(System.in);
//		String s=sc.nextLine();
//		char[] c=s.toCharArray();
//		int count=0;
//		int add=0;
//		int len=s.length();
//		
//		for(char ch:c) {
//			switch(ch) {
//			case 'a':
//			case 'e':
//			case 'i':
//			case 'o':
//			case 'u':
//				count++;
//				
//			
//			
//			}
//		}
//		System.out.println("There are "+count+" vowels in the strings");
//		System.out.println("There are "+(len-count)+" consonants in the strings");
//		
//		String s="Pradnya Bhausaheb Gund";
//		String[] newStr=s.split(" ");
//		char[] array=s.toCharArray();
//		String emptyStr="";
//		String str="";
//		
//		int count=0;
//		int words=0;
//		for(char s1:array) {
//			System.out.print(s1+" ");
//		}
//		System.out.println();
//		for(int i=0;i<newStr.length;i++) {
//			emptyStr=newStr[i];
//			for(int j=0;j<emptyStr.length();j++) {
//				count++;
//			}
//			
//			System.out.println(emptyStr+" contains "+count+" characters");
//			count=0;
//			words++;
//		}
//		
//		System.out.println("There are "+words+ " words in the string");
//		
//		
//		System.out.println(s.replaceAll("\\s+", "").length());
//		String str="Pradnya";
//		String revString=reverseString(str);
//		System.out.println(revString);
////		
////
//	}

//	public static String reverseString(String str) {
//		
//		if(str==null || str.length()<=1) {
//			return str;
//		}
//		else {
//			return str.substring(1)+str.charAt(0);
//		}

//		String s = "Pradnya Gund";
//		StringUtils s1 = new StringUtils();
//		String[] array=s1.split(s," ");
//	for(String s2:array) {
//		System.out.print(s2);
//	}
//	

//		String s1="Pradnya";
//		String s2="Pradnya";
//		
//		
//		char[] newS1=s1.toCharArray();
//		int lenS1=s1.length();
//		char[] newS2=s2.toCharArray();
//		int lenS2=s2.length();
//		boolean equal=false;
//		
//		if(lenS1==lenS2) {
//			for(int i=0;i<lenS1;i++) {
//				if(s1.charAt(i)==s2.charAt(i)) {
//					equal=true;
//				}
//				else {
//					equal=false;
//				}
//			}
//		}
//		else {
//			System.out.println("Strings are not equal");
//		}
//		
//		if(!equal) {
//			System.out.println("Strings are not equal");
//		}
//		else {
//			System.out.println("Strings are equal");
//		}

//		String s1="Pradnya Bhausaheb Gund";
//		String s=s1.toLowerCase();
//		Map<Character,Integer> map=new HashMap<>();
//		
//		char[] newStr=s.toCharArray();
//		
//		for(char ch:newStr) {
//			
//			if(!map.containsKey(ch)) {
//				map.put(ch, 1);
//			}
//			else {
//				int count=map.get(ch);
//				map.put(ch, count+1);
//			}
//			
//		}
//		System.out.println(map);
//		
//		for (java.util.Map.Entry<Character, Integer> entrySet:map.entrySet()) {
//		if(entrySet.getValue()==1) {
//			
//			System.out.println(entrySet.getKey());
//			break;
//		}
//		}

		
//		String s="pradnya";
//		
//		char c='a';
//		char[] ch=s.toCharArray();
//		int count=1;
//		
//		for(int i=0;i<ch.length;i++) {
//			if(ch[i]==c) {
//				ch[i]=String.valueOf(count).charAt(0);
//				count++;
//			}
//		}
//		System.out.println(Arrays.toString(ch));
//	
		

	}
}
