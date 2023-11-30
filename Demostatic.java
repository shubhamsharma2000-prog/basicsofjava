package demojava;

public class Demostatic {

	class DDemostatic
	{
		int x;
		static int y;
		DDemostatic()
		{
			x=0;
			y=0;
		}
		void inc()
		{
			x++;
			y++;
		}
		void show()
		{
			System.out.println("x is :"+x);
			System.out.println("y is :"+y);
		}
	}

	public static void main(String[] args)
	{
		
		DDemostatic ds3 = new DDemostatic();
		DDemostatic ds1 = new DDemostatic();
		DDemostatic ds2 = new DDemostatic();
		ds3.show();
		ds1.show();
		ds2.show();
		ds3.inc();
		ds3.show();
		ds1.inc();
		ds1.show();
		ds2.inc();
		ds2.show();
		
}
}
