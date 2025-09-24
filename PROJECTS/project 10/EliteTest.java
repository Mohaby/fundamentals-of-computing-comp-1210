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

/**. Test Elite class. */
public class EliteTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**.  test total fare */
   @Test public void testTotalFare() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      Elite be = new Elite("DL 1860", trip, 450, 2.5, 50.0, 50.00, 100.00);
      Assert.assertEquals(1325.00, be.totalFare(), 0);
   }
   
   /**.  test total fare */
   @Test public void testToString() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      Elite be = new Elite("DL 1860", trip, 450, 2.5, 50.0, 50.00, 100.00);
      Assert.assertTrue(be.toString().contains("Comm Services"));
   }
   

}
