package abstractions;

public class SBI implements RBI {

	@Override
	public void saving() {
		System.out.println("SBI Saving account");
	}

	@Override
	public void current() {
		System.out.println("SBI current account");
	}

}
