package BasicCodes;

import java.util.Arrays;

public class SortingArray {
	public static void main(String[] args) {
		
		int[] a= {1,200,7,35,100};
		
		//first approach using built in method
		System.out.println("Before sorting array: "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sorting array: "+Arrays.toString(a));
		
	//	Arrays.parallelSort(a);
		
		//Second Approach using logic
		
		int[] b= {45,67,2,98,7};
		System.out.println("Before sorting array: "+Arrays.toString(b));
		int temp=0;
		for(int i=0;i<b.length;i++) {
			
			for(int j=i+1;j<b.length;j++) {
				
				if(b[i]>b[j]) {
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
				
			}
		}
		
		System.out.println(Arrays.toString(b));
		
	}

}
