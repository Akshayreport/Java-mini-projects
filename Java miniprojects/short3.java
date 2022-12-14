//Author Akshay Ramchurn (01/10/2016)
import java.util.Scanner;
//Needed to make Scanner Available 


public class Undergroud {
	
	
	public static void main (String[] param)
	{
		String response = inputString("What station do you need to know the zone of");
		 if (response.contains("Mile End"))
			 //Asks for the users inputs and depending on what answer they type in, they will get a corresponding response.
		 {
			 System.out.println("Mile End is in zone 2");
		 }
		 else if (response.contains("Liverpool Street"))
		 {
			 System.out.println("Liverpool Street is in zone 1");
		 }
		 else if (response.contains("Woodford"))
		 {
			 System.out.println("Woodford is in zone 4");
		 }
		 else if (response.contains("Upton Park"))
		 {
			 System.out.println("Upton park is in zone 3");
		 }
		 else if (response.contains("Hounslow"))
		 {
			 System.out.println("Hounslow is in zone 5");
		 }
		 else
		 {
			 System.out.println("Please check your spelling");
			 //If the user types in something which is not recognised a new response will appear.
		}
		 System.exit(0);
	}
		 public static String inputString(String message)
		    {
		       Scanner lol= new Scanner(System.in);
		       String answer;

		       System.out.println(message);
		       answer = lol.nextLine();
		   
		       return answer;
			   //Another method which introduces the scanner
		    }
	}