package sets;
import java.util.*;  
public class SetTree {
	
	 public static void main(String args[]){  
	 TreeSet<String> set=new TreeSet<String>();  
	         set.add("Hello");  
	         set.add("hello");  
	         set.add("java");  
	         System.out.println("Traversing element through Iterator in descending order");  
	         Iterator i=set.descendingIterator();  
	         while(i.hasNext())  
	         {  
	             System.out.println(i.next());  
	         } 
	         System.out.println("Traversing element through ascending order");
	        set.add("HELLo");  
	         set.add("hello");  
	         set.add("java");  
	         Iterator<String> itr=set.iterator();  
	         while(itr.hasNext()){  
	          System.out.println(itr.next());  
	           
	 }  
	 }
}
