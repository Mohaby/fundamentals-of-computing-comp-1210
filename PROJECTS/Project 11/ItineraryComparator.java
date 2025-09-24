/**. 
 *
 * Project 11
 * @author Mohab Yousef
 * @version 11/29/2021
 */



import java.util.Comparator;


/**.
ItineraryComparator class implements the Comparator interface 
for AirTicket objects.
*/
public class ItineraryComparator implements Comparator<AirTicket> {

/**.
* compare method that defines the ordering from lowest to highest 
based on the toString() value of each ticket’s Itinerary
*@param t1 represent AirTicket 1
*@param t2 represent AirTicket 2
*@return Int indicating
*/

   public int compare(AirTicket t1, AirTicket t2) {
      return ((t1.getItinerary().toString()).
         compareTo(t2.getItinerary().toString()));
       
   }
}

