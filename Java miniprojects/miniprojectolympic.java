

import java.util.Scanner;

public class olympic {

    public static void main(String[] param) {
        printq();
        int goldnum = goldtotal();
        int silvernum = silvertotal();
        int bronzenum = bronzetotal();
        String addacountry = medalts(goldnum, silvernum, bronzenum);
        int[] goldcount = goldarray();
        int[] silvercount = silverarray();
        int[] bronzecount = bronzearray();
        int[] goldcount1 = goldarray1(addacountry);
        int[] silvercount1 = silverarray1(addacountry);
        int[] bronzecount1= bronzearray1(addacountry);
        printmedals(goldcount , silvercount , bronzecount, addacountry);
        printmedals1( goldcount1, silvercount1 , bronzecount1,  addacountry);
        printorder(goldcount , silvercount , bronzecount);
        System.exit(0);
// List of different method
    }

    public static void printorder(int[] goldcount, int[] silvercount, int[] bronzecount) {
    	
        System.out.println(" Do you want to print out all the medals in order (from smallest to highest)? ");
        Scanner lol = new Scanner(System.in);
        String response = lol.nextLine();
        if(response.contains("yes")){
        System.out.println("I will now put the gold medals in order from smallest to largest for Great Britain.");
        int g2= goldcount[2];
        int g3 = goldcount[3];
        int g4 = goldcount [4];
        int g5 = goldcount[5];
 
    	
    	boolean fixed = false;
		int temp;
		while(fixed==false){
			fixed = true;
		for(int i = 1;i<=4;i++){
			if(goldcount[i]> goldcount[i+1]){
				temp = goldcount[i+1];
				goldcount[i+1]= goldcount[i];
				goldcount[i] = temp;
				fixed = false;
			}
		}
		
	}
		
		for(int j = 1; j <=5; j++){
			if(goldcount[j]==g2){
			System.out.println(goldcount[j]+" gold medals were won in day 2");
		}
			else if(goldcount[j]==g3){
				System.out.println(goldcount[j]+" gold medals were won in day 3");
			}
			else if(goldcount[j]==g4){
				System.out.println(goldcount[j]+" gold medals were won in day 4");
			}
			else if(goldcount[j]==g5){
				System.out.println(goldcount[j]+" gold medals were won in day 5");
			}
		}
		System.out.println(" ");
        System.out.println("Hello, I will now put the silver medals in order from smallest to largest for Great Britain.");
        int s2= silvercount[2];
        int s3 = silvercount[3];
        int s4 = silvercount [4];
        int s5 = silvercount[5];
 
    	
    	boolean fixed1 = false;
		int temp1 = 0;
		while(fixed1==false){
			fixed1 = true;
		for(int i = 1;i<=4;i++){
			if(silvercount[i]> silvercount[i+1]){
				temp1 = silvercount[i+1];
				silvercount[i+1]= silvercount[i];
				silvercount[i] = temp1;
				fixed1 = false;
			}
		}
		
	}
		
		for(int j = 1; j <=5; j++){
			if(silvercount[j]==s2){
			System.out.println(silvercount[j]+" silver medals were won in day 2");
		}
			else if(silvercount[j]==s3){
				System.out.println(silvercount[j]+" silver medals were won in day 3");
			}
			else if(silvercount[j]==s4){
				System.out.println(silvercount[j]+" silver medals were won in day 4");
			}
			else if(silvercount[j]==s5){
				System.out.println(silvercount[j]+" silver medals were won in day 5");
			}
		}
		
		System.out.println(" ");
        System.out.println("Hello, I will now put the bronze medals in order from smallest to largest for Great Britain.");
        int b2= bronzecount[2];
        int b3 = bronzecount[3];
        int b4 = bronzecount [4];
        int b5 = bronzecount[5];
 
    	
    	boolean fixed2 = false;
		int temp2 = 0;
		while(fixed2==false){
			fixed2 = true;
		for(int i = 1;i<=4;i++){
			if(bronzecount[i]> bronzecount[i+1]){
				temp2 = bronzecount[i+1];
				bronzecount[i+1]= bronzecount[i];
				bronzecount[i] = temp2;
				fixed2 = false;
			}
		}
		
	}
		
		for(int j = 1; j <=5; j++){
			if(bronzecount[j]==b2){
			System.out.println(bronzecount[j]+" bronze medals were on in day 2");
		}
			else if(bronzecount[j]==b3){
				System.out.println(bronzecount[j]+" bronze medals were on in day 3");
			}
			else if(bronzecount[j]==b4){
				System.out.println(bronzecount[j]+" bronze medals were on in day 4");
			}
			else if(bronzecount[j]==b5){
				System.out.println(bronzecount[j]+" bronze medals were on in day 5");
			}
		}
		
		
}
    }
    


    	
    	
		
	

	public static void printq(){
        System.out.println("Do you want to see how many medals we've won?");
        String reply;
        Scanner lol = new Scanner(System.in);
        reply = lol.nextLine();
        if (reply.contains("yes"))  {
        return;
    }
        else {
        System.out.println("Bye");
        System.exit(0);
    }
 
    }

