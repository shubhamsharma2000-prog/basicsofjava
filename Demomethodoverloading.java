package demojava;
//in the method overloading there is same name method but the prototype is differ........
public class Demomethodoverloading {
	public static void main(String s[])
	{
		work w = new work();
		w.mann();
		w.shows();
		w.mann(10);
	}
}
class work
{
	String designation;
	int salary;
	int age;
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
	void mann(int x)
	{
		this.age = x;
		System.out.println("your age is:"+salary);
	}
	
}