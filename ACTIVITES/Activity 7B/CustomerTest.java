/**.
 * ACTIVITY 7B
 * @author Mohab Yousef
 * @version 10/20/2021
 */




import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**.
*Test Customer Test
*/

public class CustomerTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
/**. 
*TestSetLocation1
*/
   @Test public void setLocationTest1() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Boston, MA");
      Assert.assertEquals("Boston, MA", cstmr.getLocation());
   }
/**. 
*TestSetLocation2
*/

   @Test public void setLocationTest2() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Atlanta", "GA");
      Assert.assertEquals("Atlanta, GA", cstmr.getLocation());
   }

/**. 
*TestchangeBalance
*/
   @Test public void changeBalanceTest() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Auburn, AL");
      cstmr.changeBalance(100);
      Assert.assertEquals(100, cstmr.getBalance(), 0.000001);
   }
    

/**. 
*TesttoString
*/
   @Test public void  toStringTest() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Auburn, AL");
      cstmr.changeBalance(999);
      Assert.assertEquals("Lane, Jane\nAuburn, AL\n$999.0", cstmr.toString());
   }
        

/**. 
*TestCompareTo1
*/
   @Test public void compareToTest1() {
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(500);
        
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500);
       
      Assert.assertTrue(cstmr1.compareTo(cstmr2) == 0);
   }
    
    /**. 
*TestCompareTo2
*/
   @Test public void compareToTest2() {
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(100);
        
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500);
        
      Assert.assertTrue(cstmr1.compareTo(cstmr2) < 0);
   }
  /**. 
*TestCompareTo3
*/
   @Test public void compareToTest3() {
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(1000);
        
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500);
        
      Assert.assertTrue(cstmr1.compareTo(cstmr2) > 0);
   }




}



 

