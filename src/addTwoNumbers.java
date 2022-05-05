import java.util.Scanner;

public class addTwoNumbers {

	public static void main(String[] args) {
		
		double a,b,c;
		
		System.out.println("Enter any 2 numbers");;
		Scanner scan  = new Scanner(System.in);
		
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = a+b;
		scan.close();
		
		System.out.println("The sum of 2 numbers is "+c);
		
	}

}
