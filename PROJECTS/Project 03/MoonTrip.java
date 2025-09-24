/**. 
 *
 * Project 3
 * @author Mohab Yousef
 * @version 10/14/2021
 */
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;

/**.
*program that use math class to solve resuls
*/

public class MoonTrip {

/**.
*@param args Command Line args(not used)
*/

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      DecimalFormat df1 = new DecimalFormat("#, ###, ###.00");
      DecimalFormat df2 = new DecimalFormat("00000");
      DecimalFormat df3 = new DecimalFormat("0%");

      System.out.print("Enter ticket code: ");   
      String ticket = sc.nextLine().trim();
      if (ticket.length() >= 27)
      {
         Random r = new Random();         
         double price = Double.parseDouble(ticket.substring(12, 19)  
            + "." + ticket.substring(18, 20));

         double discount = Double.parseDouble(ticket.substring(21, 23));
         discount = discount / 100;
         String month = ticket.substring(0, 2);
         String day = ticket.substring(2, 4);
         String year = ticket.substring(4, 8);
         String hour = ticket.substring(8, 10);
         String minute = ticket.substring(10, 12);
         String seat = ticket.substring(23, 26);
         String tick = ticket.substring(26);
         double cost = (price - ((discount) * price));
         int prizeNumber = r.nextInt(99999);
         System.out.println("\nTicket: " + tick + "   Date: " + month + "/" 
            + day + "/" + year + "   Time: " + hour + ":" + minute);
         System.out.println("Seat: " + seat + "   Price: $" + df1.format(price) 
            + " Discount: " + df3.format(discount) + "   Cost: $" 
            + df1.format(cost));
         System.out.println("Prize Number: " + df2.format(prizeNumber));

      }
      else
      {
         System.out.println("\n*** Invalid Ticket Code ***");
         System.out.println("Ticket code must have at least 27 characters.");
      }
      
   }

}