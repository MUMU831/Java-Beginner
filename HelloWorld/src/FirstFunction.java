import java.util.Scanner;

public class FirstFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius;
		double area;
		final double pi=3.142;
		byte mynumber = 50;
		byte mychar = '1';
		boolean bbb = true;
		
		if(!bbb) 
			System.out.print("\nyou will get the grade");
		Scanner readInput = new Scanner(System.in);
		//instantiate the scanner object, readInput is a reference to scanner
		
		System.out.print("Enter the radious: ");
		
		radius = readInput.nextInt(); //use the reference and send the message by calling a method
		
		area=pi*radius*radius;
		System.out.printf("The area is: " + area*pi);
		System.out.printf("5195 is fun course");
		System.out.printf("\rHello Student");
		System.out.printf("Hello mi amour hahahahha");
		System.out.printf("\n Char is %d, Number is %c \n", mychar, mynumber);
	}
}
