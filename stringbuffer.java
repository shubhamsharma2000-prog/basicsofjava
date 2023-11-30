//this is string buffered example....
//in this we can learn buffer reader this is take the input from the keybord and put into the buffer and whenever we need this so we can call this with the object....
//inputstreamreader is a bridge from byte to character streams read byte and decode them.....
//parse int is used to convert string to int or any other data types......
import java.io.*;
public class stringbuffer {

	
	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("enter the value of x");
		String x = br.readLine();
		System.out.println("your name is :"+x);
		System.out.println("enter the value of y");
		int y = Integer.parseInt(br.readLine());
		System.out.println("your serion no is:"+y);
		System.out.println("enter the value of y");
		float z = Float.parseFloat(br.readLine());
		System.out.println("your percentage is :"+z);
		

	}

}
