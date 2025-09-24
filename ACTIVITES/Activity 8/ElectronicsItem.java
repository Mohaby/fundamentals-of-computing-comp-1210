/**. 
 *
 * Activity 8
 * @author Mohab Yousef
 * @version 11/03/2021
 */




/**.
*ElectronicsItem that inherits from InventoryItem.
*/
public class ElectronicsItem extends InventoryItem {

   protected double weight;
  /**. 
  *Instance Variable
  */

   public static final double SHIPPING_COST = 1.5;
/**
* Contructor.
*
* @param nameIn for name
* @param priceIn for price
* @param weightIn for weight
   */
      
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }
/**.
*calculate the cost
*@return the total cost
*/
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}