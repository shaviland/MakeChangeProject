import java.util.Scanner;

public class MakeChangeApp {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double priceOwed = 22.50;
		double tenderPaid = 40.00;
		double roundedPenny = 0.005;
		
		
		double changeCalc = (tenderPaid - priceOwed + roundedPenny);
		System.out.println(changeCalc);
		
		int pennies = (int)(changeCalc * 100);
		System.out.println(pennies);
		
		int bills = pennies / 100;
		System.out.println(bills);
		int changeRem = pennies % 100;
		System.out.println(changeRem);
	}

}
