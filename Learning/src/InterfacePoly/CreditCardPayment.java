package InterfacePoly;

public class CreditCardPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.printf("Paid %.2f using Credit\n", amount);
		
	}

	@Override
	public String getPaymentType() {
		
		return "Credit Card";
	}

}
