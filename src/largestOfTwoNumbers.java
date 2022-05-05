import java.util.Scanner;

public class largestOfTwoNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int A, B;
		System.out.println("enter number A");
		A = scan.nextInt();
		System.out.println("enter number B");
		B = scan.nextInt();
		
		if(A>B){
			System.out.println(A+" is greater than "+ B);
		}
		else{
			System.out.println(B+" is greater than "+ A);
		}
	}

}
