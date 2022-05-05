import java.util.Scanner;

public class OddandEvenNumbers {

	public static void main(String[] args) {
		
		int num;
		 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		
		num = scan.nextInt();
		
		if(num%2==0){
			System.out.println(num+" is a even number");
		
		}else{
			System.out.println(num+" is a odd number");
		}
		
	}

}
