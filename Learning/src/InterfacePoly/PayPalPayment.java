package InterfacePoly;

public class PayPalPayment implements Payment{

	@Override
	public void pay(double amount) {
		System.out.printf("Paid %.2f using PayPal\n", amount);
		
	}

	@Override
	public String getPaymentType() {
		// TODO Auto-generated method stub
		return "PayPal";
	}

}
