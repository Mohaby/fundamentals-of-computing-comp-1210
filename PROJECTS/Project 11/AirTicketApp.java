/**.  
 *
 * Project 11
 * @author Mohab Yousef
 * @version 11/29/2021
 */

import java.io.FileNotFoundException;
/**.
*AirticketApp 
*/

public class AirTicketApp {
/**.
* @param args Command line arguments are used
* @throws FileNotFoundException just for you, WebCat. 
*/
   public static void main(String[] args) throws FileNotFoundException {
      try {
      
      
         if (args.length > 0)
         {
     
     
      
            String fileNameIn = args[0];
            AirTicketProcessor list = new AirTicketProcessor();
            list.readAirTicketFile(fileNameIn);
        
  
            System.out.print(list.generateReport());
        
         
            System.out.print(list.generateReportByFlightNum());
        
         
            System.out.print(list.generateReportByItinerary()); 
         

                        
         }
      
         else if (args.length == 0) {
            System.out.println(
               "File name not provided by command line argument."
                           + "\nProgram ending.");

         }
      }
      catch (FileNotFoundException exception) {
         String fileName = args[0];
         System.out.println("*** File not found."
            + "\nProgram ending.");
      }
  
   }
}