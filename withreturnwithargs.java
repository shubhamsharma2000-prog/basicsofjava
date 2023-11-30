package demojava;

public class withreturnwithargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		funcc f = new funcc();
		int z = f.demo(10,12);
		System.out.println(+z);
	}

}
class funcc
{
	int demo(int x,int y)
	{
		int b=x+y;
		return b;
	}
}
