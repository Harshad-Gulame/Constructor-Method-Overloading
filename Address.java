public class Address{
	public String lane;
	public String locality;
	public String city;
	public int pincode;

	 public Address(String lane,String locality,String city,int pincode)
	{
		this.lane = lane;
		this.locality = locality;
		this.city = city;
		this.pincode = pincode;
	}

	public void displayAddress(){
		System.out.println("\n Address ");
		System.out.println("Lane : "+ lane);
		System.out.println("locality :"+locality);
		System.out.println("City :"+city);
		System.out.println("Pincode :"+pincode);
	}
}