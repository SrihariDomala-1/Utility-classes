package utilityClasses;

import java.sql.Date;

// Date class
public class DateUtilityClasses// Date
{
	public static void main(String[] args) 
	{
		
		Date d1=new Date(2022,1, 15);
		System.out.println(d1.toString()); // it prints complete information 
		Date d2=new Date(2000, 1,15);

	
		
		System.out.println(d1.after(d2)); //:boolean
		System.out.println(d2.after(d1));
		
		System.out.println(d1.before(d2)); // d2 is comparing d1
		
		System.out.println(d1.equals(d2)); // comparing two methods 
		System.out.println(d1.getDate()); // to return date
		System.out.println(d1.getDay());
		System.out.println(d2.getHours());
	
		
		
		
		
		
		
	}

}
