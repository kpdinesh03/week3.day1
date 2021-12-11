package week3.day1.assignments;

public class StringEqualsIgnoreCase {

	public static void main(String[] args) 
	{
		String str1 ="I am Learning Java";
		String str2 ="i am learning java";
		
		if(str1==str2)
		{
			System.out.println("==");
		}
		if(str1.equals(str2))
		{
			System.out.println("Equals");
		}
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("EqualsIgnoreCase");
		}

	}

}
