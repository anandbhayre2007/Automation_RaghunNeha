package exceptionHandling;

import java.io.IOException;

public class TestClass {

	public static void main(String[] args) 
	{
		//throw new ArithmeticException();
		
		/*int a=0;
		int b=20;
		
		System.out.println(b/a);

		System.out.println("Anand");*/
		
		//fun2();
		
		/*try {
			throw new IOException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println("Anand");*/
		fun1();
		
		//fun2();
		
		
	}
	
	public static void fun1() throws ArithmeticException
	{
		throw new ArithmeticException();
	}

	public static void fun2() throws IOException  
	{
		throw new IOException();
		
	}
}
