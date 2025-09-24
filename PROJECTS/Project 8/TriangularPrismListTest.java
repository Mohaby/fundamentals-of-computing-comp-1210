/**. 
 *
 * Project 8
 * @author Mohab Yousef
 * @version 10/28/2021
 */


import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**. TriangularPrismListTest */

public class TriangularPrismListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   
/**. Test getNaem */

   @Test public void getNameTest() {

      TriangularPrism[] t = new TriangularPrism[3];
      t[0] =  new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrismList m = new TriangularPrismList("Small", t, 1);
 
      Assert.assertEquals("Small", m.getName());
   }


/**. Test numberOfTRiangularPrisms */

   @Test public void numberOftriangularPrismsTest() {

      TriangularPrism[] t = new TriangularPrism[3];
      t[0] =  new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrismList m = new TriangularPrismList("Small", t, 1);
 
      Assert.assertEquals(1, m.numberOfTriangularPrisms());
   }
 
/**. Test Volume */

   @Test public void totalVolume() {

      TriangularPrism[] t = new TriangularPrism[3];
      t[0] =  new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrismList m = new TriangularPrismList("Small", t, 1);
 
      Assert.assertEquals(4.5596, m.totalVolume(), .0001);
   }






/**. Test totalSurfaceArea */

   @Test public void testtotalSurfaceArea() {

      TriangularPrism[] t = new TriangularPrism[3];
      t[0] =  new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrismList m = new TriangularPrismList("Small", t, 1);
      
      Assert.assertEquals(20.3559, m.totalSurfaceArea(), 0.0001);
   }


/**. Test totalSurfaceArea */

   @Test public void testaverageSurfaceArea() {

      TriangularPrism[] t = new TriangularPrism[3];
      t[0] =  new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrismList m = new TriangularPrismList("Small", t, 1);
 
      Assert.assertEquals(20.3559, m.averageSurfaceArea(), 0.001);
   }

/**. Test AverageVolume */

   @Test public void testAverageVolume() {

      TriangularPrism[] t = new TriangularPrism[3];
      t[0] =  new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrismList m = new TriangularPrismList("Small", t, 1);
 
      Assert.assertEquals(4.5596, m.averageVolume(), 0.0001);
   }

/**. Test toString */

   @Test public void testtoString() {

      TriangularPrism[] t = new TriangularPrism[3];
      t[0] =  new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrismList m = new TriangularPrismList("Small", t, 1);
 
      Assert.assertTrue(
         m.toString().contains("Number of TriangularPrisms: 1.0"));
   }



/**. Test getList */

   @Test public void testgetList() {

      TriangularPrism[] t = new TriangularPrism[3];
      t[0] =  new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrismList m = new TriangularPrismList("Small", t, 1);
 
      Assert.assertArrayEquals("Small", t, m.getList());
   }

/**. Test addTriangularPrism */

   @Test public void testaddTriangularPrism() {

      TriangularPrism[] t = new TriangularPrism[3];
      t[0] =  new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrismList m = new TriangularPrismList("Small", t, 1);
      
      TriangularPrism t1 = new TriangularPrism("Medium Example", 10.7, 45.7);
      m.addTriangularPrism("Medium Example", 10.7, 45.7);
      TriangularPrism[] p = m.getList();
 
      Assert.assertEquals(t1, p[1]);
   }
   
   /**. Test deleteTriangularPrism */

   @Test public void testdeleteTriangularPrism() {

      TriangularPrism[] t = new TriangularPrism[3];
      t[0] =  new TriangularPrism("Small Example", 1.8, 3.25);
      t[1] = new TriangularPrism("Meduim Example", 10.7, 45.7);
      t[2] = new TriangularPrism("Large Exmaple", 45.7, 105.7);
      TriangularPrism t1 = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrism t2 = new TriangularPrism("Medium Example", 10.7, 45.7);
      TriangularPrism t3 = new TriangularPrism("Large Example", 45.7, 105.7);
      TriangularPrism[] r = {t1, t2, t3};

      TriangularPrismList m = new TriangularPrismList("Small", r, 3); 
      
      
      
      Assert.assertEquals(null, m.deleteTriangularPrism("false"));
      Assert.assertEquals(t1, m.deleteTriangularPrism("Small Example"));
      Assert.assertEquals(t2, m.deleteTriangularPrism("Medium Example"));
      Assert.assertEquals(t3, m.deleteTriangularPrism("Large Example"));
   }
   
   
   


