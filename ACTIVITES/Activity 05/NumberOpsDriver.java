/**.
  * Activity 05.
  * @Mohab Yousef
  * @09/22/2021
  */


import java.util.ArrayList;
import java.util.Scanner;
/**.
* NumberOperationDriver
*/
public class NumberOpsDriver {
/**.
* @param args Command Line args(not used). 
*/
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      ArrayList<NumberOperations> numOpsList =
         new ArrayList<NumberOperations>();
      System.out.println("Enter a list of positive integers separated" 
               + " with a space followed by 0:");
      int n = -1;
      while (n != 0)
      {
         n = in.nextInt();
         if (n != 0)
         {
                //add to list
            numOpsList.add(new NumberOperations(n));
         }
      }
      int index = 0;
      while (index < numOpsList.size())
      {
         NumberOperations num = numOpsList.get(index);
         System.out.println("For: " + num);
         System.out.println("\tOdds under: " + num.oddsUnder());
         System.out.println("\t  Powers of 2 under: " + num.powersTwoUnder());
         index++;
      }
   }
}