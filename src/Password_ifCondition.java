import java.util.Scanner;

public class Password_ifCondition {

	public static void main(String[] args) {

		int pwd;
		System.out.println("Enter your password: ");
		Scanner scan = new Scanner(System.in);
		pwd = scan.nextInt();
		
		if(pwd==270){
			
			System.out.println("Name is-->Sumit");
			System.out.println("Age is-->46");
			System.out.println("Address is-->2370, CAE Drive, IOWA City");
		}
		else{
			System.out.println("You have entered wrong password...");
		}
		

	}

}
