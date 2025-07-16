package BasicCodes;

import java.util.Arrays;

public class deleteDuplicateValuesFromArray {

	
	public static void main(String[] args) {
		//this logic only works on sorted array
		//QAFox channel for problem soloving.
		int[] arr= {1,2,4,4,5,7,9,8,8,2};
		Arrays.sort(arr);
		int j=0;
				
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				//here we check 1st nd 2nd element
				arr[j]=arr[i];
				j++;
			}
			
			
			
		}
		
		arr[j]=arr[arr.length-1];//this is used to stored the last element from array.
		
		for(int k=0;k<=j;k++) {
			//here we print all the element by removing duplicates
			System.out.print(arr[k]+" ");
		}
		
		
	}
}
