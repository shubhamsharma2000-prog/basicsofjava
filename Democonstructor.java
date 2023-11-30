// constructor is same name as class name;
//constructor dont need any object to call
//the call her when call obj is assigned
//if we dont put any constructor then default constructor is alredy there
//constructor is used to initialize any value
//they dont have any return type
//they are 2 types default and parameterize
package demojava;

public class Democonstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		democons dd = new democons();
		democons ddd = new democons(10,12);
	}

}
class democons
{
	int xx;
	int yy;
	democons()
	{
		System.out.println("i am default constructor");
	}
	democons(int x,int y)
	{
		this.xx=x;
		this.yy=y;
		System.out.println(+xx);
		System.out.println(+yy);
	}
}
