/**. 
 *
 * Project 11
 * @author Mohab Yousef
 * @version 11/29/2021
 */

import java.text.DecimalFormat;

/**.
*a derive class form AirTicket class
*/

public class NonRefundable extends AirTicket {


//Instance variable

   private double discount;
   
/**.
*class that contain a constructor that accepts 
four parameters representing the values in the 
AirTicket class and the one parameter for the field 
declared in in this class
*the super constructor will be called
with values for AirTicket because this class 
is a subclass of AirTicke
*@param flightNoIn represent the flight number of type String
*@param tripDataIn represent the trip data of typr Itinerary
*@param baseFareIn represent the base fare of typr double
*@param fareAdjFactorIn represent the FareAdjustmentFactor
of type double
*@param discountIn represent discountFactor

*/
 
   
   public NonRefundable(String flightNoIn, Itinerary tripDataIn, 
      double baseFareIn, double fareAdjFactorIn,
      double discountIn) {
      
      super(flightNoIn, tripDataIn, baseFareIn, fareAdjFactorIn);
      
      discount = discountIn;

   }
   
   
//Methods 


/**.
*getDiscountFactor accepts no parameters and 
returns a double representing the discount factor.
*@return discount factor
*/
   public double getDiscountFactor() {
   
      return discount;
      
   }
   
   
/**.
*totalFare accepts no parameters and returns a double 
representing the total fare calculated by multiplying the base fare 
by the fare adjustment factor and the discount factor.
*@return baseFare * fareAdjFac * the discount factor
as a totalFare.
*/

   public double totalFare() {
   
      double totalFare = baseFare * fareAdjFactor * discount;  
      return totalFare;
      
   }
   
/**.
*totalAwardMiles accepts no parameters and returns an int
equal to the actual miles from the itinerary 
*@return the actual miles
*/
 
   public int totalAwardMiles() {
      
      
      return tripData.getMiles();
      
   }
   
 /**.
 *toString method which will call toString method in the 
 parent class using super.toString(), and then print the 
 additional requirments
 *@return a String containing the information in the NonRefundable object
 */
 
   public String toString() {
      DecimalFormat df = new DecimalFormat("$#,##0.00");

      String output = " ";
   
      output += super.toString() + "\n"
          + "   Includes DiscountFactor: " + getDiscountFactor();
          
      return output;          
   }
}
                
   
   
   