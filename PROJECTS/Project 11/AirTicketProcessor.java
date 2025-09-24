/**. 
 *
 * Project 11
 * @author Mohab Yousef
 * @version 11/29/2021
 */
 

import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
import java.io.FileNotFoundException;
/**.
* AirTicketProcessor class provides methods for reading in the data file and
generating reports.
*/

public class AirTicketProcessor { 

// Fields 
   private AirTicket[] obj;
   private String[] invalidRec;


//Constructor 
/**. Constructor tha has no parameter 
and intialize obj to array of type AirTicket to 0
and InvalidRec to array of type String to 0
*/

   public AirTicketProcessor() {
      obj = new AirTicket[0];
      invalidRec = new String[0];
   
   }
   
//Methods 


/**.
*readAirTicketFile has no return value, accepts the data 
file name as a String and throws FileNotFoundException
*@param fileNameIn rpresent the file that airTicketApp going to
read of type string
*@throws FileNotFoundException for readAirTicketFile
*/

         
      


   public void readAirTicketFile(String fileNameIn)
       throws FileNotFoundException {
        
        
      Scanner scanFile = new Scanner(new File(fileNameIn));
      while (scanFile.hasNext()) {
         Scanner sc = new Scanner(scanFile.nextLine()).useDelimiter(",");
        
         String flightNo;
         Itinerary tripData;
         double baseFare;
         double fareAdjFactor;
         double discount;
         double fnb;
         double ent;
         double commuServ;


         int id = 0;
         switch ((sc.next()).charAt(id))
         {
         
            case 'N':
               try {
                  flightNo = sc.next();
                  tripData = new Itinerary(sc.next(), sc.next(),
               sc.next(), sc.next(), Integer.parseInt(sc.next()));
        
                  NonRefundable nr = new NonRefundable(flightNo, tripData, 
                     Double.parseDouble(sc.next()),
                     Double.parseDouble(sc.next()), 
                     Double.parseDouble(sc.next()));
                  addAirTicket(nr);
               }
               catch (NumberFormatException e) {
                  String output = e + " in: " + sc;
                  addInvalidRecord(output);
               }
               break;
        
            case 'E':
               try {
                  flightNo = sc.next();
                  tripData = new Itinerary(sc.next(), sc.next(),
               sc.next(), sc.next(), Integer.parseInt(sc.next()));
                  Economy e = new Economy(flightNo, tripData, 
                     Double.parseDouble(sc.next()),
                     Double.parseDouble(sc.next())); 
                  addAirTicket(e);
               }
               catch (NumberFormatException e) {
                  String output = e + " in: " + sc;
                  addInvalidRecord(output);
               }

               break;
 
            case 'B':
               try {
                  flightNo = sc.next();
                  tripData = new Itinerary(sc.next(), sc.next(),
               sc.next(), sc.next(), Integer.parseInt(sc.next()));
                  Business b = new Business(flightNo, tripData, 
                     Double.parseDouble(sc.next()),
                     Double.parseDouble(sc.next()), 
                     Double.parseDouble(sc.next()),
                     Double.parseDouble(sc.next()));
                  addAirTicket(b);
               }
               catch (NumberFormatException e) {
                  String output = e + " in: " + sc;
                  addInvalidRecord(output);
               }

               break;
        
            case 'F':
               try {
                  flightNo = sc.next();
                  tripData = new Itinerary(sc.next(), sc.next(),
               sc.next(), sc.next(), Integer.parseInt(sc.next()));
                  Elite el = new Elite(flightNo, tripData, 
                     Double.parseDouble(sc.next()),
                     Double.parseDouble(sc.next()), 
                     Double.parseDouble(sc.next()),
                     Double.parseDouble(sc.next()),
                     Double.parseDouble(sc.next()));
                  addAirTicket(el);
               }
               catch (NumberFormatException e) {
                  String output = e + " in: " + sc;
                  addInvalidRecord(output);
               }

               break;


            default:
                 
         }
      }
   }
   
  





/**.
*addAirTicket method that increases the capacity of 
the AirTicket array by one, and adds the AirTicket in the
last position of the AirTicket array
*@param aRIn represent airTicket element
 */

   public void addAirTicket(AirTicket aRIn) {
   
    
      obj = Arrays.copyOf(obj, obj.length + 1);
      obj[obj.length - 1] = aRIn;
   }
/**.
*addInvalidRecord method that accepts a String and
 increases the capacity of the invalidRecords array by one
 and adds the String in the last position of the invalidRecords array
 *@param iRIn represent invalid record element of type String
 */
   public void addInvalidRecord(String  iRIn) {
      invalidRec = Arrays.copyOf(invalidRec, invalidRec.length + 1);
      invalidRec[invalidRec.length - 1] = iRIn;
   }
 
 
/**. 
*generateReport method that accepts no parameters and return a 
String representing the Air Ticket Report
*@return report that assembled by processing the AirTicket 
array using the original order from the file
*/

   public String generateReport() 

   {
      String output = "----------------------------\n" 
            + "Air Ticket Report\n"
         + "----------------------------\n\n";
         
      
      
      for (int i = 0; i < obj.length; i++) {
      
         output +=  obj[i].toString() + "\n\n";
      }      
       
      return output;
   
   }
   
/**.
*generateReportByFlightNum accepts no parameters and 
returns a String representing the Air Ticket Report (by Flight Number).
*@retrun The report assembled by first sorting the
AirTicket array using the natural ordering and 
then processing the AirTicket array
*@return report by FLight number of type String
*/

   public String generateReportByFlightNum()
   {
      
      Arrays.sort(obj);
                      
      String output = "--------------------------------------\n"
         + "Air Ticket Report (by Flight Number)\n"
         + "--------------------------------------\n\n";
      
      for (int i = 0; i < obj.length; i++) {
      
         output += obj[i].toString() + "\n\n";
      }
      return output;
   } 
   
   
/**.  
*generateReportByItinerary accepts no parameters and returns a
String representing the Air Ticket Report (by Itinerary)
*@return The report  assembled by first sorting the 
AirTicket array by Itinerary and then processing the AirTicket array 
*/

   public String generateReportByItinerary()
   {
   
      Arrays.sort(obj);
      Arrays.sort(obj, new ItineraryComparator());
                      
      String output = "--------------------------------------\n"
         + "Air Ticket Report (by Itinerary)\n"
         + "--------------------------------------\n\n";
         
         
         
         
      
      for (int i = 0; i < obj.length; i++)
      {
         output += obj[i].toString() + "\n\n"; 
      
         
      }
      
      return output;
   }
   
   /**.
*getTicket method accept no parameters 
*@return the value of the field for the array
of type airTicket
*/

   public AirTicket[] getTickets() 
   {
      return obj;
   }

/**.
getInvalidInput method accept no parameters
*@return a String represent the airTicket for invalid Input
*/

   public String[] getInvalidInput() 
   {
      return invalidRec;
   }

 /**.
      * @return output for the InvalidRecords report
      */
   public String generateReportForInvalidInput()
   {
      String output = "--------------------------------------\n"
         + "Air Ticket Report for Invalid Input\n"
         + "--------------------------------------\n\n";
         
      for (int i = 0; i < obj.length; i++)
      {
         output += obj[i] + "\n\n"; 
      
         
      }

      return output;
   }




   
}


  
  

