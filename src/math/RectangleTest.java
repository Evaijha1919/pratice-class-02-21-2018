package math;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in=new Scanner(System.in);	
		
	for(int i=0; i<3; i++){
	
	System.out.println("Enter the length");
		System.out.println("Enter the width");
	int length= in.nextInt();
	int width= in.nextInt();
		
		
		
		
		
		
Rectangle r1 = new Rectangle (length,width);
System.out.println(r1.getArea());

System.out.println(r1.getPreimeter());
	}






	}

}
