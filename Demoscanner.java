package demojava;
import java.io.*;
//scanner is used when we want  input from the user it is a easy way to take the input..
//it comes from the scanner library......
import java.util.Scanner;

public class Demoscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the string y");
		String y = scanner.nextLine();
		System.out.println("your value is :"+y);
		System.out.println("enter the value of x");
		int x = scanner.nextInt();
		System.out.println("your value is :"+x);
		System.out.println("enter the value z");
		float z = scanner.nextFloat();
		System.out.println("your value is :"+z);
	}
}
