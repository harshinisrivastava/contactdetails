package contactdetails;
import java.util.ArrayList;
 public class Students {
	
	private int id;
	private String name;
	private String contact;
	private ArrayList<Contacts> myContacts;
	
	public Students(int id,String name,String Contact) {
		this.name = name;
		this.contact= contact;
	}
	public   boolean addNewContact(Contacts newContact) {	
		if(findContact(newContact.getName()) >= 0) {
			System.out.println("Contact is already on file");
		}
		myContacts.add(newContact);
		return true;
	}
	public boolean updateContact(Contacts oldContact , Contacts newContact) {
		int Position = findContact(oldContact);
		if(Position < 0) {
			System.out.println(oldContact.getName() + " , was not found");
			return false;
		}
		
		this.myContacts.set(Position, newContact);
		System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
		return true;
	}
	public boolean removeContact(Contacts contact) {
		int Position = findContact(contact);
		if(Position < 0) {
			System.out.println(contact.getName() + " , was not found");
			return false;
		}
		this.myContacts.remove(Position);
		System.out.println(contact.getName() + " was deleted");
		return true;
	}
	
	
	private int findContact(Contacts contact) {
		return this.myContacts.indexOf(contact);
	}
	
	private int findContact(String contactName) {
		 for(int i =0; i < myContacts.size(); i++) {
			 Contacts contacts = this.myContacts.get(i);
			 if(contacts.getName().equals(contactName)) {
				 return i;
			 }
		 }
		 return -1;
	}
	public String queryContact(Contacts contact) {
		if(findContact(contact) >= 0) {
			return contact.getName();
		}
		return null;
	}
	
	public Contacts queryContact(String name) {
		int position = findContact(name);
		if(position >=0) {
			return this.myContacts.get(position);
		}
		return null;
	}
	
	
	public  void printContacts() {
		System.out.println("Contact list");
		for(int i = 0; i < this.myContacts.size(); i++) {
			System.out.println((i+1) + " ." + 
								this.myContacts.get(i).getName() + 
								" -> " + this.myContacts.get(i).getPhoneNumber());
		}
	}
 
}

