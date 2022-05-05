package basicPrograms;

import java.util.Scanner;

public class PalindromeString2 {

	static Scanner scan;
	static String str="";
	static int i;
	static int j;
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		System.out.println("Pleae enter a string");
		
		str = scan.nextLine().toLowerCase().trim();
	
		if(iSPalindrome(str)){
			
			System.out.println("The string "+str+" is palindrome");
			
			
		}else{
			System.out.println("The string "+str+" is not a palindrome");
		}
		
	}
	
	private static boolean iSPalindrome(String str) {
		
		i=0;
		j=str.length()-1;
			
			while(i<j){
				if(str.charAt(i)!=str.charAt(j))
					return false;
					i++;
					j--;
			}
			return true;		
	}

}
