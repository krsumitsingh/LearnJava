package basicPrograms;

import java.util.Scanner;

public class Factorial {
	
	static Scanner scan;
	
	static int fac=1;

	static int N;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		System.out.println("Please enter the number");
		N = scan.nextInt();
		System.out.println("The factorial of "+N+" is->"+factorial(N));
	}

	private static int factorial(int N2) {
		
		if(N2==0){
			return N2=1;
			
		}else{
			for(int i=1;i<=N2;i++){
				fac=fac*i;
			}
			return fac;	
		}		
	}
}
