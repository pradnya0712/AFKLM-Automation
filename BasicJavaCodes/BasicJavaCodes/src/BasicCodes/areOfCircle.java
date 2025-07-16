package BasicCodes;

import java.util.Scanner;

public class areOfCircle {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter radius");
	double radius=sc.nextDouble();
	double pi=Math.PI;
	
	double areaOfCircle=pi*radius*radius;
	double perimeterOfCircle=2*pi*radius;
	System.out.println("Area of circle having the given radius "+radius+" is : "+areaOfCircle);
	System.out.println("Perimeter of circle having the given radius "+radius+"is: "+perimeterOfCircle);
	
	
}
}
