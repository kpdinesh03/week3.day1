package week3.day1.assignments;

public class StringReplace {

	public static void main(String[] args) 
	{
		String sentence = "I am working with Java8";
//				replace 8 to 11 
//				Print the characters from 5 to 14
		String newstr = sentence.replace('8', '!');
		String newstr2 = newstr.concat("#");
		System.out.println(newstr);
		System.out.println(newstr2);
		

	}

}
