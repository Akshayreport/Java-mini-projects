
//Author: Akshay Ramchurn  (01/11/2016)
import java.util.Scanner;
//Needed to make scanner available 

class paralym {
	
	public static void main(String[] param){
		int sum = firstloop();
		printmessage(sum);
		System.exit(0);
	}
	public static int firstloop(){
		int sum = 0;
		for(int i=1; i<=4;i+=1){
			//loop begins and it will go through it four times
			System.out.println("What is the disability of Runner "+ i + " ?");
			Scanner lol = new Scanner(System.in);
			int ans;
			ans = lol.nextInt();
			sum = sum + ans;
		}
		return sum;}
	
		public static void printmessage(int sum){
			//The argument is the integer sum and is used in this method.
		if (sum >= 32)
		{
		 
		System.out.println("That team has "+ sum + " points so is not legal.");
		
		}
		else
		{
			System.out.println("That team has "+ sum+ " points so is legal.");
		}
		
		
			
	}
}
			
	