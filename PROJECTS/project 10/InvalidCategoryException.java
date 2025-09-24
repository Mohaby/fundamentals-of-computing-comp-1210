/**. 
 *
 * Project 11
 * @author Mohab Yousef
 * @version 11/29/2021
 */

/**.
* InvalidCategoryException for AirticketProcessor
*/

public class InvalidCategoryException extends Exception {


/**.
*@param category of AirticketProcessor 
*/

   public InvalidCategoryException(String category) {
      super("For category: " + "\"" + category + "\"");
   }
}