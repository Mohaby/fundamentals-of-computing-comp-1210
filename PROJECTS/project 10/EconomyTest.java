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

/**. Test Economy class. */
public class EconomyTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**. test total fare. */
   @Test public void testsTotalFare() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      Economy e = new Economy("DL 1860", trip, 450, 1.0);
      Assert.assertEquals(450, e.totalFare(), 0);
   }
      
      
     /**. test totalAwardMiles. */
   @Test public void testTotalAwardMiles() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      Economy e = new Economy("DL 1860", trip, 450, 1.0);
      Assert.assertEquals(1200, e.totalAwardMiles());
   }
      
      
      
      /**. test toString. */
   @Test public void testToString() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      Economy e = new Economy("DL 1860", trip, 450, 1.0);
      Assert.assertTrue(e.toString().contains("Includes Award Miles Factor"));
   }   
      
      
}
