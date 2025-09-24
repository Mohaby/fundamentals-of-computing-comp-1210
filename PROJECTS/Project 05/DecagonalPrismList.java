/**. 
 *
 * Project 05
 * @author Mohab Yousef
 * @version 09/26/2021
 */

import java.util.ArrayList; 
import java.text.DecimalFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**.
*program that shows the mesurments for decagonal prism.
*/
public class DecagonalPrismList {
 
 //Instance variables
   private String listName;
   private ArrayList<DecagonalPrism>dList;
   
  
/**.
*@param listNameIn for list name
*@param dListIn for listIn
*/

   public DecagonalPrismList(String listNameIn,
      ArrayList<DecagonalPrism> dListIn) {
      listName = listNameIn;
      dList = new ArrayList<DecagonalPrism>();
      for (DecagonalPrism d : dListIn) {
         dList.add(d);
      
      }
   
   }
   
    /**.
  *@return listName
  */

   public String getName() {
      return listName;
   }

 /**.
  *@return dList.size
  */

   public int numberOfDecagonalPrisms() {
      return dList.size();
   
   }
     
      /**.
  *@return total surface area
  */

   public double totalSurfaceArea() {
      double total = 0;
      for (DecagonalPrism d : dList) {
         if (d != null) {
            total += (d.surfaceArea());
         }
      }
      return total;
   }
   
  /**.
  *@return total base area
  */

   
   public double totalBaseArea() {
      double total = 0;
      for (DecagonalPrism d : dList) {
         if (d != null) {
            total += (d.baseArea());
         }
      }
      return total;
   }
   
   
  /**.
  *@return total lateral surface area
  */


   public double totalLateralSurfaceArea() {
      double total = 0;
      for (DecagonalPrism d : dList) {
         if (d != null) {
            total  += (d.lateralSurfaceArea());
         }
      }
      return total;
   }
   
   /**.
  *@return total volume 
  */

   public double totalVolume() {
      double total = 0;
      for (DecagonalPrism d : dList) {
         if (d != null) {
            total += (d.volume());
         }
      }
      return total;
   }
   
  /**.
  *@return averag surface area 
  */

   
   public double averageSurfaceArea() {
      if (numberOfDecagonalPrisms() == 0) {
         return 0;
      }
      else {
         return totalSurfaceArea() / numberOfDecagonalPrisms();
      }
   }
   /**.
  *@return average volume
  */

   public double averageVolume() {
      if (numberOfDecagonalPrisms() == 0) {
         return 0;
      }
      else {
         return totalVolume() / numberOfDecagonalPrisms();
      }
   }
  
  /**.
  *@return results
  */

  
   public String toString() {
      String result = listName + "\n";
      int index = 0;
      while (index < dList.size()) {
         result += "\n" + dList.get(index) + "\n";
         index++;
      }
      return result;
   }
  
  
  /**.
  *@return output
  */

   public String summaryInfo() {
   
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "";
      output += "\n\n----- Summary for " + getName() + "-----";
      output += "\nNumber of Decagonal Prisms: " + numberOfDecagonalPrisms();
      output += "\nTotal Surface Area: " + df.format(totalSurfaceArea());
      output += "\nTotal Base Area: " + df.format(totalBaseArea());
      output += "\nTotal Lateral Surface Area: " 
         + df.format(totalLateralSurfaceArea());
      output += "\nTotal Volume: " + df.format(totalVolume());
      output += "\nAverage Surface Area: " + df.format(averageSurfaceArea());
      output += "\nAverage Volume: " + df.format(averageVolume());
      return output;
   }
   
   
   
   /**
   @return List
   */
   
   public ArrayList<DecagonalPrism>getList() {
      return dList;
   
   }
   /**
   *a String parameter representing the file name, reads in the file,
    storing the list name and creating an ArrayList of DecagonalPrism objects,
    uses the listname and the ArrayList to create a DecagonalPrismList object,
    and then returns the DecagonalPrismList object.
    *
    */
    
   public DecagonalPrism readFile(String fileNameIn) 
                                             throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileNameIn));
   
      ArrayList<DecagonalPrism>myNewList = new ArrayList<DecagonalPrism>();
    
      String dListName = "";
   
      String label = "";
      double edge;
      double height;
    
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         edge = Double.parseDouble(scanFile.nextLine());
         height = Double.parseDouble(scanFile.nextLine());
         DecagonalPrism d = new DecagonalPrism(label, edge, height);
         myNewList.add(d);
      
      }
      DecagonalPrismList dP = new DecagonalPrismList(listName, myNewList);
      return myNewlist;
   }
   
  
  /**
  *
  */
   
   public void addDecagonalPrism(String labelIn, double edgeIn, double heightIn) {
      DecagonalPrism d = new DecagonalPrism(labelIn, edgeIn, heightIn);
      dList.add(d);
   
   }
   
   public boolean findDecagonalPrism(String labelIn) {
      return false;
   }
   
   public  DecagonalPrism deleteDecagonalPrism(String labelIn) {
      int inedx = 0;
      for (DecagonalPrism d: dList) {
         if (labelIn.equalsIgnoreCase(d.getLabel())){
            dList.remove(findDecagonalPrism(labelIn));
            return d;
         }
      
         return null;
      
      }
      
   
   
   
   
   
      return null;
   }
   

}
   
