/**. 
 *
 * Activity 8
 * @author Mohab Yousef
 * @version 10/27/2021
 */
 
 


/**. Scores */

public class Scores {

// Isntance Variable

   private int [] numbers;
/**.
*Constructor that has a parameter declared as an array of int values
*@param numbersIn for number
*/

   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   }
 
 //methods
 
 /**.
 *@return all of the even avlued scores
 */
 
   public int[] findEvens() {
      int numberEvens = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      int[] evens = new int[numberEvens];
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
      
            evens[count] = numbers[i];
            count++;
         }
      }
      
      return evens;
   }
 
  /**.
 *@return all the odd values
 */
 
 
   public int[] findOdds() {
      int numberOdds = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (!(numbers[i] % 2 == 0)) {
            numberOdds++;
         }
      } 
      int[] odds = new int[numberOdds];
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (!(numbers[i] % 2 == 0)) {
               
            odds[count] = numbers[i];
            count++;
         }
      }
      
      return odds;
   }
  
 
 
 /**.
 *@return the average of all scores
 */
 
   public double calculateAverage() {
      int sum = 0;
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
 
      }
      return (double) sum / numbers.length;
   }
 /**.
 *@return all scores
 */
   public String toString() {
      String result = "";
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
      return result;
 
   }
 
 /**.
 *@return all scores in reverse oreder
 */
 
   public String toStringInReverse() {
      String result = "";
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers[i] + "\t";
      }
 
 
      return result;
   }
}