package week3.day1.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) 
	{
		String test = "changeme";
		for(int i=0; i<test.length(); i++)
		{
			char ch = test.charAt(i);
		    if (i % 2 == 0) 
		    {
		        System.out.print(ch);
		    } 
		    else 
		    {
		        System.out.print(Character.toUpperCase(ch));
		    }
		}

	}

}
