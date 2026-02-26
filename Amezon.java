public class Amezon{
		public String username ;
		public String password ;
		public long contact ;
		public String email ;
		public Address address;

		public Amezon()
		{
			super();
		}

	public Amezon(String username,String password,long contact,String email,Address address)
		{
			super();
			this.username = username ;
			this.password = password ;
			this.contact = contact ;
			this.email = email ;
			this.address = address;
		}

		public void displayAmezonInfo(){
			System.out.println("\n Amezon Info ");
			System.out.println("Username :"+username);
			System.out.println("password :"+password);
			System.out.println("Contact :"+contact);
			System.out.println("Email :"+email);
			address.displayAddress();
		}
}