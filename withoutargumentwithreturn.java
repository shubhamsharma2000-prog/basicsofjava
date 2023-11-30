package demojava;

public class withoutargumentwithreturn {
	public static void main(String s[]) {
	func f = new func();
	int xx = f.demof();
	System.out.println(+xx);
}
}
class func
{
	int demof() 
	{
	int a=0;
	int b=1;
	int sum = 0;
	System.out.println(+a);
	System.out.println(+b);
	for(int z = 2; z<=10;z++)
	{
	sum= a+b;
	a=b;
	b=sum;
	}
	return sum;
	} 
}
