package demojava;

public class Classandobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//object is a instance of class
//object has a behaviour,nature
		DemoClass dc = new DemoClass();
		dc.get();
		dc.Demoshow();
	}

}
//class is just like a blueprint
//class is a never existing thing
class DemoClass
{
	int x;
	void get()
	{
		x =0;
	}
	void Demoshow()
	{
		System.out.println(+x);
	}
}
