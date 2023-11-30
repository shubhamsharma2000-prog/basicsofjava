package demojava;

public class Demoinheritance {
	public static void main(String args[]) {
	manager m = new manager();
	m.stu();
	m.show();
	m.mann();
	m.shows();
}
}
class student
{
	String name;
	int rollno;
	void stu()
	{
	 name = "subham sharma";
	 rollno = 159;
	}
	void show()
	{
		System.out.println("your name is :"+name);
		System.out.println("your roll no is :"+rollno);
		
	}
		
}
class manager extends student
{
	String designation;
	int salary;
	void mann()
	{
		 designation="manager";
		 salary = 400000;
	}
	void shows()
	{
		System.out.println("your designation is :"+designation);
		System.out.println("your salary is :"+salary);
		
	}
	
}