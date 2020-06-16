package contact;

public class TestException {
public static void main(String args[])	{
	try {
		throw new CustomerException();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}

