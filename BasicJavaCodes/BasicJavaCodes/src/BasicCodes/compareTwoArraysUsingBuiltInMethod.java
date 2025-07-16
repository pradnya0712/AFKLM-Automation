package BasicCodes;

import java.util.Arrays;

public class compareTwoArraysUsingBuiltInMethod {
	
	public static void main(String[] args) {
		
		int[] arr= {44,0,1,3,5,7,8};
		int[] arr1= {0,1,3,5,7,8};
			
			if(Arrays.equals(arr, arr1)) {
				System.out.println("Both array have same elements");
				
			}
			else {
				System.out.println("Both array have differnt elements");
			}
	}

}
