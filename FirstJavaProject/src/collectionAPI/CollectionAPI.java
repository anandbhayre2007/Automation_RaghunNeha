package collectionAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class CollectionAPI {

	public static void main(String[] args) 
	{
		Hashtable<String, String> m= new Hashtable<>();
		
		m.put("Name", "Anand");
		m.put("Surname", "Bhayre");
		m.put(null, "Anand");
		
		System.out.println(m.get(null));


	}

}
