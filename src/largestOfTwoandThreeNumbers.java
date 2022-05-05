import java.util.Scanner;

public class largestOfTwoandThreeNumbers {

	public static void main(String[] args) {

		int a,b,c;
		System.out.println("Please enter numbers");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		if(a>b&&a>c){
			System.out.println("Largest number is.."+a);
		}
		
		else if(b>a&&b>c){
			System.out.println("Largest number is.."+b);
		}
		else{
			System.out.println("Largest number is.."+c);
		}
	}

}
