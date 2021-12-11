package week3.day1.assignments;

public class Students 
{
	public void getStudentInfo(int id) 
	{
		System.out.println(id);
	}
	public void getStudentInfo(int id, String Name) 
	{
		System.out.println(id+" "+Name);
	}

	public void getStudentInfo(String email, String phone) 
	{
		System.out.println(email+" "+phone);
	}
	public static void main(String[] args) 
	{
		Students stud = new Students();
		stud.getStudentInfo(03);
		stud.getStudentInfo(03, "Surya");
		stud.getStudentInfo("surya@surya.com","3119531195");
	}
}
