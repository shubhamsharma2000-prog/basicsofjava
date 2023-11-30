package demojava;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demofunc df = new Demofunc();
		df.func();
	}

}
class Demofunc{
	 void func()
	 {
		 int a = 0;
		 int b = 1;
		 System.out.println("a :"+a);
		 System.out.println("b :"+b);
		 for(int z =2;z<=10;z++)
		 {
			 int n= a+b;
			 System.out.println("n is :"+n);
			 a=b;
			 b=n;
		 }
	 }
}
