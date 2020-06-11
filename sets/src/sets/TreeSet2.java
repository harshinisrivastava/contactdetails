package sets;
import java.util.TreeSet;
public class TreeSet2 {

	     public static void main(String args[]) {

	         TreeSet<String> tset = new TreeSet<String>();


	         tset.add("ABC");
	         tset.add("hello");
	         tset.add("world");
	         tset.add("demo");
	         tset.add("java");
	         tset.add("abc");

	         System.out.println(tset);

	         TreeSet<Integer> tset2 = new TreeSet<Integer>();

	         tset2.add(88);
	         tset2.add(7);
	         tset2.add(101);
	         tset2.add(0);
	         tset2.add(3);
	         tset2.add(222);
	         System.out.println(tset2);
	    }
	 }


