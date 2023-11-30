package demojava;

public class Dabstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abs a = new abs();
		a.get();
	}

}
abstract class demoabstract
{
	abstract void get();
	
}
class abs extends demoabstract
{
	void get()
	{
		System.out.println("i am abstract method");
	}
}

