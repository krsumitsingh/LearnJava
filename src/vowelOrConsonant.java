import java.util.Scanner;

public class vowelOrConsonant {

	static char inputChar;
	
	
	public static void main(String[] args) {
		
		System.out.println("Please enter a charcater");
		
		Scanner scan = new Scanner(System.in);
				
		/**
		 * scan.next() will read a single char as a string and then use charAT(0) to get the first char of that string.
		 */
		inputChar = scan.next().charAt(0);
		scan.close();
		switch(inputChar){
		case 'A':
			System.out.println("The "+inputChar+" is a vowel");
			break;
			
		case 'E':
			System.out.println("The "+inputChar+" is a vowel");
			break;
			
		case 'I':
			System.out.println("The "+inputChar+" is a vowel");
			break;
			
		case 'O':
			System.out.println("The "+inputChar+" is a vowel");
			break;
			
		case 'U':
			System.out.println("The "+inputChar+" is a vowel");
			break;		
		
		default:
			System.out.println("The "+inputChar+" is a Consonant");
			
		}
		
		

	}

}
