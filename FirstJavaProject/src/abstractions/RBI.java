package abstractions;

public interface RBI 
{
	public void saving();
	public void current();
	
	default void demonatization()
	{
		System.out.println("1000 & 500 rupees will not be valid");
	}
}
