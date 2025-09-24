/**. 
 *
 * Activity 8
 * @author Mohab Yousef
 * @version 11/03/2021
 */




/**.
*OnlineArticle that keeps track of word count in addition to everything that is done by OnlineTextItem and InventoryItem
*/


public class OnlineArticle extends OnlineTextItem {

//Instance Variable
   private int wordCount;
/**.
*Constructor
*@param nameIn for name
*@param priceIn for price
*/
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
/**.
* @param wordCountIn for wordCounr
* @return wordCount
*/
   public int setWordCount(int wordCountIn) {
      return wordCountIn;
   }
}