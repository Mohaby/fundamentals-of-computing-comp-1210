/**. 
 *
 * Project 3
 * @author Mohab Yousef
 * @version 10/14/2021
 */
import java.text.DecimalFormat;
import java.util.Scanner;

/**.
*program that use math class to solve resuls
*/

public class UsingMathMethods {

/**.
*@param args Command Line args(not used)
*/

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a value for x: ");
      double x = sc.nextDouble();
      double result = ((8 * Math.pow(x, 4)) 
         + (Math.sqrt(Math.abs((4 * Math.pow(x, 3) 
            + (4 * Math.pow(x, 2)) + (4 * x) + 4))))) / (4 + Math.abs(x));
      String s = Double.toString(result);
      int i = s.indexOf(".");
      int l = s.length();
      String s0 = s.substring(0, i);
      String s1 = s.substring(i + 1, l);
      DecimalFormat df = new DecimalFormat("#, ##0.0##");
      System.out.println("Result: " + result);
      System.out.println("# of characters to left of decimal point: " 
         + s0.length());
      System.out.println("# of characters to right of decimal point: "
         + s1.length());
      System.out.println("Formatted Result: " + df.format(result));
   }
}
      
