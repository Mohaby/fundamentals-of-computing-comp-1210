/**. 
 *prints my life goals. 
 * Activity 02
 * @author Mohab Yousef
 * @version 09/01/2021
 */
 
import java.util.Scanner;
/**.
 *a program that displays someone’s name, age, and gender
 */
public class AgeStatistics {
     
/**.
 *@param args Command line arguments - not used.
 */

   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
   
      //Prompt the user for their name:
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      //Prompt the user for their age:
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      //Prompt the user for their gender:
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
      //convert age:
      System.out.println("\tYour age in minutes is " 
            + ageInYears * 525600 + " minutes.");
      System.out.println("\tYour age in centuries is " 
            + (double) ageInYears / 100 + " centuries.");
      //display max heart rate
      
      if (gender == 1) { 
         System.out.print("Your max heart rate is " 
            + (209 - (0.7 * ageInYears)) + " beats per minute.");
      }
      else { 
         System.out.println("Your max heart rate is " 
            + (214 - (0.8 * ageInYears)) + " beats per minute.");
      }


            
   }
}