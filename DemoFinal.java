package demojava;

public class DemoFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demofinal df = new demofinal();
		df.get();
		df.showfinal();
	}

}
class demofinal
{
	final int x = 0;
	int y;
	void get()
	{
		// not define again x=2;
		y=1;
	}
	void showfinal()
	{
		System.out.println("x is :"+x);
		System.out.println("y is :"+y);
	}
}