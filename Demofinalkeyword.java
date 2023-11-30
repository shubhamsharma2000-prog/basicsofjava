package demojava;

public class Demofinalkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demofinala dfa = new demofinala();
		dfa.geta();
		dfa.showfinala();
	}

}

class demofinala
{
	final int x = 0;
	int y;
	 final void geta()
	{
		// not define again x=2;
		y=1;
	}
	void showfinala()
	{
		System.out.println("x is :"+x);
		System.out.println("y is :"+y);
	}
}
class demofinalexten extends demofinala
{// never override final method
	void geta()
	{
		
	}
}