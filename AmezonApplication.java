public class AmezonApplication
{
	public static void main(String[] args) {

		Address address = new Address("JM Road","Deccan","Pune",411005);
		address.displayAddress();

		Bank bank = new Bank("Ramesh Kumar","SBIN0000123",50000);
		bank.displayBank();

 
		// AmezonPay pay = new  AmezonPay("Ramesh Kumar","ramesh@123",898789878l,"ramesh@gmail.com","888888@ybl",1234,1500);
		// pay.displayAmezonPay();
		
	}
}