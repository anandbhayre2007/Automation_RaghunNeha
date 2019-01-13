package polymorphism;

public class TestClass3 extends TestClass1
{
	public int sum(int a, int b, int c, int d)
	{
		System.out.println("Anand");
		return a+b+c+d;
	}
	
	public int sum(int a, int b, int c)
	{
		return a+b;
	}
}
