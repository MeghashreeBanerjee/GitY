import java.util.ArrayList;

import Testng.Test;

public class JavaStream1 
{

	@Test
	public static void main(String[] args) 
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Arizona");
		names.add("Alabama");
		names.add("Massachusettes");
		names.add("California");
		names.add("America");
		names.add("Asia");
		names.add("Africa");
		names.add("India");
		names.add("Gaza");
				
		int count=0;
		
		for(String nm : names)
		{
			System.out.println(nm);
			
			if(nm.startsWith("A"))
				{
					count++;
				}
		}
		
		System.out.println(count);
		
	}
	

}
