public class AmezonPay extends Amezon{
	public String upid ;
	public Bank bank;
	public int pin;
	public double wallet;


	public AmezonPay()
	{

	}

	//child amezonpay argument
	public AmezonPay( String username,String password,long contact,String email,Address address,
		       String upid,Bank bank,int pin,double wallet)
	{
		 
		super(username,password,contact,email,address);
		this.upid = upid;
		this.bank=bank;
		this.pin = pin;
		this.wallet = wallet;

	}

	public void displayAmezonPay(){
		System.out.println("\n bank Info");
		System.out.println("Upid :"+upid);
		System.out.println("Pin :"+pin);
		System.out.println("wallet :"+wallet);
		bank.displayBank();
	}
}