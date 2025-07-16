package BasicCodes;

import java.util.Arrays;

public class missingNumbersFromArray {
	public static void main(String[] args) {
		
		//-----------------FInding single missing number from array.---------------------------//
		
						int[] a= {1,2,3,4,6,7};
						System.out.println("length of a:"+a.length);
						Arrays.sort(a);
						System.out.println("Sorted Array is: ");
						for (int i = 0; i < a.length; i++)   
						{       
						System.out.print(a[i]+" ");   
						}   
						
						System.out.println();
						
						int length=a.length-1;
						int sum=0;
						for(int i=0;i<=length;i++) {
							sum+=a[i];
						}
						System.out.println("Sum of array elements: "+ sum);
						
					int max=0;
					for(int i=0;i<=length;i++) {
						if(a[i]>max) {
							max+=a[i];
						}
					}
					System.out.println("Max element from array is: "+max);
					
					int n=(max*(max+1))/2;
					System.out.println("Sum of all elements upto max element is: "+n);
					
					System.out.println("Missing Element from array is: "+(n-sum));
					System.out.println();
				
		
		//---------------------Finding n missing numbers from array-----------------------------------//
		
					
					//1st approach
					int[] numbers = {0,1,3,4,6,7,9};
		          String num="";
		          for(int i: numbers) {
		        	  num+=String.valueOf(i);
		          }
		          
		          System.out.println("Missing Numbers from array find using built-in methods...");
		    
				   int range=numbers[numbers.length-1];
				   int miss=0;
					for(int i=0;i<range;i++) {
						if(!(String.valueOf(num).contains(String.valueOf(i)))) {
							System.out.println(i);
						}
					
//						if(i==numbers[miss]) {
//							
//							miss++;
//						}
//						else {
//							System.out.println(i);
//						}
						
					}
					
					
					
				    //2nd approach
					Arrays.sort(numbers);
					System.out.println("Missing Numbers from array find using logic...");
					int numbersArrayIndex = 0;
					for (int i = 0; i < numbers[numbers.length - 1]; i++) {
					    if (i == numbers[numbersArrayIndex]) {
					        numbersArrayIndex++;
					    }
					    else {
					        System.out.println(i);
					    }
					}
	}
	
	
	

}
