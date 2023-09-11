package utilityClasses;

import java.util.Hashtable;

public class HashTableUtilityClass 
{
	public static void main(String[] args) 
	{
		Hashtable hm=new Hashtable();
		hm.put(1,"name");
		hm.put(2,"surname");
		hm.put(3,"fullname");
		hm.put(4,"age");
		//hm.put(null,null); // HashTable map is not allows null values as a key and Value 
		                   // if programmer try to add null as a value  it will throws null pointer Exception
		hm.put(5,"village");
		hm.put(6,"fatherName");
		hm.put(1,"name of the person"); // repeated key it allows and print updated key value
		
		
		System.out.println(hm);
		// its doesnot follow the insertion order
	}

}
