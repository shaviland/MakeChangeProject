import java.util.Scanner;

public class MakeChangeApp {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double priceOwed = 34.50;
		double tenderPaid = 40.00;
		double roundedPenny = 0.005;
		
		
		double changeCalc = (tenderPaid - priceOwed + roundedPenny);
		System.out.println(changeCalc);
		
		int changeBreak = (int)(changeCalc * 100);
		System.out.println(changeBreak);
		
		
	}

}
