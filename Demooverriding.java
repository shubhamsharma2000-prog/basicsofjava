package demojava;
//method overriding is used when the subclass is used the same method name which is used in parent class;
public class Demooverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		workss ws = new workss();
		ws.mann();
		works s = new works();
		s.mann();
		s.shows();
	}

}
class works
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
class workss extends works
{
	void mann()
	{
		
		int x=6;
		System.out.println(+x);
	}
}
