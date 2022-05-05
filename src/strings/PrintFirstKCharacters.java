/*
 * Author - Sumit Kumar Singh
 */
package strings;

import java.util.Scanner;

public class PrintFirstKCharacters {
	
static Scanner scan;

	public static String firstKCharacters(String str, int k){
		// Check if the string is empty
        // or null then return null
		if(str.isEmpty()||str==null){
			return null;
		}
		 // Check if the string length
        // is greater than k, then
        // get the first k characters 
        // of the string, otherwise
        // return the string as it is		
		if(str.length()>k){
			return str.substring(0, k);
		}else {
			return str;
		}	
		
	}

	public static void main(String[] args) {
		System.out.println("Please enter the string:");
		
		scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		System.out.println("Please enter till where you want to extract the string");
		
		int k= scan.nextInt();
		
		System.out.println("The first K characters of the String are "+firstKCharacters(str, k));
		
	}

}
