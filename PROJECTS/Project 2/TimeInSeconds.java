/**. 
 *
 * Project 02
 * @author Mohab Yousef
 * @version 09/02/2021
 */
 
import java.util.Scanner;
/**.
 *a program that that accepts a raw time measurement in seconds
  (of type int) and then then displays the time as a
   combination of days, hours, minutes, and seconds
 *
 */

public class TimeInSeconds {
     
   /**.
   *@param args Command line arguments - not used.
   */

   public static void main(String[] args) {
   
      int days, hours, minutes, seconds, sec;
      Scanner userInput = new Scanner(System.in);
   
      //get user input
   
      System.out.print("Enter the raw time in seconds: ");
      sec = userInput.nextInt();
     
      
      //Calculate hours, min, and days
      
      if (sec <= 0) {
     
         System.out.println("*** Time must be non-negative. ***");
      }
     
      else { 
      
         System.out.println("");
         System.out.println("Time by combined days, hours, minutes, seconds: ");
  
         days = sec / (24 * 3600);        
         System.out.println("\tdays: " + days);
         
         hours = ((sec % (24 * 3600)) / 3600);
         System.out.println("\thours: " + hours);
         
         minutes = ((sec % (3600)) / 60);
         System.out.println("\tminutes: " + minutes);
         
         seconds = (sec % 60);
         System.out.println("\tseconds: " + seconds);
         
         System.out.println("");
         System.out.print(sec + " seconds = ");
         System.out.print(days + " days, "); 
         System.out.print(hours + " hours, "); 
         System.out.print(minutes + " minutes, "); 
         System.out.print(seconds + " seconds");         
          
      }
      
   }
}