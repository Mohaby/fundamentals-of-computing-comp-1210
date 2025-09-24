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

public class Business extends AirTicket {


//Field

//Instance Variables
   protected double fnb;
   protected double ent;

//static final variable

/**.
*a static final variable for business award miles 
factor of type double = 2.0 with public modifier
*/

   public static final double BUISNESS = 2.0;

//Constructor


/**.
*class that contain a constructor that accepts 
four parameters representing the values in the 
AirTicket class and two ticket in this class
*the super constructor will be called
with values for AirTicket because this class 
is a subclass of AirTicke   
*@param flightNoIn represent the flight number of type String
*@param tripDataIn represent the trip data of typr Itinerary
*@param baseFareIn represent the base fare of typr double
*@param fareAdjFactorIn represent the FareAdjustmentFactor
of type double
*@param fnbIn represent food and beverages of type double
*@param entIn represent entertainment of type double
*/


   public Business(String flightNoIn, Itinerary tripDataIn, 
       double baseFareIn, double fareAdjFactorIn,
       double fnbIn, double entIn) {
      
      super(flightNoIn, tripDataIn, baseFareIn, fareAdjFactorIn);
      
      fnb = fnbIn;
      ent = entIn;
      

   }
   
   
//Methods

/**.
*totalFare accepts no parameters and returns a double 
representing the total fare calculated by multiplying the base fare by the 
fare adjustment factor adding that to total bevrages/food ,and entertainment
*@return baseFare * fareAdjFac + food/bevrages + entertainment
as a totalFare.
*/
  
   
   
   public double totalFare() {
  
      return ((baseFare * fareAdjFactor) + fnb + ent);
   }
   
   
   
/**.
*totalAwardMiles accepts no parameters and returns an int
equal to the actual miles from the itinerary multplied
bt the economy award mile 
*@return the total of multiplying the miles by the
award buisness mile and cast the value to int
*/  
   public int totalAwardMiles() {
   
   
      return (int) (tripData.getMiles() *  BUISNESS);
      
   }
   
   
   
 /**.
 *toString method which will call toString method in the 
 parent class using super.toString(), and then print the 
 additional requirments
 *@return a String containing the information in the Buisness object
 */
 
   public String toString() {
      DecimalFormat df = new DecimalFormat("$#,##0.00");

      String output = " ";
   
      output += super.toString() + "\n"
          + "   Includes Food/Beverage: " + df.format(fnb)
          + " Entertainment: " + df.format(ent);
          
      return output;          
   }
}
