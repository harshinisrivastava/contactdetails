package contactdetails;

public class ContactDetails {
	 private String name;
	private String address;
	private String phone;
	private String email;
    private double pin;
	public  ContactDetails(String name, String address, String 
			    phone, String email,double pin){
			        this.name = name;
			        this.address = address;
			        this.phone= phone;
			        this.email = email;
			        this.pin   =pin;
			    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getPin() {
		return pin;
	}
	public void setPin(double pin) {
		this.pin = pin;
	}
	 class Contacts{
	public void main(String args[]) {
	System.out.println(this.getName());
	System.out.println(this.getAdress());
	System.out.println(this.getPhone());
	System.out.println(this.getEmail());
	System.out.println(this.getPin());

}
	private char[] getPin() {
		// TODO Auto-generated method stub
		return null;
	}
	private char[] getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	private char[] getPhone() {
		// TODO Auto-generated method stub
		return null;
	}
	private char[] getAdress() {
		// TODO Auto-generated method stub
		return null;
	}
	private char[] getName() {
		// TODO Auto-generated method stub
		return null;
	
	}
	}
	public void viewContacts() {
		// TODO Auto-generated method stub
		
	}
}
