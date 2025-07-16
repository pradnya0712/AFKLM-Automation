package BasicCodes;

import java.util.Arrays;

public class findMaxandMinElementFromArray {
 public static void main(String[] args) {
	 
	 int[] a= {1,4,7,400,113};
	 //using sorted array
	 Arrays.sort(a);
	 
	 System.out.println("Min element: "+a[0]);
	 System.out.println("Max element: "+a[a.length-1]);
	 
	 
	 
	 
	 
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