/**. Test find TriangularPrism */

   @Test public void findTriangularPrism() {
      TriangularPrism[] t = new TriangularPrism[3];
      t[0] = new TriangularPrism("Small Example", 1.8, 3.25);
      t[1] = new TriangularPrism("Medium Example", 10.7, 45.7);
      t[2] = new TriangularPrism("Large Example", 45.7, 105.7);
         
      TriangularPrismList m = new TriangularPrismList("small", t, 1);
      TriangularPrism t1 = new TriangularPrism("Small Example", 1.8, 3.25);
         
      Assert.assertEquals(t1, m.findTriangularPrism("Small Example"));
      Assert.assertEquals(
         "Medium Example", null, m.findTriangularPrism("Medium"));
                              
      
      
   }
   
   
   


/**. Test editTrainglePrism */
   @Test public void editTriangularPrism() {
      TriangularPrism[] t = new TriangularPrism[3];
      t[0] = new TriangularPrism("Small Example", 1.8, 3.25);
      t[1] = new TriangularPrism("Medium Example", 10.7, 45.7);
      t[2] = new TriangularPrism("Large Example", 45.7, 105.7);
       
      TriangularPrismList m = new TriangularPrismList("small", t, 1);
      TriangularPrism t1 = 
         new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrism[] r = m.getList();
         
      Assert.assertEquals("Small", t1, r[0]);   
      Assert.assertEquals(true,
          m.editTriangularPrism("Small Example", 1.8, 3.25));
      Assert.assertEquals(
         "Medium", false, m.editTriangularPrism("Medium Example", 10.7, 45.7));
                              
      
      
   }
   
/**. Test findTriangularPrismWithLargestVolume */

   @Test public void testfindTriangularPrismWithLargestVolume() {
      TriangularPrism[] t = new TriangularPrism[3];
      t[0] = new TriangularPrism("Small Example", 1.8, 3.25);
      t[1] = new TriangularPrism("Medium Example", 10.7, 45.7);
      t[2] = new TriangularPrism("Large Example", 45.7, 105.7);
    
      TriangularPrism t1 = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrism t2 = new TriangularPrism("Medium Example", 10.7, 45.7);
      TriangularPrism t3 = new TriangularPrism("Large Example", 46.7, 133.7);
      TriangularPrism[] r = {t1, t2, t3};
      TriangularPrismList m = new TriangularPrismList(
            "Small", r, 1);
          
      TriangularPrismList b = new TriangularPrismList(
            "Small", r, 2);
      TriangularPrismList c = new TriangularPrismList(
            "Small", r, 3);
      
      Assert.assertEquals(t1, m.findTriangularPrismWithLargestVolume()); 
      Assert.assertEquals(t2, b.findTriangularPrismWithLargestVolume()); 
      Assert.assertEquals(t3, c.findTriangularPrismWithLargestVolume()); 

   }
   /**. Test findLargestVolume */
   
   @Test public void testfinddTriangularPrismWithLargestVolume() {
      TriangularPrism[] t = new TriangularPrism[15];
      t[0] = new TriangularPrism("Small Example", 1.8, 3.25);
      t[1] = new TriangularPrism("Medium Example", 10.7, 45.7);
      t[2] = new TriangularPrism("Large Example", 45.7, 105.7);
    
      TriangularPrism t1 = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrism t2 = new TriangularPrism("Medium Example", 10.7, 45.7);
      TriangularPrism t3 = new TriangularPrism("Large Example", 46.7, 133.7);
      TriangularPrism[] r = {};
      TriangularPrismList m = new TriangularPrismList(
            "Small", r, 1);
          
      
      
      Assert.assertEquals(null, m.findTriangularPrismWithLargestVolume()); 
       
   }
   /**. Test findLargestVolume */
   
   @Test public void tesTfinddTriangularPrismWithLargestVolume() {
      TriangularPrism[] t = new TriangularPrism[15];
      t[0] = new TriangularPrism("Small Example", 1.8, 3.25);
      t[1] = new TriangularPrism("Medium Example", 10.7, 45.7);
      t[2] = new TriangularPrism("Large Example", 45.7, 105.7);
    
      TriangularPrism t1 = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrism t2 = new TriangularPrism("Medium Example", 10.7, 45.7);
      TriangularPrism t3 = new TriangularPrism("Large Example", 46.7, 133.7);
      TriangularPrism[] r = {t1, t2, t3};
      TriangularPrismList m = new TriangularPrismList(
            "Small", r, 0);
          
      
      
      Assert.assertEquals(null, m.findTriangularPrismWithLargestVolume()); 
       
   }


}

