package demojava;

public class Demofinalizee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Demofinalizeee df = new Demofinalizeee();
         df.finalize();
	}

}
class Demofinalizeee
{
	Demofinalizeee()
	{
		System.out.println("i am constructor");
	}
	public void finalize()
	{
		System.out.println("i am finalize");
	}
}
