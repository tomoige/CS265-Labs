package cs265;

public class CS265_Lab_W02 {

	/**
	 * method1 takes two integer values a and b
	 * this returns the Lowest common multiple between a and b. 
	 * The LCM is the smallest number that
	 * both a and b divide into without a remainder.  
	 * For example if a = 4 and b = 7 then the LCM is 28
	 * 
	 * This method does not deal with all integers so it has an error condition.
	 *  
	 * If a is greater than 100 or if a is less than 1
	 * then -1 is returned. 
	 * 
	 * If b is greater than 100 or if b is less than 1 
	 * then -1 is returned. 
	 * 
	 * otherwise the method finds the Lowest Common Multiple between a and b
	 * Remember if a and b are the same value then this value is the LCM
	 * 
	 * Do not try to study the source code - test by the specifications only. So you should not 
	 * concern yourself with anything in the source code. 
	 * We will work with Equivalence Partitions next week - so you don't need to worry 
	 * about partitions until next week in Lab 2
	 * 
	 * @param a - integer
	 * @param b - integer
	 * @return the value of the lowest common multiple of a and b 
	 * 
	 */
	public static int method1(int a,int b)
	{
		int lcm = 1;

		if ((a > 100) || (a < 1))
		{
			lcm = -1;
		}
		else if ((b > 100) || (b < 1))
		{
			lcm = -1;
		}
		else
		{	

			int max = -1; 
			int min = 1;
			if(a>b)
			{
				max=a;
				min=b;
			}
			else
			{
				max=b;
				min=a;
			}
			int x = 1; 		 
			for(int i=1;i<=min;i++)
			{
				x=max*i; 
				if(x%min==0) 
				{
					lcm=x; 
					break; 
				}
			}
		}
		return lcm;
	}
	
	/**
	 * 

	 * If the array haystack is null or is empty (has zero length) then the method
	 * will return false. 
	 * If the needle is null then the method will return false. 
	 * 
	 * The method performs CASE INSENSITIVE searching - so upper and lower case 
	 * does not matter. 
	 * 
	 * @param haystack - a String array
	 * @param needle - a string
	 * @return boolean indicating if the needle is found in the haystack
	 * 
	 */
	
	public static boolean method2(String[] haystack, String needle)
	{
		boolean found = false;
		
		if (haystack == null)
		{
			return found;
		}
		else if (haystack.length <= 0)
		{
			return found;
		}
		else if (needle == null)
		{
			return found;
		}
		else
		{
			int i = 0;
			while ((i < haystack.length) && (!found))
			{
				if (haystack[i] != null)
				{
					if (haystack[i].compareToIgnoreCase(needle) == 0)
					{	
						found = true;
					}
				}
				i = i + 1;
			} // end while
			
			return found;
		}
		
		
	}
}