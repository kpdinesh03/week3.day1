package week3.day1.assignments;

public class AxisBank extends BankInfo
{

	public void deposit() 
	{
		System.out.println("Deposit of Axis Bank");

	}
	public static void main(String[] args) 
	{
		AxisBank axis = new AxisBank();
		axis.saving();
		axis.fixed();
		axis.deposit();

	}

}
