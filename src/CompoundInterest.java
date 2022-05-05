import java.util.Scanner;

public class CompoundInterest {
	static double principle;
	static double rateOfInterest1, rateOfInterest;
	static int time;
	static int numberOfTimes;

	public void comInterest(double p, double r, int t, int n) {

		double Amount;
		Amount = p * Math.pow((1 + r / n), n * t);
		System.out.println("The Amount after "+t+" year is "+String.format("%.2f",Amount));
		double CI = Amount - p;
		System.out.println("The Compound Interest after "+t+" year is "+String.format("%.2f",CI));

	}

	public static void main(String[] args) {

		System.out.println("Please enter Principal Amount");
		Scanner scan = new Scanner(System.in);
		principle = scan.nextDouble();
		System.out.println("Please enter Rate Of Interest");
		rateOfInterest1 = scan.nextDouble();
		rateOfInterest = rateOfInterest1 / 100;
		System.out.println("Please enter Time");
		time = scan.nextInt();
		System.out.println("Please enter Number Of Times");
		numberOfTimes = scan.nextInt();
		CompoundInterest CI = new CompoundInterest();
		CI.comInterest(principle, rateOfInterest, time, numberOfTimes);

	}

}
