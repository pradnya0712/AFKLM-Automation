package BasicCodes;

public class findLargestNumberUsingTwoWay {
	public static void main(String[] args) {
		int a=112;
		int b=697;
		int c=334;
		
		
		///--------------------first method using and operator-----------------------//
					//		if(a>b && a>c) {
					//			System.out.println(a+" is largest number amongs "+b+" and  "+c);
					//			
					//		}
					//		else if(b>a && b>c) {
					//			System.out.println(b+" is largest number amongs "+a+" and  "+c);
					//		}
					//		else {
					//			System.out.println(c+" is largest number amongs "+a+" and  "+c);
					//		}
		
		
		///-----------------------Second MEthod using Ternary operator-------------------///
								int largest=c>(a>b?a:b)?c:(a>b?a:b);
								System.out.println("Largest Number is: "+largest);
	}

}
