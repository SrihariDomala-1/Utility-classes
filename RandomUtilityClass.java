package utilityClasses;

import java.util.Random;

public class RandomUtilityClass
{
	/** Random class its used to generate random numbers
	 * this class provides several methods generate random numbers
	 *  of type int,float,long,float
	 */
	public static void main(String[] args) 
	{
		// create random object
		// printing randomly every times changes the number 
		Random r=new Random();
		System.out.println(r.longs()); // UnlimitedStream of long values
		
	
		
		// generating byte values and  put them in array
		byte[] byt=new byte[10];
		r.nextBytes(byt); // the method is generates
		System.out.println("");
		for(int i=0;i<=byt.length-1;i++)
		{
			System.out.println(byt[i]); // printing the random numbers
		}
		
	
		// printing random Integer numbers bw 1-10
		int num= r.nextInt(100);
		
	    System.out.println(" the random number is:=" +num);
	
		
		
	}

}
