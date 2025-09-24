/**. 
 *
 * Project 10
 * @author Mohab Yousef
 * @version 11/10/2021
 */



/**.
*Itinerary class that stores trip data and provides methods 
for get departure date/time, get miles, and toString
*/

public class Itinerary  {

// Instance Variable
 

   private String departure = "from airport";
   private String arrival = "to airport";
   private String departureDate;
   private String arrivalDate;
   private int miles;



//Constructor 
/**.
*Itinerary class that accepts five parameters representing 
the value to be assigned to fields above
*@param departureIn for df represent the airport that the plane
will deparute from
*@param arrivalIn for aT represent the airport that the plane
will arrive to
*@param departureDateIn for dD represent the departure date
and time
*@param arrivalDateIn for aD represent the arrival date
and time
*@param milesIn for the miles that the plane will
travel
*/
   public Itinerary(String departureIn, String arrivalIn, 
      String departureDateIn, String arrivalDateIn, int milesIn) {
      departure = departureIn;
      arrival = arrivalIn;
      departureDate = departureDateIn;
      arrivalDate = arrivalDateIn;
      miles = milesIn;
   
   }  
// Methods

/**.
*getFromAirport represent the place
the plane will departure from
*@return departure which is the 
departure place
*/

   public String getFromAirport() {

      return departure;
   }
   

/**.
*getToAirport represent the place
the plane will arive to
*@return arrival which is the 
arrival place
*/

   public String getToAirport() {

      return arrival;
   }


/**.
*getDepDateTime represent departure time and date
*@return departureDate which is the 
departure time and date
*/

   public String getDepDateTime() {

      return departureDate;

   }
   
/**.
*getAirDateTime represent arrival time and date
*@return arrivalDate which is the 
arrival time and date
*/


   public String getAriDateTime() {

      return arrivalDate;
   }

/**.
*getMiles represent the miles that the plane will
travel
*@return the miles that the plane will travel
 */ 

   public int getMiles() {

      return miles;
   }
   
/**.
*@return the depPlace, date, time,
 the arivalPlcae, date, time, and the miles
 */ 
  
 

   public String toString() {
     

      String output = "";

      output += getFromAirport() + "-" 
         + getToAirport() 
         + " (" + getDepDateTime()
         +   " - " + getAriDateTime() + ") "
         + getMiles() + " miles ";
       
      return output;
   }
}
  


