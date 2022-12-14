//Author: Akshay Ramchurn (02/10/16)
import java.util.Scanner;
//Needed to make Scanner Available 
class paintingrec{
String where;
String titleofpainting;
String artist;
String yearpainted;
String height;
String width;
//Declaring the variables that will be used as the painting record.
}
public class painting{
	
	public static void main(String[] param){
		paintingrec r1 = new paintingrec();
		paintingrec r2 = new paintingrec();
		paintingrec r3 = new paintingrec();
		paintingrec r4 = new paintingrec();
		setWhere(r1,"ahead of you");
		setTitleofpainting(r1,"Woman with a pearl Necklace in a Loge");
		setArtist(r1,"Mary Cassatt");
		setYearpainted(r1,"1879");
		setHeight(r1,"81.3cm");
		setWidth(r1,"59.7cm");
		//This is setting the values for the record variables.
		
		setWhere(r2,"ahead of you");
		setTitleofpainting(r2,"Self Portrait with Beret and Turned up Collar");
		setArtist(r2,"Rembrandt");
		setYearpainted(r2,"1659");
		setHeight(r2,"84.5cm");
		setWidth(r2,"66.0cm");
		
		setWhere(r3,"on the left");
		setTitleofpainting(r3,"Girl with Chrysanthemums");
		setArtist(r3,"Olga Boznanska");
		setYearpainted(r3,"1894");
		setHeight(r3,"88.5cm");
		setWidth(r3,"69.0cm");
		
		setWhere(r4,"on your right");
		setTitleofpainting(r4,"Impression, Sunrise");
		setArtist(r4,"Claude Monet");
		setYearpainted(r4,"1872");
		setHeight(r4,"48.0cm");
		setWidth(r4,"63.0cm");
		
		
		
		
		System.out.println("What room are you in?");
		Scanner scanner = new Scanner(System.in);
		String response = scanner.nextLine();
	if(response.equals("1")){
		System.out.print("The painting "+ getWhere(r1) + " is by "+ getArtist(r1) + ". It was painted in "+ getYearpainted(r1));
		System.out.print( " and is called "+ getTitleofpainting(r1) + ". It is "+ getHeight(r1) + " by "+ getWidth(r1) + "." );
		//Depending on what the user's input is, the corresponding answer will appear.
		//Each answer is called using the getter method
		}
	else if (response.equals("2")){
		System.out.print("The painting "+ getWhere(r2) + " is by "+ getArtist(r2) + ". It was painted in "+ getYearpainted(r2));
		System.out.print( " and is called "+ getTitleofpainting(r2) + ". It is "+ getHeight(r2) + " by "+ getWidth(r2) + "." );
		}
	else if (response.equals("3")){
		System.out.print("The painting "+ getWhere(r3) + " is by "+ getArtist(r3) + ". It was painted in "+ getYearpainted(r3));
		System.out.print( " and is called "+ getTitleofpainting(r3) + ". It is "+ getHeight(r3) + " by "+ getWidth(r3) + "." );
		}
	else if (response.equals("4")){
		System.out.print("The painting "+ getWhere(r4) + " is by "+ getArtist(r4) + ". It was painted in "+ getYearpainted(r4));
		System.out.print( " and is called "+ getTitleofpainting(r4) + ". It is "+ getHeight(r4) + " by "+ getWidth(r4) + "." );
		}
	else{
		System.out.println("That is an invalid answer");
		//Provides a suitable response if the person types an invalid answer.
	}
	
	
	}

	public static paintingrec setWhere(paintingrec r , String where){
		r.where = where;
		return r;
	}
	
	public static String getWhere(paintingrec r){
		return r.where;
	}
	//Setter and getter methods
	public static paintingrec setTitleofpainting(paintingrec r , String titleofpainting){
		r.titleofpainting = titleofpainting;
		return r;
	}
	
	public static String getTitleofpainting(paintingrec r)
	{
		return r.titleofpainting;
	
	}
	
	public static paintingrec setArtist(paintingrec r, String artist)
	{
	r.artist = artist;
	return r;
	}
	
	public static String getArtist(paintingrec r)
	{
		return r.artist;
	}
	
	public static paintingrec setYearpainted(paintingrec r , String yearpainted)
	{
	r.yearpainted= yearpainted;
	return r;
	}
	
	public static String getYearpainted(paintingrec r)
	{
		return r.yearpainted;
	}
	
	public static paintingrec setHeight(paintingrec r , String height)
	{
		r.height = height;
		return r;
	}
	
	public static String getHeight(paintingrec r)
	{
		return r.height;
	}
	
	public static paintingrec setWidth(paintingrec r, String width)
	{
		r.width = width;
		return r;
	}
	
	public static String getWidth(paintingrec r)
	{
		return r.width;
	}
	
	}
	
	
	