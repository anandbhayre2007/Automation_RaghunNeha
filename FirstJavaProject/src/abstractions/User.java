package abstractions;

public class User {

	public static void main(String[] args) {
		
		HDFC acc1= new HDFC();
		acc1.current();
		acc1.saving();
		acc1.demonatization();
		
		SBI acc2= new SBI();		
		acc2.current();
		acc2.saving();
		acc2.demonatization();
		
		
	}

}
