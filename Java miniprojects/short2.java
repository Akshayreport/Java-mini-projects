//Author Akshay Ramchurn / Date completed (01/10/16)
import java.util.Scanner;

public class Fitness {



	public static void main (String[] param)
	{
		int fnum = firstsum ();
		int answer = secondresp(fnum);
		secondsum (answer);
		System.exit (0);
		//These are the different methods in the class.
	}
	public static int firstsum ()
	{
		Scanner lol = new Scanner (System.in);
		System.out.println("Enter score for fitness test 1") ;
		//It asks the user to write their score
		int fnum = lol.nextInt();
		return fnum;
		//The users input is saved as the fnum variable.
	}
	public static int secondresp(int fnum){ 
		//The program will save the score as a variable
		System.out.println("Enter score for fitness test 2");
		Scanner lol = new Scanner (System.in);
		int snum = lol.nextInt();
		int answer = (fnum + snum)/2;
		System.out.print("Your average score is ");
		   System.out.println( answer) ; 
		   return answer;
		//This returns the program to the main so the second method can begin
	}

	public static void secondsum (int answer)
	{    
    Scanner lol = new Scanner (System.in);
			int fitage = (((answer*8)/5)+10);
			//Multipplies the answer variable by 8 , divides by 5 and adds 10
			System.out.print("Your pc fit age is ");
			System.out.println(fitage+" years old");
			System.out.println ("What is your actual age") ;
			int acage = lol.nextInt();
			int work = acage - fitage;
			System.out.print("You are "+work+" years away from your PC fit age.");  
		     //prints out message of the fitage.	
    
    return ;
	}
} 