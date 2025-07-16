package BasicCodes;

import java.util.Random;

public class generateRandomNumbers {

	public static void main(String[] args) {
		System.out.println("Using Math function");
		double randomValue=Math.random();
		System.out.println(randomValue);
		int range=15;
		System.out.println((int)(range*randomValue));
		
		System.out.println("Using Random class");
		Random ra=new Random();
		int a=ra.nextInt(range);
		System.out.println(a);
		
	}
}
