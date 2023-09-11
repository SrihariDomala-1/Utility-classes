package utilityClasses;

import java.util.LinkedList;

public class LinkedListUtilityClass 
{
	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		ll.add(ll);
		ll.add('h');
		ll.add('l');
		ll.add("hatyi");
		ll.add(ll);
		System.out.println(ll);
		
		
	}

}

