package polymorphism;

public class TestClass2 {

	public static void main(String[] args) 
	{

		int[] arr= {10,20,30,23,45,56,46};
		
		int max=arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		int sMax=arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=max)
			if(arr[i]>sMax  )
			{
				sMax=arr[i];
				
			}
		}
		
		System.out.println(sMax);
		
		
		

	}

}
