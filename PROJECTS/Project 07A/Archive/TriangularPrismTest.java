/**. 
 *
 * Project 7A
 * @author Mohab Yousef
 * @version 10/12/2021
 */



import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**.
*program that tsetTriagularPrism
*/

public class TriangularPrismTest {


   /**. Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**.  test getLabel. **/
   @Test public void testGetLabel() {
      TriangularPrism t = new TriangularPrism("Medium Example", 10.7, 25.4);
      Assert.assertEquals("Medium Example", t.getLabel());
        
   }
   /**. testgetEdge. **/   
   @Test public void testGetEdge() {
      TriangularPrism t = new TriangularPrism("Medium Example", 10.7, 25.4);
      Assert.assertEquals(10.7, t.getEdge(), 12.8);
   }  
  /**. test Set edge. **/
   @Test public void testsetEdge() {
      TriangularPrism t = new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertEquals(false, t.setEdge(-5));

   }
   
   
   /**. test set height. **/
   @Test public void testGetHeight() {
      TriangularPrism t = new TriangularPrism("Medium Example", 10.7, 25.4);
      Assert.assertEquals(13.8, t.getHeight(), 12.8);
      
   }  
 
      
      
   /**. test setEdge .**/ 
   @Test public void testSetEdge() {
      TriangularPrism t = new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertEquals(true, t.setEdge(1.8));

   }
   /**. test setlabel.**/
   @Test public void testSetLabel() {
      TriangularPrism t = new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertEquals(false, t.setLabel(null));
   
   }
   /**. test setHeight.**/
   @Test public void testSetHeight() {
      TriangularPrism t = new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertEquals(false, t.setHeight(-5));
   
   }
    /**. test TriangleArea.**/
   @Test public void testTriangleArea() {
      TriangularPrism t = new TriangularPrism("Small Example", 1.8, 3.25);
      double ta =  0.25 * Math.sqrt(3 * Math.pow(1.8, 4));
      Assert.assertEquals(ta, t.triangleArea(), 17); 
   }
   
   /**. test RectangleArea.**/
   @Test public void testRectangleArea() {
      TriangularPrism t = new TriangularPrism("Medium Example", 10.7, 25.4);
      double ar = (10.7 * 25.4);
      Assert.assertEquals(12, t.rectangleArea(), 271.78); 
    
   }
    /**. test surfaceArea.**/
   @Test public void testSurfaceArea() {
      TriangularPrism t = new TriangularPrism("Large Example", 45.47, 105.0);
      double a = ((2 * (0.25 * Math.sqrt(3 * Math.pow(45.47, 4)))) 
         + (3 * (45.47 * 105.0)));
      Assert.assertEquals(a, t.surfaceArea(), 13); 
   }
   
   /**. test Volume.**/
   @Test public void testVolume() {
      TriangularPrism t = new TriangularPrism("Small Example", 1.8, 3.25);
      double v =  0.25 * Math.sqrt(3 * Math.pow(1.8, 4));
      Assert.assertEquals(1.2, t.volume(), 4.56); 
    
    
   }
   /**. test toString.**/
   @Test public void testToString() {
      TriangularPrism t = new TriangularPrism("Medium Example", 10.7, 25.4);
      Assert.assertTrue(t.toString().contains("\"Medium Example\"")); 
   }
   
   /**. test getCount .**/
   @Test public void testGetCount() {
      TriangularPrism t = new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertEquals(0, t.getCount(), 15);
    
    
   }
  
   /**. test resetCount .**/
   @Test public void testresetCount() {
      TriangularPrism t = new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertEquals(8, t.getCount(), 9);
    
    
   }

   
   
   
   /**. test HashCode.**/
   @Test public void testHashCode() {
      TriangularPrism t = new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertEquals(0, t.hashCode(), 13);
   }

    /**. test Equals.**/
   @Test public void testEquals() {
      TriangularPrism t = new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertEquals(false, t.equals(12));
   }
   
   
 
    /**. test Equals.**/
   @Test public void testequals() {
      TriangularPrism t = new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertEquals(true, t.equals(t));
   }

   
    /**. test Equals.**/
   @Test public void tessTEquals() {
      TriangularPrism t = new TriangularPrism("Medium Example", 10.7, 25.4);
      Assert.assertEquals(false, t.equals(-4));
   }
   
   /**. test Equals. **/
   @Test public void testEqualss() {
      TriangularPrism t = new TriangularPrism("Small Example", 1.8, 3.25);
      Object obj = new Object();
      Assert.assertEquals(false, t.equals(obj));
   }
    /**. test Equals.**/
   @Test public void testEqualsss() {
      TriangularPrism t = new TriangularPrism("Large Example", 45.47, 105.0);
      Assert.assertEquals(false, t.equals("LARGE"));
   }

}