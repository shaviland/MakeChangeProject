import java.util.Scanner;

public class MakeChangeApp {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double priceOwed = 22.37;
		double tenderPaid = 40.00;
		double roundedPenny = 0.005;
		
		
		double changeCalc = (tenderPaid - priceOwed + roundedPenny);
		System.out.println(changeCalc);
		
		int penniesStart = (int)(changeCalc * 100);
		System.out.println(penniesStart);
		
		int bills = penniesStart / 100;
//		System.out.println("bills" + bills);
		int twenties = bills / 20;
		System.out.println("twenties " + twenties);
		int billsNext = bills % 20;
		System.out.println("bills next " + billsNext);
		int tens = billsNext / 10;
		System.out.println("tens " + tens);
		int billsRem = billsNext % 10;
//		System.out.println("bills rem " + billsRem);
		int fives = billsRem / 5;
		System.out.println("fives " + fives);
		int ones = billsRem % 5;
		System.out.println("ones " + ones);
		int coins = penniesStart % 100;
//		System.out.println("coins " + coins);
		int quarters = coins / 25;
		System.out.println("quarters " + quarters);
		int changeRem = coins % 25;
//		System.out.println("change rem " + changeRem);
		int dimes = changeRem / 10;
		System.out.println("dimes " + dimes);
		int moreCoins = changeRem % 10;
//		System.out.println("more coins " + moreCoins);
		int nickles = moreCoins / 5;
		System.out.println("nickles " + nickles);
		int penniesFinal = moreCoins % 5;
		System.out.println("pennies " + penniesFinal);
	}

}
