/**. 
 *
 * Project 10
 * @author Mohab Yousef
 * @version 11/10/2021
 */


import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**. Test Business class. */

public class BusinessTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**.  test total fare */
   @Test public void testTotalFare() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      Business b = new Business("DL 1860", trip, 450, 2.0, 50.0, 50.00);
      Assert.assertEquals(1000.00, b.totalFare(), 0);
   }
   
    /**.  test total Award Miles */
   @Test public void testTotalAwardMiles() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      Business b = new Business("DL 1860", trip, 450, 2.0, 50.0, 50.00);
      Assert.assertEquals(1600, b.totalAwardMiles());
   }
   
    /**.  test toString */
   @Test public void testToString() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      Business b = new Business("DL 1860", trip, 450, 2.0, 50.0, 50.00);
      Assert.assertTrue(b.toString().contains("Entertainment"));
   }


}
