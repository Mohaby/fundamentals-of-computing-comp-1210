/**.
 * ACTIVITY 7B
 * @author Mohab Yousef
 * @version 10/20/2021
 */


/**.
*program that shows customer name, location, and balance.
*/

public class Customer implements Comparable<Customer>  {
    
    
// instance variables

   private String name;
   private String location;
   private double balance;

//constructor 
/**.
@param nameIn for name
*/

   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }

/**.
*@return variable for location
*/

   public String getLocation() {
      return location;
   }



/**.
*Sets location variable
*@param locationIn for location
*/
   public void setLocation(String locationIn) {
      location = locationIn;
   }

/**.
@param amount to add amount to balance
*/
   public void changeBalance(double amount) {
      balance += amount;
   }


/**.
*@return variable for balance
*/

   public double getBalance() {
      return balance;
   }

/**.
*return city and state
*@param city for city
*@param state for state
*/

   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }
   
   
   @Override
   public String toString() {
      return name + "\n" + location + "\n$" + balance;
   }

   @Override
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < 0.0000001) {
         return 0;
      }
      else if (this.balance < obj.getBalance()) {
         return -1;
      } else 
      {
         return 1;
      }
   }


}