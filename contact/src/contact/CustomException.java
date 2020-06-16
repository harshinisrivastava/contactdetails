package contact;

public class CustomException extends Exception {
 String str;
 void customException(String message){
	 this.str = str;
 }
 public String tostring() {
	 return("message ="+str);
 }
	
	private static final long serialVersionUID = 1L;
	

}
