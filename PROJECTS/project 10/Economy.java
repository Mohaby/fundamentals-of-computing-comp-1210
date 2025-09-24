/**. 
 *
 * Project 10
 * @author Mohab Yousef
 * @version 11/10/2021
 */

import java.text.DecimalFormat;

/**.
*a derive class form AirTicket class
*/

public class Economy extends AirTicket {


//Fields (static final variable)

/**.
*a static final variable for economy award miles 
factor of type double = 1.5 with public modifier
*/

   public static final double ECO = 1.5;
   
/**.
*class that contain a constructor that accepts 
four parameters representing the values in the 
AirTicket class
*the super constructor will be called
with values for AirTicket because this class 
is a subclass of AirTicke   
*@param flightNoIn represent the flight number of type String
*@param tripDataIn represent the trip data of typr Itinerary
*@param baseFareIn represent the base fare of typr double
*@param fareAdjFactorIn represent the FareAdjustmentFactor
of type double
*/

   public Economy(String flightNoIn, Itinerary tripDataIn, 
      double baseFareIn, double fareAdjFactorIn) {

      super(flightNoIn, tripDataIn, baseFareIn, fareAdjFactorIn);

   }
   
   
//Methods

/**.
*totalFare accepts no parameters and returns a double 
representing the total fare calculated by multiplying the base fare 
by the fare adjustment factor.
*@return baseFare * fareAdjFac
as a totalFare.
*/

   public double totalFare() {
   
      return (baseFare * fareAdjFactor);  
     
      
   }
   
   
/**.
*totalAwardMiles accepts no parameters and returns an int
equal to the actual miles from the itinerary multplied
bt the economy award mile 
*@return the total of multiplying the miles by the
award economy mile and cast the value to int
*/
 
   public int totalAwardMiles() {
   
      int t = (int) ((tripData.getMiles() *  ECO));
     
      return t;
      
   }
   

   

/**.
 *toString method which will call toString method in the 
 parent class using super.toString(), and then print the 
 additional requirments
 *@return a String containing the information in the Eeconmy object
 */
 
   public String toString() {
      DecimalFormat df = new DecimalFormat("$#,##0.00");

      String output = " ";
   
      output += super.toString() + "\n"
          + "   Includes Award Miles Factor: " + ECO;
          
      return output;          
   }
}


   
   
 