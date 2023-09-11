package utilityClasses;

import java.util.StringTokenizer;

public class StringTokenizerUtilityClass 
{
	/** StringTokenizer Class its tokenize a String individual tokens basedon adelimiter
	 * 
	 */
	
	public static void main(String[] args) 
	{
		
	
	StringTokenizer st=new  StringTokenizer("hello,god,is,great", ","); // " input " "," delimiter 
	while(st.hasMoreElements()) //it returns boolean value
	{
		String s=st.nextToken();
		System.out.println(s);
	}
	
	
	}


}
