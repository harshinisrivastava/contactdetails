package contactdetails;

public class Student extends ContactDetails{

	public Student(String name, String address, String phone, String email, double pin) {
		super(name, address, phone, email, pin);
		// TODO Auto-generated constructor stub
	}

	private String rollNo;
    private String organization;

    public void Student(String name, String address, 
    String email, String phone, String jobTitle, String organization) {
      this.rollNo= rollNo;
        this.organization = organization;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }


public void DispContacts() {
super.viewContacts();
System.out.println(this.getOrganization());
System.out.println(this.getRollNo());
}
    }


