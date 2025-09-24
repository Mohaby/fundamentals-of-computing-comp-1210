/**. 
 *
 * Project 02
 * @author Mohab Yousef
 * @version 09/02/2021
 */
 
import java.util.Scanner;
/**.
 *a program that find the result of a specified
 expression after reading input values for x and y,
 *
 */
public class TwoVariableExpression {
     
   /**.
   *@param args Command line arguments - not used.
   */

   public static void main(String[] args) {
   
      double x, y, result;
      Scanner userInput = new Scanner(System.in);
   
      //get user input
   
      System.out.println("result = (4.5x + 12.5) (3y - 9.0) / xy");
      System.out.print("\tx = ");
      x = userInput.nextDouble();
      System.out.print("\ty = ");
      y = userInput.nextDouble();
      
      //Calculate xy
      
      if (x * y != 0) {
      
         result = ((((4.5 * x) + 12.5) * ((3 * y) - 9.0)) / (x * y));
         System.out.println("result = " + result);
      }
      
      else { 
      
         System.out.println("result is \"undefined\""); 
      }
      System.out.println("");
   }
}