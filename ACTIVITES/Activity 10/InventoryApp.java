/**. 
 *
 * Activity 10
 * @author Mohab Yousef
 * @version 11/09/2021
 */




/**.
* InventoryApp
*/
public class InventoryApp {

/**.
*@param args for args not used.
*/
   public static void main(String[] args) {
   
      InventoryItem.setTaxRate(0.05);
  
      InventoryItem item1 = new InventoryItem("Oil change kit", 39.00);
      
      ElectronicsItem item2 = new ElectronicsItem("Cordless phone", 80.00, 1.8);
      
      OnlineArticle item3 = new OnlineArticle("Java News", 8.50);
      
      OnlineBook item4 = new OnlineBook("Java for Noobs", 13.37);
     
      
   }
}