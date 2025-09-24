/**. 
 *
 * Project 09
 * @author Mohab Yousef
 * @version 11/05/2021
 */

import java.text.DecimalFormat;

/**.
*an abstract AirTicket class that stores ticket data
*/

public abstract class AirTicket implements Comparable<AirTicket> {

// Instance Variable
 
   protected String flightNo;
   protected Itinerary tripData;
   protected double baseFare;
   protected double fareAdjFactor;


//Constructor 

/**.
*Constructor that will be calles form he subclasses of AirTicket
using super and the parameter list because this class is abstract.
*@param flightNoIn represent the flight number of type String
*@param tripDataIn represent the trip data of typr Itinerary
*@param baseFareIn represent the base fare of typr double
*@param fareAdjFactorIn represent the FareAdjustmentFactor
of type double
*/

   public AirTicket(String flightNoIn, Itinerary tripDataIn, 
      double baseFareIn, double fareAdjFactorIn) {
      flightNo = flightNoIn;
      tripData = tripDataIn;
      baseFare = baseFareIn;
      fareAdjFactor = fareAdjFactorIn;
      
   }
   
   
//Methods 


/**.
*getFlightNum to the number of the flight
Accepts no parameters and returns a String representing the flight
number.
*@return the flight number
*/
   public String getFlightNum() {
   
      return flightNo;
      
   }
   
   
/**. 
*getBasefare represent base fare 
Accepts no parameters and returns a double representing 
the base fare.
*@return the base fare
*/
   
   public double getBaseFare() {
   
      return baseFare;
      
   }
  
/**.
*getFareAdjustmentFactor Accepts no parameters and returns a double 
representing the fare adjustment factor field
*@return the fare adjustment factor field
*/
   
   public double getFareAdjustmentFactor() {
   
      return fareAdjFactor;
   
   }

/**.
*toString method which will be called from the toString method
 in the subclasses of AirTicket using super.toString() 
 *@return a String containing the information in the AirTicket object
 */
   
   public String toString() {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
   
      String result = "";
   
      result += 
          "Flight: " + getFlightNum() + "\n"
          + tripData.toString()
          + "(" + totalAwardMiles() + " award miles)"
          + "\nBase Fare: " + df.format(getBaseFare()) 
          + " Fare Adjustment Factor: "
          + getFareAdjustmentFactor() + "\nTotal Fare: "
          + df.format(totalFare()) + " (" + this.getClass() + ")";
          
      return result;
          
   }
   
/**.
An abstract method that accepts no parameters and 
returns a double representing the total fare
and will be implemeted in Subclasses of AirTicket
*@return total fare of type double
*/
          
   public abstract double totalFare();
          
/**.
An abstract method that accepts no parameters and 
returns a double representing the award miles
and will be implemeted in the direct classes Subclasses of AirTicket
*@return the award miles of type int
*/
            
        
          
          
   public abstract int totalAwardMiles(); 
          
/**.
*compareTo method takes an AirTicket as a formal parameter.
*@return an int the results of comparing tickets based on their respective 
flight numbers
*@param mt represent air ticket element
*/
         
   public int compareTo(AirTicket mt)
   {
      int result = getFlightNum().compareTo(mt.getFlightNum()); 
      return result;
   }  
   
/**.
*getItinerary method that accepts no parameters 
*@return the value for the trip data field of type Itinerary. 
*/  
   
   public Itinerary getItinerary() {
   
      return tripData;
   }
   
    
         
    
    
          
}    
 