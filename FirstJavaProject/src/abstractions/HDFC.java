package abstractions;

public class HDFC implements RBI{

	@Override
	public void saving() {
		System.out.println("HDFC Saving account");
	}

	@Override
	public void current() {
		System.out.println("HDFC current account");
	}

}
