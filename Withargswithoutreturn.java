package demojava;

public class Withargswithoutreturn {

	public static void main(String[] args) {
		funccc f = new funccc();
		f.demo(10,12);

	}

}
class funccc
{
	void demo(int x,int y)
	{
		int b=x+y;
		System.out.println(+b);
	}
}

