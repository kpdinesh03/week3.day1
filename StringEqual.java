package week3.day1.assignments;

public class StringEqual 
{
	public static void main(String[] args) 
	{
		String str3 = new String("Kutty");
		String str4 = new String("Kutty");

		//we have to use equals method to compare a string
		if(str3.equals(str4)) {
			System.out.println(" Same text");
		}
		else
		{
			System.out.println("Diff text");
		}

		System.out.println("***");

	}

}
