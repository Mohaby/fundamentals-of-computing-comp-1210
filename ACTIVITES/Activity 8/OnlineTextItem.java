/**. 
 *
 * Activity 8
 * @author Mohab Yousef
 * @version 11/03/2021
 */



/**.
*OnlineTextItem that represent an online text item that users can buy
*/
 

public abstract class OnlineTextItem extends InventoryItem {
/**.
*Constructor
@param nameIn for name
* @param priceIn for price
*/
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
/**.
*Methdos
*@return price
*/
   public double calculateCost() {
      return price;
   }
}