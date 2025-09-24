/**. 
 *
 * Activity 10
 * @author Mohab Yousef
 * @version 11/09/2021
 */


/**.
* InventoryListApp
*/
public class InventoryListApp {

/**.
*@param args for args not used.
*instantiate a ItemsList object called myItems
*set the tax rate to 0.05 
*/
   public static void main(String[] args) {
      ItemsList myItems = new ItemsList();
      InventoryItem.setTaxRate(0.05);
  
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      System.out.println(myItems.toString());
      System.out.println("Total: " + myItems.calculateTotal(2.0));
   }
}