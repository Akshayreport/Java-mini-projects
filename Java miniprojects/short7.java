//Author: Akshay Ramchurn (23/11/16)
import java.util.Scanner;
//Needed to make scanner available

public class whileloop {

	public static void main(String[] args)
	{
	firstloop();
	System.exit(0);
	}
	public static void firstloop()
	{
		String largestbird = "birds";
		int largestnum = 0;
		int birdnum=0;
		String birdname="";
		//Declaring the variables that will be assigned with respect to the user's inputs
		Scanner scanner = new Scanner(System.in);
		while (!birdname.equals ("END")){
			//This loop will go on as long as the variable "bird name" is not END.
			System.out.print("Which bird have you seen? ");
			birdname =  scanner.nextLine();
			if (birdname.contains("END")){
				System.out.println("You saw "+ largestnum + " "+ largestbird);
				System.out.println("It was the most common bird at one time in your garden.");
				//If the person writes END then the program will display the bird they saw the most as well as ending the program.
			}
			else {
				Scanner lol=new Scanner(System.in);
				System.out.print("How many were in your garden at once? ");
				birdnum = lol.nextInt();
				if(birdnum > largestnum){
				largestnum = birdnum;
 				largestbird = birdname;
 				//This is used to store the value of the largest number and the bird name. 
				}
			}
		}	
	}
}
