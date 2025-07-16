package BasicCodes;

import java.util.Arrays;

public class FindingMax_MinElementFromArray {
	public static void main(String[] args) {

		int[] a = { 4335, 1,3, 4, 23, 500 };

		Arrays.sort(a);
		System.out.println("min:" + a[0]);
		System.out.println("max: " + a[a.length - 1]);

		int length = a.length - 1;
		int max1 = a[0];
		int min1=0;
		
		for (int i = 0; i <= length; i++) {

			if (a[i] > max1) {
				max1 = a[i];
			}
			else {
				min1=a[i];
			}

		}

		System.out.println("Min Element from array: " + min1);
		System.out.println("Max Element from array: " + max1);

		
		
		 //using unsorted array
		 int[] b= {11113,500,400,7000};
		// Arrays.sort(b);
		 int max=b[0];
		 int min=b[0];
		 for(int i=0;i<b.length;i++) {
			 
			 if(b[i] > max) {
				 max=b[i];
			 }
			 if(b[i]<min) {
				 min=b[i];
			 }
		
			 
		 }
		 System.out.println("min: "+min);
		 System.out.println("max: "+max);
	}

}
