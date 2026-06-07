package InterfacePoly;

public class CashPayment implements Payment{

	@Override
	public void pay(double amount) {
		System.out.printf("Paid %.2f using Cash\n", amount);
		
	}

	@Override
	public String getPaymentType() {
		// TODO Auto-generated method stub
		return "Cash";
	}
}
