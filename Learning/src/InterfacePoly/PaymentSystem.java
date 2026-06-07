package InterfacePoly;

import java.util.ArrayList;
import java.util.Scanner;

public class PaymentSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Payment> payments = new ArrayList<>();

		payments.add(new CreditCardPayment());
		payments.add(new PayPalPayment());
		payments.add(new CashPayment());

//		Payment payment = new CreditCardPayment();

//		for(Payment payment : payments) {
//			
//			payment.pay(50);
//		}

		int choice = 0;

		while (choice != 5) {

			System.out.println("""
					1 - Pay with credit card
					2 - Pay with PayPal
					3 - Pay with cash
					4 - Show all payment methods
					5 - Exit
										""");

			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				Payment credit = new CreditCardPayment();
				credit.pay(50);
				break;
			case 2:
				Payment paypal = new PayPalPayment();
				paypal.pay(50);
				break;
			case 3:
				Payment cash = new CashPayment();
				cash.pay(50);
				break;
			case 4:
				payments.forEach(payment -> System.out.println(payment.getPaymentType()));
				break;
			case 5:
				System.out.println("System Closing...");
				break;
			default:
				System.out.println("Wrong option");
			}
		}
	}

}