    public static void medaltotal(int a){
        System.out.println("               G   S   B   Total");
        System.out.println("Great Britain  27  23  17   67");
        System.out.println(a);
    }

    public static int goldtotal(){
        System.out.println("How many people won a gold medal today?");
        int goldnum;
        Scanner lol = new Scanner(System.in);
        goldnum = lol.nextInt();
        return goldnum;
    }

    public static int silvertotal(){
        System.out.println("How many people won a silver medal today?");
        int silvernum; 
        Scanner lol = new Scanner(System.in);
        silvernum = lol.nextInt();
        return silvernum;
    }

    public static int bronzetotal(){
        System.out.println("How many people won a bronze medal today?");
        int bronzenum;
        Scanner lol = new Scanner(System.in);
        bronzenum = lol.nextInt();
        return bronzenum;
    }

    public static String medalts(int goldnum, int silvernum, int bronzenum) {
        int totalmed = goldnum + silvernum + bronzenum;
        medalrec c1 = new medalrec();
        medalrec c2 = new medalrec();
        setCountryname(c1, "Great Britain");
        Scanner lol = new Scanner(System.in);
        setGoldmeda(c1,goldnum);
        setSilvermeda(c1, silvernum);
        setBronzemeda(c1, bronzenum);
        int totalnum = goldnum + silvernum + bronzenum;
        setTotalmeda(c1, totalnum);
        System.out.println("Enter  another Country ");
        String response1 = lol.nextLine();
        setCountryname(c2,response1);
        System.out.println("How many gold, silver and bronze medals were won? ");
        System.out.println("Gold?");
        int goldc = lol.nextInt();
        System.out.println("Silver?");
        int silverc = lol.nextInt();
        System.out.println("Bronze?");
        int bronzec = lol.nextInt();
        int totalc = goldc + silverc + bronzec;
        setGoldmeda(c2,goldc);
        setSilvermeda(c2,silverc);
        setBronzemeda(c2,bronzec);
        setTotalmeda(c2,totalc);
       
        
        System.out.println(getCountryname(c1)+"   GOLD = "+getGoldmeda(c1)+" SILVER = "+getSilvermeda(c1)+"  BRONZE = "+ getBronzemeda(c1)+" TOTAL =  "+ getTotalmeda(c1));
        System.out.println(getCountryname(c2)+" GOLD = "+ getGoldmeda(c2)+" SILVER = "+getSilvermeda(c2)+" BRONZE =  "+ getBronzemeda(c2)+" TOTAL =  "+ getTotalmeda(c2));
        return response1;
    }
    public static int[] goldarray(){
       int goldcount[] = new int [7];
       Scanner lol = new Scanner(System.in);
       System.out.println("Do you want to update the table with gold medals?. Press END when you want to stop.");
       String response = lol.nextLine();
       String loopanswer= ("");
       if (response.contains("yes")){
          
       for (int k = 2; k<= 4 ; k++)
        {
      int counter = 1;
      while(!loopanswer.contains("END")){
    counter +=1;
      System.out.println(" How many gold medals were won in day " + counter+ "?");
      goldcount[counter] = lol.nextInt();
      System.out.print("Do you want to Continue? {yes} {END}");
      Scanner lool = new Scanner(System.in);
      loopanswer = lool.nextLine();
     
      
        }
       }
          return goldcount;
       }
       else {
      return null;
       }
       
       
       
    }
    
    public static int[] silverarray(){
        int silvercount[] = new int [7];
        silvercount[2]=0;
        Scanner lol = new Scanner(System.in);
        System.out.println("Do you want to update the table with silver medals?. Press END when you want to stop.");
        String response = lol.nextLine();
        String loopanswer= ("");
        if (response.contains("yes")){
           
        for (int k = 2; k<= 4 ; k++)
        {
        int counter = 1;
        while(!loopanswer.contains("END")){
      counter +=1;
        System.out.println(" How many silver medals were won in day " + counter+ "?");
        silvercount[counter] = lol.nextInt();
        System.out.print("Do you want to Continue? {yes} {END}");
        Scanner lool = new Scanner(System.in);
        loopanswer = lool.nextLine();
       
        
        }
        }
           return silvercount;
        }
        else {
        return null;
        }
        
        
        
     }
    
