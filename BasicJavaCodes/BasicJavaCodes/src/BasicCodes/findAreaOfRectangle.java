package BasicCodes;

import java.util.Scanner;

public class findAreaOfRectangle {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter length");
	double length=sc.nextDouble();
	System.out.println("Enter breath");
	double breath=sc.nextDouble();
	
	
	double areaOfRectangle=length*breath;
	double areaOfPerimeter=2*(length+breath);
	System.out.println("Area of rectangle is "+areaOfRectangle);
	System.out.println("Area of rectangle is "+areaOfPerimeter);

}
}
