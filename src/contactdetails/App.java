package contactdetails;
import java.util.Scanner;
 
public class App {
	
	private static Scanner scanner = new Scanner(System.in);
	private static String newContact;
	public static void main(String[] args) {
		System.out.println(" the contact details");
		int action = 0;
		switch (action) {
			case 1:
				addContact();
				break;
				
			case 2: 
				updateContact();
				break;
			case 3:
				removeContact();
				break;		
}
}
	public static void addContact() {
	    System.out.println("Enter the name of the new contact");
	    newContact = scanner.nextLine();
	}

	public static void updateContact() {
	    System.out.println("Enter the name of replaced contact");
	    String replacedName = scanner.nextLine();
	    System.out.println("Enter the updated name");
	    String newName = scanner.nextLine();
	    ContactList.updateContact(replacedName, newName);
	}

	public static void removeContact() {
	    System.out.println("Which contact to remove?");
	    String removedContact = scanner.nextLine();
	    ContactsList.removeContact(removedContact);
	}

	public static void searchContact() {
	    System.out.println("select the contact");
	    String contactName = scanner.nextLine();
	    int index = ContactsList.removeContact(contactName);
	    if (index >= 0) {
	        System.out.println(ContactList.findContact(contactName) + 1 + ") " + contactName);
	    } else {
	        System.out.println("No such contact found.");
	    }
	}
 
}