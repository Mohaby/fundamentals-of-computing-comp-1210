/**. 
 *
 * Activity 8
 * @author Mohab Yousef
 * @version 11/03/2021
 */


/**.
* InventoryItem that represents an inventory item in a store.
*/


public class InventoryItem {

/**. 
*Instance variable.
*/
   protected String name;
   protected double price;
   private static double taxRate = 0;

/**.
*Constructor
* @param nameIn for name
* @param priceIn for price
*/
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }

/**.
*Methods
*@return name
*/
   public String getName() {
      return name;
   }
/**.
*@return the total 
*/
   public double calculateCost() {
      return price * (1 + taxRate);
   }
/**.
*@param taxRateIn for taxRate
*/
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
/**.
*@return a string representation with name and price with tax
*/
   public String toString() {
      return name + ": $" + calculateCost();
   }
}