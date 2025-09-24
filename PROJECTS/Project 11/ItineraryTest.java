/**. 
 *
 * Project 11
 * @author Mohab Yousef
 * @version 11/29/2021
 */




import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**. Itinerary class test */
public class ItineraryTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Test getFromAirport. **/
   @Test public void testGetFromAirport() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);

      Assert.assertEquals("ATL", trip.getFromAirport());
   }
   
   
   
   
   /** Test getToAirport. **/
   @Test public void testGetToAirport() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);

      Assert.assertEquals("LGA", trip.getToAirport());
   }
   
   
    /** Test getToAirport. **/
   @Test public void testGetAriDateTime() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);

      Assert.assertEquals("2021/11/21 1640", trip.getAriDateTime());
   }
   
   
    /** Test getDepDateTime. **/
   @Test public void testGetDepDateTime() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);

      Assert.assertEquals("2021/11/21 1400", trip.getDepDateTime());
   }
   
   /** Test getMiles. **/
   @Test public void testGetMiles() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);

      Assert.assertEquals(800, trip.getMiles());
   }
   
    
   /** Test toString. **/
   @Test public void testToString() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);

      Assert.assertTrue(trip.toString().contains("miles"));
   
   
   }
}

   

