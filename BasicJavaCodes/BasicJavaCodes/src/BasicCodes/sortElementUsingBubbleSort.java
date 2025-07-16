package BasicCodes;

import java.util.Arrays;
import java.util.Collections;

public class sortElementUsingBubbleSort {
	public static void main(String[] args) {
		//bubble sort works like:-means compare two adjacent element and replace them.
		
		
		//----------------Using logic----------------------------//
		System.out.println("//-----------------Using Logic---------------//");
		int[] a= {2,32,1,34,89,87,98,378,1000,467};
		System.out.println("before sorting"+Arrays.toString(a));
		//System.out.println(a[9]);
	int length=a.length-1;
	for(int i=0;i<length;i++) {
		
		for(int j=0;j<length;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				//System.out.println(a[j]);
			}
		}
		
	}
	System.out.println("after sorting"+Arrays.toString(a));
	//System.out.println(a[9]);

	System.out.println();
	
	//------------------------Using built-in methods-------------------------//
	System.out.println("//-----------------Using Built In Methods---------------//");
	int[] arr= {0,4,2,1,5,3};
	System.out.println("Before sorting : "+Arrays.toString(arr));
	//1) Approach first
	Arrays.parallelSort(arr);//to sorting
	//2) Approach second
	Arrays.sort(arr);
	System.out.println("After sorting : "+Arrays.toString(arr));
	//3) Approach to sort the element in descending order
	//for reverse order datatype of array should be non-primitive or complext
		Integer[] array= {0,4,2,1,5,3};
	Arrays.sort(array,Collections.reverseOrder());
	System.out.println("After sorting : "+Arrays.toString(array));
		
	}

}
