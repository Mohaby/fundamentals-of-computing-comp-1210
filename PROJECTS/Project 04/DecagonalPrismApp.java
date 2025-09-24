/**. 
 *
 * Project 04
 * @author Mohab Yousef
 * @version 09/17/2021
 */
import java.util.Scanner;
/**.
*
*/
public class DecagonalPrismApp {
 
    /**.
    @param args is not used.
    */
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      String label;
      double edge;
      double height;

      System.out.println("Enter label, edge, and" 
         + " height for a decagonal prism.");
      System.out.print("\tlabel: ");
      label = sc.nextLine();

      System.out.print("\tedge: ");
      edge = Double.parseDouble(sc.nextLine());
      if (edge < 0) {
         System.out.println("Error: edge must be non-negative.");
 
      }
      else {
      
         System.out.print("\theight: ");
         height = Double.parseDouble(sc.nextLine());
         if (height < 0) {
            System.out.println("Error: height must be non-negative.");
         }
         else {
            DecagonalPrism prism = new DecagonalPrism(label, edge, height);
            System.out.println(prism);
         }
      }
   }
}