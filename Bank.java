public class Bank{
	public String name;
	public String ifscCode ;
	public long accountNumber;
	public double balance;

	public Bank(String name, String ifscCode,double balance)
	{
		this.name = name ;
		this.ifscCode = ifscCode ;
		this.accountNumber =11234567902l ;
		this.balance = balance ;
	}

	public void displayBank(){
		System.out.println("\n Banl Details ");
		System.out.println("Name :"+name);
		System.out.println("IFSCCODE :"+ifscCode);
		System.out.println("Account Number :"+accountNumber);
		System.out.println("Balance :"+balance);

	}
}