package PaymentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class PaymentCheckoutSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Payment> payments = new ArrayList<>();
		int choice = 0;

		Payment payment;

		payments.add(new CreditCardPayment());
		payments.add(new PayPalPayment());
		payments.add(new CashPayment());
		payments.add(new BankTransferPayment());

		while (choice != 4) {
			System.out.println("""
					\n1 - Show payment methods
					2 - Make a payment
					3 - Pay using all methods
					4 - Exit
									""");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				for (Payment paymentx : payments) {
					System.out.println(paymentx.getPaymentType());
				}
				break;
			case 2:
				System.out.println("""
						Choose payment method:
						1 - Credit Card
						2 - PayPal
						3 - Cash
						4 - Bank Transfer
												""");
				int payMethod = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter amount: ");
				double amount = scanner.nextDouble();
				scanner.nextLine();

				int index = -1;
				index += payMethod;
				payments.get(index);

				switch (index) {
				case 0:
					payment = payments.get(index);
					payment.pay(amount);
					break;
				case 1:
					payment = payments.get(index);
					payment.pay(amount);
					break;
				case 2:
					payment = payments.get(index);
					payment.pay(amount);
					break;
				case 3:
					payment = payments.get(index);
					payment.pay(amount);
					break;
				default:
					System.out.println("Wrong option, try again");
				}
				break;
			case 3:
				System.out.println("Enter amount to be paid: ");
				double payAmount = scanner.nextDouble();
				scanner.nextLine();
				for (Payment paymentz : payments) {
					paymentz.pay(payAmount);
				}
				break;
			case 4:
				System.out.println("Shutting down....");
				break;
				default:
					System.out.println("Wrong option");
			}
		}
		scanner.close();
	}

}
