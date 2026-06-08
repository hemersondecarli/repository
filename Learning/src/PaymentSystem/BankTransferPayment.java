package PaymentSystem;

public class BankTransferPayment implements Payment{

	@Override
	public void pay(double amount) {
		System.out.printf("Paid €%.2f using Bank transfer\n", amount);
	}

	@Override
	public String getPaymentType() {
		// TODO Auto-generated method stub
		return "Bank Transfer";
	}

}
