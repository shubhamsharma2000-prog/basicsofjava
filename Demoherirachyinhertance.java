package demojava;
// java does not support multiple inheritance but interface done their work
public class Demoherirachyinhertance {
	public static void main(String args[]) {
	ceo m = new ceo();
	m.stu();
	m.show();
	m.mann();
	m.shows();
	m.mannn();
	m.showss();
	
}
}
class employee
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
class worker extends employee
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

class labour extends employee
{
	String ex_company;
	int experience;
	void mannn()
	{
		 ex_company ="xyz";
		 experience = 12;
	}
	void showss()
	{
		System.out.println("your designation is :"+ex_company);
		System.out.println("your salary is :"+experience);
		
	}
	
}
