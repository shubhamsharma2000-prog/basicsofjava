//interface is mainly used to run multiple inheritance in java
// in the interface we use implement to inherit the class
//in this we can inherit one or more class...
package demojava;

public class Dinterface {
	public static void main(String s[])
	{
		cface cf = new cface();
		cf.show();

}

}
interface iface
{
	void show();
	
	
}
class cface implements iface
{
	public void show()
	{
		System.out.println("i am interfacce");
	}
}

