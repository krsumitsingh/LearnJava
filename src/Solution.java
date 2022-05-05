import java.util.Scanner;


abstract class Calculator{
	
	abstract int add(int a, int b);
	
	void helloMethod(){
		System.out.println("this is a concrete method defined in the abstract class");
	}
	
}

 class Adder extends Calculator{

	@Override
	int add(int a, int b) {
		
		int sum;
		sum=a+b;
		return sum;
		}	
	
	void helloMethod(){
		System.out.println("this is a override  method ");
	}
}

public class Solution {
    public static void main(String[] args) {
        int a, b;
        try (Scanner scan = new Scanner(System.in)) {
            a = scan.nextInt();
            b = scan.nextInt();
        }

       Calculator adderObject = new Adder();
       // Adder adderObject = new Adder();
        System.out.println("The sum is: " + adderObject.add(a, b));
        adderObject.helloMethod();
        
    }
    
}

