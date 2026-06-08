package PaymentSystem;

public class CreditCardPayment implements Payment{

	@Override
	public void pay(double amount) {
		System.out.printf("Paid €%.2f using Credit Card\n", amount);
		
	}

	@Override
	public String getPaymentType() {
		// TODO Auto-generated method stub
		return "Credit Card";
	}

}
