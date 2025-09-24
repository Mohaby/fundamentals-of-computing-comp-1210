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

/**. NonRefundable class test */
public class NonRefundableTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**. test getDiscountFactor */
   @Test public void testGetDiscountFactor() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      NonRefundable nr = new NonRefundable("DL 1860", trip, 450, 0.45, 0.90);
      Assert.assertEquals(0.90, nr.getDiscountFactor(), 0.01);
      
   }
   
   
   /**. test totalFare */
   
   @Test public void testTotalFare() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      NonRefundable nr = new NonRefundable("DL 1860", trip, 450, 0.45, 0.90);
      Assert.assertEquals(450, nr.totalFare(), 450);
        
   }

 /**. test totalAwardMiles */
   
   @Test public void testTotalAwardMiles() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      NonRefundable nr = new NonRefundable("DL 1860", trip, 450, 0.45, 0.90);
      Assert.assertEquals(800, nr.totalAwardMiles());
      
   }
    
    /**. test toString */
   
   @Test public void testToString() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      NonRefundable nr = new NonRefundable("DL 1860", trip, 450, 0.45, 0.90);
      Assert.assertTrue(nr.toString().contains("Includes DiscountFactor"));
   
      
   }
}  