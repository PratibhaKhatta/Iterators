package Iterators;

public class SingletonExample 
{
	public static void main(String args[])
	{
		SingletonValue a = SingletonValue.getInstance();
		SingletonValue b = SingletonValue.getInstance();
		a.x=a.x+10;
		System.out.println("Value of a.x " +a.x);
		System.out.println("Value of b.x " +b.x);
		
		
	}

}
