package BasicCodes;

import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;

public class generateRandomNumberUsing3Way {
	public static void main(String[] args) {
	
		//-------------By using Random class-------------//
		System.out.println("//------------------Generated Random number using Random Class--------------------//");
		Random random=new Random();
		int num=random.nextInt(100);//here excluded 100
		System.out.println(random.nextDouble());
		System.out.println(random.nextInt());
		System.out.println(random.nextBoolean());
		System.out.println(num);
		System.out.println();
		
		//-------------By using Math Function-----------------//
		System.out.println("//-------------Generated random number using Math function--------------------//");
		double n=Math.random();//it genrate double value
		System.out.println(n);
		System.out.println();
		
		//-----------------BY using Apache common lang class-----------------//
		System.out.println("//---------------Generated Random String and Numbers Using RandomStringUtils class---------------//");
		RandomStringUtils r=new RandomStringUtils();
		String string=r.randomAlphabetic(8);
		String number=r.randomNumeric(7);
		System.out.println("Generated random string of 4 length : "+string);
		System.out.println("Generated random number of 3 digits: "+number);
		
		
		
	}

}
