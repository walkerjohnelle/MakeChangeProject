package makechange;

import java.util.Scanner;

public class CashRegister {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the price of the item: ");
		double itemPrice = sc.nextDouble();

		System.out.print("Please enter the amount tendered: ");
		double amountPaid = sc.nextDouble();
		calculateChange(itemPrice, amountPaid);

		sc.close();
	}

	private static void calculateChange(double itemPrice, double amountPaid) {
		if (amountPaid > itemPrice) {
			double result = amountPaid - itemPrice;

			result = Math.round(result * 100.0) / 100.0;
			System.out.println("Change due: $" + result);

			provideCorrectBills(result);

		} else if (amountPaid == itemPrice) {
			System.out.println("No change due. Thank you for shopping!");

		} else {
			System.out.println("ERROR: insufficient payment.");

		}
	}

	private static void provideCorrectBills(double result) {

		if (result >= 20) {
			int $20Counter = (int) (result / 20);
			System.out.print($20Counter + " Twenty-Dollar Bill(s), ");
			result = result % 20;

		}
		if (result >= 10) {
			int $10Counter = (int) (result / 10);
			System.out.print($10Counter + " Ten-Dollar Bill(s), ");
			result = result % 10;

		}
		if (result >= 5) {
			int $5Counter = (int) (result / 5);
			System.out.print($5Counter + " Five Dollar Bill(s), ");
			result = result % 5;

		}
		if (result >= 1) {
			int $1Counter = (int) (result / 1);
			System.out.print($1Counter + " One-Dollar Bill(s), ");
			result = result % 1;

		}
		if (result >= 0.25) {
			int quarterCounter = (int) (result / 0.25);
			System.out.print(quarterCounter + " Quarter(s), ");
			result = result % 0.25;

		}
		if (result >= 0.10) {
			int dimeCounter = (int) (result / 0.10);
			System.out.print(dimeCounter + " Dime(s), ");
			result = result % 0.10;

		}
		if (result >= 0.05) {
			int nickelCounter = (int) (result / 0.05);
			System.out.print(nickelCounter + " Nickel(s), ");
			result = result % 0.05;
			result = Math.round(result * 100.0) / 100.0;

		}
		if (result >= 0.01) {
			int pennyCounter = (int) (result / 0.01 + 0.5);
			System.out.print(pennyCounter + " Penny(s) ");

		}

	}

}
