package exceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) 
	{
	try {
			throw new Error();
			
		}catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
			
		}catch(RuntimeException e) {
			System.out.println("Runtime Exception");
		}catch(Exception e)
		{
			System.out.println("Exception Exception");
			
		}catch(Error e)
		{
			System.out.println("abc Exception");
		}

	}

}