    public static int[] bronzearray(){
        int bronzecount[] = new int [7];
        bronzecount[2]= 0;
        Scanner lol = new Scanner(System.in);
        System.out.println("Do you want to update the table with bronze medals?. Press END when you want to stop.");
        String response = lol.nextLine();
        String loopanswer= ("");
        if (response.contains("yes")){
           
        for (int k = 2; k<= 4 ; k++)
        {
        int counter = 1;
        while(!loopanswer.contains("END")){
      counter +=1;
        System.out.println(" How many bronze medals were won in day " + counter+ "?");
        bronzecount[counter] = lol.nextInt();
        System.out.print("Do you want to Continue? {yes} {END}");
        Scanner lool = new Scanner(System.in);
        loopanswer = lool.nextLine();
       
        
        }
        }
           return bronzecount;
        }
        else {
        return null;
        }
    }
        public static int[] goldarray1(String response1){
            int goldcount[] = new int [7];
            goldcount[2]=0;
            Scanner lol = new Scanner(System.in);
            System.out.println("Do you want to update the table with gold medals? for "+response1+" . Press END when you want to stop.");
            String response = lol.nextLine();
            String loopanswer= ("");
            if (response.contains("yes")){
               
            for (int k = 2; k<= 4 ; k++)
             {
           int counter = 1;
           while(!loopanswer.contains("END")){
         counter +=1;
           System.out.println(" How many gold medals were won in day " + counter+ "?");
           goldcount[counter] = lol.nextInt();
           System.out.print("Do you want to Continue? {yes} {END}");
           Scanner lool = new Scanner(System.in);
           loopanswer = lool.nextLine();
          
           
             }
            }
               return goldcount;
            }
            else {
           return null;
            }
        }
            public static int[] silverarray1(String response1){
                int goldcount[] = new int [7];
                goldcount[2]=0;
                Scanner lol = new Scanner(System.in);
                System.out.println("Do you want to update the table with silver medals? for "+response1+" . Press END when you want to stop.");
                String response = lol.nextLine();
                String loopanswer= ("");
                if (response.contains("yes")){
                   
                for (int k = 2; k<= 4 ; k++)
                 {
               int counter = 1;
               while(!loopanswer.contains("END")){
             counter +=1;
               System.out.println(" How many silver medals were won in day " + counter+ "?");
               goldcount[counter] = lol.nextInt();
               System.out.print("Do you want to Continue? {yes} {END}");
               Scanner lool = new Scanner(System.in);
               loopanswer = lool.nextLine();
              
               
                 }
                }
                   return goldcount;
                }
                else {
               return null;
                }
            }
            
                public static int[] bronzearray1(String response1){
                    int goldcount[] = new int [7];
                    goldcount[2] = 0;
                    String lol123[] = new String[1];
                    Scanner lol = new Scanner(System.in);
                    System.out.println("Do you want to update the table with bronze medals? for "+response1+" . Press END when you want to stop.");
                    String response = lol.nextLine();
                    String loopanswer= ("");
                    if (response.contains("yes")){
                       
                    for (int k = 2; k<= 4 ; k++)
                     {
                   int counter = 1;
                   while(!loopanswer.contains("END")){
                 counter +=1;
                   System.out.println(" How many bronze medals were won in day " + counter+ "?");
                   goldcount[counter] = lol.nextInt();
                   System.out.print("Do you want to Continue? {yes} {END}");
                   Scanner lool = new Scanner(System.in);
                   loopanswer = lool.nextLine();
                  
                   
                     }
                    }
                       return goldcount;
                    }
                    else {
                   return null;
                    }
            
        
        
     }
        
    public static void printmedals(int[] goldcount, int[] silvercount, int[] bronzecount, String addacountry){
    System.out.println("Here is the list of the medals won for 5 days for Great Britain.");
    for(int i = 2 ; i<=5; i++){
    System.out.println("Gold medals won in day "+i+ " :"+goldcount[i]);
    System.out.println("Silver medals won in day "+i+" :"+silvercount[i]);
    System.out.println("Bronze medals won in day "+i+" :"+bronzecount[i]);
    }
   System.out.println(" ");
   
    }
    
    public static void printmedals1(int[] goldcount, int[] silvercount, int[] bronzecount, String addacountry){
        System.out.println("Here is the list of the medals won for 5 days for "+addacountry);
        for(int i = 2 ; i<=5; i++){
        System.out.println("Gold medals won in day "+i+ " :"+goldcount[i]);
        System.out.println("Silver medals won in day "+i+" :"+silvercount[i]);
        System.out.println("Bronze medals won in day "+i+" :"+bronzecount[i]);
        
        
        }
    }
  
   
    
        public static medalrec setCountryname(medalrec c, String countryname){
            c.countryname= countryname;
            return c;
        }
        
        public static String getCountryname(medalrec c){
            return c.countryname;
        }
        
        public static medalrec setGoldmeda(medalrec c, int goldmeda){
            c.goldmeda = goldmeda;
            return c;
        }
        
        public static int getGoldmeda(medalrec c){
            return c.goldmeda;
        }
        
        public static medalrec setSilvermeda(medalrec c, int silvermeda){
            c.silvermeda = silvermeda;
            return c;
        }
        
        public static int getSilvermeda(medalrec c){
            return c.silvermeda;
        }
        
        public static medalrec setBronzemeda(medalrec c, int bronzemeda){
            c.bronzemeda = bronzemeda;
            return c;
        }
        
        public static int getBronzemeda(medalrec c){
            return c.bronzemeda;
        }
        
        public static medalrec setTotalmeda(medalrec c, int totalmeda){
            c.totalmeda = totalmeda;
            return c;
        }
        
        public static int getTotalmeda(medalrec c){
            return c.totalmeda;
        }
        
        
        
        
        
    }
    class medalrec
    {
    String countryname;
    int goldmeda;
    int silvermeda;
    int bronzemeda;
    int totalmeda = goldmeda+silvermeda+bronzemeda;
    
    
    
    
    }