package contact;
import java.util.*;
public class ServiceFile {
	
	

		Scanner value = new Scanner(System.in);
		private static List<Contact> list;
		Contact enter = new Contact();
		Data valid = new Data();

		ServiceFile() {
			ServiceFile.list = new ArrayList<Contact>();
			Contact no1 = new Contact("veena", "reddy", "8787812345", "918888888", "veenareddy@gmail.com", true);
			Contact no2 = new Contact("sara", "sharma", "9777923456", "7354444444", "sarasharma@yahoo.com", false);
			Contact no3 = new Contact("arya", "rao", "6789034521", "8999356234", "arya.rao@gmail.com", true);
			list.add(no1);
			list.add(no2);
			list.add(no3);
		}

		void display() {
			for (Contact key : list) {
				System.out.println(key.toString());
			}
		}

		void addContact() {
			boolean val = true;
			while(val) {
			System.out.println("Enter First Name");
			String firstName = value.next();
			if (valid.isValid(firstName)) {
				enter.setFirstName(firstName);
				break;
			} else {
				System.out.println("Invalide Name");
				val =true;
			}}
			while(val) {
			System.out.println("Enter Last Name");
			String lastName = value.next();
			if (valid.isValid(lastName)) {
				enter.setLastName(lastName);
				break;
			} else {
				System.out.println("Invalide Name");
				val =true;
			}}
			while(val) {
			boolean same = false;			
			System.out.println("Enter Mobile Number");
			String mobileNumber = value.next();
			for(Iterator<Contact> itr = list.iterator();itr.hasNext();) { 
				  Contact key =itr.next(); 
				  if(key.getMobileNumber().equals(mobileNumber)) { 
					  System.out.println("Already exist:"); 
					  same =true;
					  }
				  }
				if (valid.isValidNo(mobileNumber)) { 
					if(same==false){
						enter.setMobileNumber(mobileNumber);
						break;
					  }else {
						val =true;
						System.out.println("invalid");
					  }
				}
			}
			System.out.println("Enter Home Number");
			String homeNumber = value.next();
			if (valid.isValidNo(homeNumber)) {
				enter.setHomeNumber(homeNumber);
			} else {
				System.out.println("Invalide Home No");
				enter.setHomeNumber(null);
			}
			System.out.println("Enter EmailId");
			String emailId = value.next();
			if (valid.isValidEmail(emailId)) {
				enter.setEmailId(emailId);
			} else {
				System.out.println("Invalid Email Id");
				enter.setEmailId(null);
			}
			System.out.println("Favourites yes or no");
			String fav = value.next();
			if (fav.equals("yes")) {
				list.add(new Contact(enter.getFirstName(), enter.getLastName(), enter.getMobileNumber(),
						enter.getHomeNumber(), enter.getEmailId(), true));
			} else {
				list.add(new Contact(enter.getFirstName(), enter.getLastName(), enter.getMobileNumber(),
						enter.getHomeNumber(), enter.getEmailId(), false));
			}
			display();
		}

		void deleteContact() {
			try {
				System.out.println("Enter the Delete Number");
				String num = value.next();
				boolean status = false;
				  for(Iterator<Contact> itr = list.iterator();itr.hasNext();) { 
					  Contact key =itr.next(); 
					  if(key.getMobileNumber().equals(num)) { 
						  itr.remove(); 
						  status =true; 
						  } 
					  }
				  if (status == false) {
					System.out.println("Invalid No");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			//display();
		}

		void replace() {
			try {
				System.out.println("Enter the replace number");
				String number = value.next();
				boolean status = false;
				for(Iterator<Contact> itr = list.iterator();itr.hasNext();) { 
					  Contact key =itr.next(); 
					  if(key.getMobileNumber().equals(number)) { 
						  itr.remove(); 
						  status =true; 
						  } 
					  }
				if (status == false) {
					System.out.println("no valid");
				}else {
					addContact();
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		String search(String number) {
			try {
				boolean status = false;
				for (Contact key : list) {
					if (key.getMobileNumber().equals(number)) {
						status = true;
						return key.toString();
					}
				}
				if (status == false) {
					return "invalid";
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			return null;
		}

		void sortData() {
			Collections.sort(list, new Order());
			display();
		}
		
		void favourite() {
			for(Contact key : list) {
				if(key.isFavourite()) {
					System.out.println(key.toString());
				}
			}
		}
	}

	class Order implements Comparator<Contact> {

		public int compare(Contact o1, Contact o2) {
			if (o1.getFirstName().equals(o2.getFirstName())) {
				return o1.getLastName().compareTo(o2.getLastName());
			} else {
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		}
	}

