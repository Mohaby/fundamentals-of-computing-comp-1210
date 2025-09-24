 /**
  * Activity 05.
  * @ Mohab Yousef
  * @ 09/22/2021
  */

public class NumberOperations {
   private int number;
   /**.
   *
   * @param numberIn
   //Constructor
   */
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
    /**.
    //get
     @return number 
    */
   public int getValue() {
      return number;
   
   }

    /**.
     * @return numbers 
     * 
     */
   public String oddsUnder()
   {
      String output = "";
      int i = 0;
      while (i < number)
      { 
         if  (i % 2 != 0)
            output +=  i + "\t";
         i++; 
      }
      
      return output;
   }

    /**.
     * @return all numbers 
     * 
     */
   public String powersTwoUnder()
   {
      int powers = 1;
      String output = "";
      while (powers < number)
      {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }

    /**.
     * @param compareNumber to compare number
     * @return 1 if number is greater than compareNumber
     * return -1 if number is less than compareNumber
     * return 0 if number is equal to compareNumber
     */
   public int isGreater(int compareNumber)
   {
      if (number > compareNumber)
         return 1;
      else if (number < compareNumber)
         return -1;
      else
         return 0;
   }

   @Override
    public String toString() {
      return number + " ";
   }
}