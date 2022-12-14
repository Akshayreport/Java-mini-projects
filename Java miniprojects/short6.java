//Author: Akshay Ramchurn  (06/11/2016)
import java.util.Scanner;
//Needed to make scanner available 

class array {
	
	public static void main(String[] param){
	String count[] =firstarray();
	secondarray(count);
	System.exit(0);
	}
	
	public static String[] firstarray(){
		String count[] = new String[6];
		count[1]= ("Komodo Dragon");
		count[2]= ("Manatee");
		count[3]= ("Kakapo");
		count[4]= ("Florida Panther");
		count[5]= ("White Rhino");
		return count;
		//The array is being assigned a String
	}
		public static void secondarray(String[] count){
		int num[] = new int[6];
		String animalname = ("");
		int response;
		
		for (int i = 1 ; i <= 5; i++){
			int sum = 1;
			System.out.println(count[i]);
			System.out.println("How many are left in the wild?");
			Scanner lol = new Scanner(System.in);
			response = lol.nextInt();
			num[i] = response;
			//loop will go on five times
			
		}
		String animalname1 = count[0];
		int animallow = num[0];
		if ((num[1]<num[2]) && (num[1]<num[3]) && (num[1]<num[4]) && (num[1]<num[5])) {
			animalname1 = count[1];
			animallow = num[1];
		}
		else if ((num[2]<num[1]) && (num[2]<num[3]) && (num[2]<num[4]) && (num[2]<num[5]))
		{
			animalname1 = count[2];
			animallow = num[2];
		}
		else if ((num[3]<num[1]) && (num[3]<num[2]) && (num[3]<num[4]) && (num[3]<num[5])) {
			animalname1 = count[3];
			animallow = num[3];
			
		}
		else if ((num[4]<num[1]) && (num[4]<num[2]) && (num[4]<num[3]) && (num[4]<num[5])) {
			animalname1 = count[4];
			animallow = num[4];
		}
		else if ((num[5]<num[1]) && (num[5]<num[2]) && (num[5]<num[3]) && (num[5]<num[4])) {
			animalname1 = count[5];
			animallow = num[5];
		}
		//The if and else statement are used so that the highest value can be found
		
		
		
		System.out.println("The most endangered animal is the " + animalname1+".");
		System.out.println("There are only "+ animallow + " left in the wild.");
		for (int i = 1 ; i <=5 ; i++){
			System.out.println(count[i]+" " +num[i]);
		}
		//Prints out information of the most endangered animals
	
		
	}
}
	