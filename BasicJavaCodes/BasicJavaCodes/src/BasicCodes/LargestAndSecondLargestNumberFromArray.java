package BasicCodes;

public class LargestAndSecondLargestNumberFromArray {
	public static void main(String[] args)
    {
       int[] array= {100,34,76,89,34};
       System.out.println("Given array is:");
       for(int i=0;i<=array.length-1;i++) {
    	   System.out.print(array[i]+" ");
       }
       System.out.println();
       int largest=0;
       int secondLargest=0;
       for(int i=0;i<=array.length-1;i++) {
    	  
    		   if(array[i]>largest) {
    			   secondLargest=largest;
    			   largest=array[i];
    		   }
    		   else if(array[i]>secondLargest) {
    			   secondLargest=array[i];
    		   }
    	  
       }
       
	   System.out.println("Largest number from array is: "+largest);
	   System.out.println("Second largest number from array is :"+secondLargest);
   
       
    }
	
	

}
