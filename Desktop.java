package week3.day1.assignments;

public class Desktop extends Computer
{
	public void desktopSize() 
	{
		System.out.println("Desktop Size");

	}
	
	public static void main(String[] args)
	{
		
		Desktop dk = new Desktop();
		dk.computerModel();
		dk.desktopSize();
	}

}
