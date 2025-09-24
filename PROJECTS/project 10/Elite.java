/**. 
 *
 * Project 10
 * @author Mohab Yousef
 * @version 11/10/2021
 */

import java.text.DecimalFormat;

/**.
*a derive class form Business class
*/

public class Elite extends Business {

//Instance Variable

   private double commuServ;



//Construcor 


/**.
*class that contain a constructor that accepts 
four parameters representing the values in the 
AirTicket class, one parameter for the field 
declared in in this class, and two form business class
*the super constructor will be called
with values for AirTicket because this class 
is a subclass of AirTicke
*@param flightNoIn represent the flight number of type String
*@param tripDataIn represent the trip data of typr Itinerary
*@param baseFareIn represent the base fare of typr double
*@param fareAdjFactorIn represent the FareAdjustmentFactor
of type double
*@param commuServIn represent discountFactor
*@param fnbIn represent food and beverages of type double
*@param entIn represent entertainment of type double
*/
 
   
   public Elite(String flightNoIn, Itinerary tripDataIn, 
      double baseFareIn, double fareAdjFactorIn, double fnbIn, double entIn,
      double commuServIn) {
      
      super(flightNoIn, tripDataIn, baseFareIn, fareAdjFactorIn, fnbIn, entIn);
      
      commuServ = commuServIn;

   }
   
   
//Methods.   
   
/**.
*totalFare accepts no parameters and returns a double 
representing the total fare calculated by calling supet.totalFare()
and then adding the communication services
*@return super.totalFare() + commuServ
as a totalFare.
*/
  
   
   
   public double totalFare() {
  
      return (super.totalFare() + commuServ);
   }
   



 /**.
 *toString method which will call toString method in the 
 parent class using super.toString(), and then print the 
 additional requirments
 *@return a String containing the information in the Elite object
 */
 
   public String toString() {
      DecimalFormat df = new DecimalFormat("$#,##0.00");

      String output = " ";
   
      output += super.toString() + "\n"
        
          + "   Includes: Comm Services: " + df.format(commuServ);
          
      return output;          
   }
}


 