package sets;
import java.util.HashSet;
import java.util.Iterator;
public class HashMap2 {
	
		 public static void main(String[] args) {
		        HashSet<Integer> numbers = new HashSet<>();
		        numbers.add(2);
		        numbers.add(5);
		        numbers.add(6);
		        System.out.println("HashSet: " + numbers);

		        
		        Iterator<Integer> iterate = numbers.iterator();
		        System.out.print("HashSet elements: ");
		        
		        while(iterate.hasNext()) {
		            System.out.print(iterate.next());
		            System.out.print(", ");
		        }
		    }
}
