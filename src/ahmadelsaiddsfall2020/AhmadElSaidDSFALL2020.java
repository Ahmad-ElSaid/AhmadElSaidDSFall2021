
package ahmadelsaiddsfall2020;

import java.util.Scanner;

public class AhmadElSaidDSFALL2020 {


    public static void main(String[] args) {

    Scanner s = new Scanner (System.in);
    
    System.out.println ("Enter the number of movies to be rated");
    
   int nm = s.nextInt();
   
   String [] Movie = new String[nm];
   
   for(int i=1;i<=nm;i++){
       
       System.out.print("enter the name of movie " + i +"\n") ;
       
       String a = s.next();
       
      
       
   }
   System.out.println("enter the number of attendees");
   
   int att = s.nextInt();


   for(int f=0;f<att;f++){
       
    System.out.println("Welcome to cinema critics");
    
    int[]r =new int[nm];
    
    for(int j=0;j<nm;j++){
        
        System.out.println("please,enter a rating between 1 and 5 for " + Movie);
        
    }
}
}  
}
    
    
