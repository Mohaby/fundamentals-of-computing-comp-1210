/**. 
 *
 * Activtiy 04
 * @author Mohab Yousef
 * @version 09/15/2021
 */

public class UserInfo {
 
 //Instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age; 
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;
 
 //Constructor 
 /**.
  * @param firstNameIn  to set first name
  @param lastNameIn  to set last name
  */

   public UserInfo(String firstNameIn, String lastNameIn) {
  
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
  
   }
 
/**.
//methods
@return output
*/ 
  
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      return output;
   }
      
  /**.
  @param locationIn to set location 
  */   
   public void setLocation(String locationIn) {
      location = locationIn;
   }
     /**.
  @param ageIn to set age
  *@return isSer
  */   

   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
  /**.
  *@return age
  */   

   public int getAge() {
      return age;
   }
   /**.
  *@return location
  */  
   public String getLocation() {
      return location;
   }
   /**.
   *set status offline
   */
   public void logOff() {
      status = OFFLINE;
   }
   /**.
   *set status online
   */

   public void logOn() {
      status = ONLINE;
   }
}
   
