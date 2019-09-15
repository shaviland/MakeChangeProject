import java.math.BigDecimal;
import java.util.Scanner;

public class MakeChangeApp {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double priceOwed = 0.0;
		double tenderPaid = 0.0;

		while (true) {
			System.out.println("Please input amount owed: ");
			priceOwed = kb.nextDouble();

			System.out.println("Please input amount paid: ");
			tenderPaid = kb.nextDouble();

			if (tenderPaid < priceOwed) {
				System.out.println("Not enough tender. Please pay the amount owed. $" + priceOwed);
			} else if (tenderPaid == priceOwed) {
				System.out.println("Payment accepted. No change.");
			} else {
				System.out.println("The change is:\n");
			}
			changeCalculation(tenderPaid, priceOwed);

			System.out.println("\nWould you like another transaction?");
			String again = kb.next();
			if (again.equalsIgnoreCase("no") || again.equalsIgnoreCase("n")) {
				System.out.println("Goodbye.");
				break;
			}

		}
		kb.close();
	}

	public static void changeCalculation(double tenderPaid, double priceOwed) {
		double roundedPenny = 0.005;
		double changeCalc = (tenderPaid - priceOwed + roundedPenny);
//		System.out.println(changeCalc);
		int decimalPlaces = 2;
		BigDecimal bd = new BigDecimal(changeCalc);
		bd = bd.setScale(decimalPlaces, BigDecimal.ROUND_DOWN);
		double changePrint = bd.doubleValue();
		if (changePrint > 0) {
			System.out.println("$" + changePrint);
		}

		int penniesStart = (int) (changeCalc * 100);
//		System.out.println(penniesStart);		

		int bills = penniesStart / 100;
//		System.out.println("bills" + bills);
		int twenties = bills / 20;
		if (twenties > 0) {
			System.out.println("twenties: " + twenties);
		}
		int billsNext = bills % 20;
//		System.out.println("bills next " + billsNext);
		int tens = billsNext / 10;
		if (tens > 0) {
			System.out.println("tens: " + tens);
		}
		int billsRem = billsNext % 10;
//		System.out.println("bills rem " + billsRem);
		int fives = billsRem / 5;
		if (fives > 0) {
			System.out.println("fives: " + fives);
		}
		int ones = billsRem % 5;
		if (ones > 0) {
			System.out.println("ones: " + ones);
		}
		int coins = penniesStart % 100;
//		System.out.println("coins " + coins);
		int quarters = coins / 25;
		if (quarters > 0) {
			System.out.println("quarters: " + quarters);
		}
		int changeRem = coins % 25;
//		System.out.println("change rem " + changeRem);
		int dimes = changeRem / 10;
		if (dimes > 0) {
			System.out.println("dimes: " + dimes);
		}
		int moreCoins = changeRem % 10;
//		System.out.println("more coins " + moreCoins);
		int nickles = moreCoins / 5;
		if (nickles > 0) {
			System.out.println("nickles: " + nickles);
		}
		int penniesFinal = moreCoins % 5;
		if (penniesFinal > 0) {
			System.out.println("pennies: " + penniesFinal);
		}
	}

}
