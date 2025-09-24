/**. 
 *
 * Project 7B
 * @author Mohab Yousef
 * @version 10/21/2021
 */


import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**.
*Program that TestTriangularPrism
*/

public class TriangularPrismTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   
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
      Assert.assertEquals(13, t.surfaceArea(), a); 
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
   
   
  
   /**. test resetCount .**/
   @Test public void testresetCount() {
      TriangularPrism t = new TriangularPrism("Small Example", 1.8, 3.25);
      t.resetCount();
      Assert.assertEquals(0, t.getCount());
    
    
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
      TriangularPrism t = new TriangularPrism("Small Example", 127, 3.25);
      Object obj = new Object();
      Assert.assertEquals(false, t.equals(obj));
   }
    /**. test Equals.**/
   @Test public void testEqualsss() {
      TriangularPrism t = new TriangularPrism("Large Example", -123, 105.0);
      String obj = "LARGE";
      Assert.assertEquals(false, t.equals(obj));
   }
   
   /**.
     * test equal 
     */

   @Test
   public void equalObjFalseTest() {
      TriangularPrism t = new TriangularPrism("Small Example", 1.8, 3.25);
      String object = "Small Exmaple";
      Assert.assertFalse("Small Example", 
         t.equals(object));
   }
   
   /**.
     *test equalsTest()
     */
   @Test
     public void equalsTTTTest() {
      TriangularPrism t = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrism labelIn = new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertTrue("Small Example", t.equals(labelIn));
      TriangularPrism edgeIn = new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertTrue("Small Example", t.equals(edgeIn));
      TriangularPrism heightIn 
         = new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertTrue("Small Example", t.equals(heightIn));

   }
   
   /**.
     *test equalsTest()
     */
   @Test
     public void equalsTTtTest() {
      TriangularPrism t = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrism labelIn = new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertTrue("Small Example", t.equals(labelIn));
      TriangularPrism edgeIn = new TriangularPrism("Small Example", 34, 3.25);
      Assert.assertFalse("Small Example", t.equals(edgeIn));
      TriangularPrism heightIn 
         = new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertTrue("Small Example", t.equals(heightIn));

   }
   
   /**.
     *test equalsTest()
     */
   @Test
     public void equalsmTest() {
      TriangularPrism t = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrism labelIn = new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertTrue("Small Example", t.equals(labelIn));
      TriangularPrism edgeIn = new TriangularPrism("Small Example", 34, 3.25);
      Assert.assertFalse("Small Example", t.equals(edgeIn));
      TriangularPrism heightIn 
         = new TriangularPrism("Small Example", 1.8, 45);
      Assert.assertFalse("Small Example", t.equals(heightIn));

   }
   
   /**.
     *test equalsTest()
     */
   @Test
     public void equalsTtTTest() {
      TriangularPrism t = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrism labelIn = new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertTrue("Small Example", t.equals(labelIn));
      TriangularPrism edgeIn = new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertTrue("Small Example", t.equals(edgeIn));
      TriangularPrism heightIn 
         = new TriangularPrism("Small Example", 1.8, 92.3);
      Assert.assertFalse("Small Example", t.equals(heightIn));

   }
   
   
   /**.
     *test equalsTest()
     */
   @Test
     public void equalsTttTTest() {
      TriangularPrism t = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrism labelIn = new TriangularPrism("Example", 1.8, 3.25);
      Assert.assertFalse("Example", t.equals(labelIn));
      TriangularPrism edgeIn = new TriangularPrism("Small Example", 2.8, 87);
      Assert.assertFalse("Small Example", t.equals(edgeIn));
      TriangularPrism heightIn 
         = new TriangularPrism("Small Example", 13.8, 92.3);
      Assert.assertFalse("Small Example", t.equals(heightIn));

   }




   
   /**.
     *test equalsTest()
     */
   @Test
     public void equalsFXXTest() {
      TriangularPrism t = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrism labelIn = new TriangularPrism("Example", 1.8, 3.25);
      Assert.assertFalse("Example", t.equals(labelIn));
      TriangularPrism edgeIn = new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertTrue("Small Example", t.equals(edgeIn));
      TriangularPrism heightIn 
         = new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertTrue("Small Example", t.equals(heightIn));

   }


     /**.
     *test equalsTest()
     */
   @Test
     public void equalsTFXTest() {
      TriangularPrism t = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrism labelIn = new TriangularPrism("small Example", 1.8, 3.25);
      Assert.assertTrue("small Example", t.equals(labelIn));
      TriangularPrism edgeIn = new TriangularPrism("Example", 1.8, 3.25);
      Assert.assertFalse("Example", t.equals(edgeIn));
      TriangularPrism heightIn 
         = new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertTrue("Small Example", t.equals(heightIn));

   }
   
   
   
     /**.
     *test equalsTest()
     */
   @Test
     public void equalsTTFTest() {
      TriangularPrism t = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrism labelIn = new TriangularPrism("small Example", 1.8, 3.25);
      Assert.assertTrue("small Example", t.equals(labelIn));
      TriangularPrism edgeIn = new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertTrue("Small Example", t.equals(edgeIn));
      TriangularPrism heightIn = new TriangularPrism("Example", 1.8, 3.25);
      Assert.assertFalse("Example", t.equals(heightIn));

   }


  
   
   
   /**.
     * tests CompareTo
     */  
   @Test
     public void compareToTest1() {
      TriangularPrism t1 = new TriangularPrism("Small Exmaple", 1.8, 3.25);
      t1.volume();
      TriangularPrism t2 = new TriangularPrism("Large Exmalpe", 0.5, 3.1);
      t2.volume();
      Assert.assertTrue(t1.compareTo(t2) > 0);
   }
   /**.
     * test CompareTo
     */  
   @Test
     public void compareToTest2() {
      TriangularPrism t1 = new TriangularPrism("Small Example", 1.8, 3.25);
      t1.volume();
      
      TriangularPrism t2 = new TriangularPrism("Large Exmaple", 45.47, 105.0);
      t2.volume();
      Assert.assertTrue(t1.compareTo(t2) < 0);   
   }
   
    /**.
     * test CompareTo
     */  
   @Test
     public void compareToTest3() {
      TriangularPrism t1 = new TriangularPrism("Small Exmaple", 1.8, 3.25);
      t1.volume();
      TriangularPrism t2 = new TriangularPrism("Large Exmaple", 1.8, 3.25);
      t2.volume();
      Assert.assertTrue(t1.compareTo(t2) == 0);   
      
   }   
   


}
