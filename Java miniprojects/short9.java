//Akshay Ramchurn (03/12/16)
import java.util.Scanner;
//Needed to make scanner available

public class filmshow{
	public static void main(String[] p){
		String filmans1 = askfilmname1();
		int hour1 = askfilmhour1();
		int minute1 = askfilmminute1();
		String filmans2= askfilmname2();
		int hour2 = askfilmhour2();
		int minute2 = askfilmminute2();
		String filmans3 = askfilmname3();
		int hour3 = askfilmhour3();
		int minute3 = askfilmminute3();
		String filmans4 =askfilmname4();
		int hour4 = askfilmhour4();
		int minute4 = askfilmminute4();
		String[] filmresp = storefilm(filmans1 , filmans2 , filmans3 , filmans4);
		int[] hourresp = storehour(hour1, hour2, hour3, hour4);
		int[] minuteresp = storeminute(minute1, minute2 , minute3, minute4);
		storeanddisplay(filmresp , hourresp , minuteresp);
		
		
		
		
		
	}
	
	public static int[] storeminute(int minute1, int minute2, int minute3 , int minute4){
		if (minute4 == (0)){
			minute4 = 00;
		}
		int minuteresp[] = new int[5];
		minuteresp[1] = (minute1);
		minuteresp[2] = (minute2);
		minuteresp[3] = (minute3);
		minuteresp[4] = (minute4);
		return minuteresp;
		//Storing the user's inputs as an array
	}
	
	public static String[] storefilm(String filmans1, String filmans2, String filmans3, String filmans4) {
		String filmresp[] = new String[5];
		filmresp[1]= (filmans1);
		filmresp[2]= (filmans2);
		filmresp[3]= (filmans3);
		filmresp[4]= (filmans4);
		
		return filmresp;
		
	}
	public static int[] storehour(int hour1 , int hour2 , int hour3 , int hour4){
		int hourresp[] = new int[5];
		hourresp[1] = (hour1);
		hourresp[2] = (hour2);
		hourresp[3] = (hour3);
		hourresp[4] = (hour4);
		return hourresp;
		
		//Storing the user's inputs as an array
	}

	public static int askfilmminute1() {
		System.out.print("What time does it start? Minute ");
		Scanner lol = new Scanner(System.in);
		int minute1 = lol.nextInt();
		return minute1;
		
	}
	public static int askfilmminute2() {
		System.out.print("What time does it start? Minute ");
		Scanner lol = new Scanner(System.in);
		int minute2 = lol.nextInt();
		return minute2;
		
	}
	public static int askfilmminute3() {
		System.out.print("What time does it start? Minute ");
		Scanner lol = new Scanner(System.in);
		int minute3 = lol.nextInt();
		return minute3;
		
	}
	public static int askfilmminute4() {
		System.out.print("What time does it start? Minute ");
		Scanner lol = new Scanner(System.in);
		int minute4 = lol.nextInt();
		return minute4;
		
	}

	public static int askfilmhour1() {
		System.out.print("What time does it start? Hour ");
		Scanner lol = new Scanner(System.in);
		int hour1 = lol.nextInt();
		return hour1;
		
	}
	
	public static int askfilmhour2() {
		System.out.print("What time does it start? Hour ");
		Scanner lol = new Scanner(System.in);
		int hour2 = lol.nextInt();
		return hour2;
		//This asks the user a question and it returns the answer to the main method.
	}
	
	public static int askfilmhour3() {
		System.out.print("What time does it start? Hour ");
		Scanner lol = new Scanner(System.in);
		int hour3 = lol.nextInt();
		return hour3;
	}
	
	public static int askfilmhour4() {
		System.out.print("What time does it start? Hour ");
		Scanner lol = new Scanner(System.in);
		int hour4 = lol.nextInt();
		return hour4;
	}
	
	
	

	public static String askfilmname1() {
		System.out.print("Film for screen 1? ");
		Scanner lol = new Scanner(System.in);
		String filmans1 = lol.nextLine();
		return filmans1;
		//This asks the user a question and it returns the answer to the main method.
		}
	public static String askfilmname2() {
		System.out.print("Film for screen 2? ");
		Scanner lol = new Scanner(System.in);
		String filmans2 = lol.nextLine();
		return filmans2;
		
	
		}
	public static String askfilmname3() {
		System.out.print("Film for screen 3? ");
		Scanner lol = new Scanner(System.in);
		String filmans3 = lol.nextLine();
		return filmans3;
		
		
		}
	public static String askfilmname4() {
		System.out.print("Film for screen 4? ");
		Scanner lol = new Scanner(System.in);
		String filmans4 = lol.nextLine();
		return filmans4;
		//This asks the user a question and it returns the answer to the main method.
	
		}
	
	public static void storeanddisplay(String[] filmresp , int[] hourresp, int[] minuteresp){
		filmrec f1 = new filmrec();
		filmrec f2 = new filmrec();
		filmrec f3 = new filmrec();
		filmrec f4 = new filmrec();
		setFilmname(f1, filmresp[1]);
		setFilmname(f2, filmresp[2]);
		setFilmname(f3, filmresp[3]);
		setFilmname(f4, filmresp[4]);
		setHour(f1, hourresp[1]);
		setHour(f2, hourresp[2]);
		setHour(f3, hourresp[3]);
		setHour(f4, hourresp[4]);
		setMinute(f1, minuteresp[1]);
		setMinute(f2, minuteresp[2]);
		setMinute(f3, minuteresp[3]);
		setMinute(f4, minuteresp[4]);
		System.out.println("CinemaWorld Films Tonight");
		for(int i = 1; i<=3; i++){
			System.out.println("Screen "+ i+": "+filmresp[i]+"    "+ hourresp[i]+":"+ minuteresp[i]);
		}
		System.out.println("Screen 4: "+filmresp[4]+"   "+hourresp[4]+":"+"00");
		
		
	}

	public static filmrec setFilmname(filmrec f , String filmname){
		f.filmname = filmname;
		return f;
	}
	
	public static String getFilmname( filmrec f){
		return f.filmname;
	}
	public static filmrec setHour(filmrec f , int hour){
		f.hour = hour;
		return f;
	}
	public static int getHour(filmrec f){
		return f.hour;
	}
	
	public static filmrec setMinute(filmrec f, int minute){
		f.minute = minute;
		return f;
	}
	public static int getMinute(filmrec f){
		return f.minute;
	}
	//Setter and Getter methods for the three variables.
}

class  filmrec {
	String filmname;
	int hour;
	int minute;
}