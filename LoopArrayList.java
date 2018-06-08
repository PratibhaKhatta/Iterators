package Iterators;
import java.util.*;
public class LoopArrayList
{
    public static void main(String args[])
    {
    	List<String> arraylist = new ArrayList<>();
    	arraylist.add("Variables");
    	arraylist.add("Operators");
    	arraylist.add("Methods");
    	arraylist.add("Constructors");
    	System.out.println("Iterating arraylist using for loop");
    	for(String element : arraylist)
    	{
    		System.out.println(element);
    	}
    }
}
