/**. 
 *
 * Activity 11
 * @author Mohab Yousef
 * @version 11/16/2021
 */
 



public class Division {
  
/**.
*intDivide takes two int parameters (a numerator and denominator), 
performsinteger division, and returns the int result of dividing 
the numerator by the denominator.
*@return int result of dividing
*@param numerator for numerator
*@param denominator for denominator  
*/  
   public static int intDivide(int numerator, int denominator) {
      try 
      {
         return numerator / denominator;          
      }
      catch (ArithmeticException e) {
         return 0;
      }
   }
/**.
decimalDivide takes two int parameters (a numerator and denominator),
performs floating point division (you'll have to use casting), 
and returns the result of dividing the numerator by the denominator.
*@return double result of dividing
*@param numerator for numerator
*@param denominator for denominator  
*@throws IllegalArgumentException .
*/

   public static double decimalDivide(int numerator, int denominator) {
      if (denominator == 0) {
         throw new IllegalArgumentException("The denominator cannot be zero.");
      }
      return (double) numerator / (double) denominator;
   }
}
