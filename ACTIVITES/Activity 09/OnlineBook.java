/**.
 *
 * Activity 8
 * @author Mohab Yousef
 * @version 11/03/2021
 */



/**.
*OnlineBook which will inherit from OnlineTextItem
*/
 
public class OnlineBook extends OnlineTextItem {
  
// Instance Variable  
   protected String author;

/**.
*Constructor
*@param nameIn for name
*@param priceIn for price
*/
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      
      author = "Author Not Listed";
   }
/**.
*@return string
*/
   @Override
   public String toString() {
      return name + " - " + author + ": $" + calculateCost();
   }
/**.
*@param authorIn for author
*/
   public void setAuthor(String authorIn) {
      author = authorIn;
   }
}