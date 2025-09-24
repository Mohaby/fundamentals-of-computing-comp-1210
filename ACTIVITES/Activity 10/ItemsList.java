/**. 
 *
 * Activity 10
 * @author Mohab Yousef
 * @version 11/09/2021
 */


/**.
* ItemList hold an array of InventoryItem objects
*/


public class ItemsList {

//Instance Variable

   private InventoryItem[] inventory;
   private int count;

/** .
*Constructor for ItemsList that has no parameters
*/
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }

//Methods
/**.
*addItem with parameter InventoryItem itemIn and has no return.
*@param itemIn for item
*/
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
/**.
*calculateTotal with parameter double electronicsSurcharg and has double return.
*@param electronicsSurcharge for electronicsSurcharge
*@return the calculateTotal
*/
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else {
            total += inventory[i].calculateCost();
         }
      }
      return total;
   }
/**.
*to String that iterate through inventory from 0 up to count
to append toString
* @return output
*/
   public String toString() {
      String output = "All inventory:\n\n";
  
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
  
      return output;
   }
}