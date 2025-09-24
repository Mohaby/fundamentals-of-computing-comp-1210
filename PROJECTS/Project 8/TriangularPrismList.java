/**. 
 *
 * Project 8
 * @author Mohab Yousef
 * @version 10/28/2021
 */
 
import java.text.DecimalFormat;


/**. TriangularPrismList */

public class TriangularPrismList {

// Isntance Variable

   private String listName = "";
   private TriangularPrism[] objList;
   private int arraySize;

//Constructor

/**.
*@param listNameIn represnt listName of type String
*@param objListIn represnt objList of type TriangularPrism
*@param arraySizeIn represnt arraySize of type int
*/
   public TriangularPrismList(String listNameIn, 
       TriangularPrism[] objListIn, int arraySizeIn) {
      listName = listNameIn;
      objList = objListIn;
      arraySize = arraySizeIn;
   }
      

//Methods

/**.
*@return a String representing the name of the list.
*/
   public String getName() {
      return listName;
   }
   
/**.
*@return an int representing 
the number of TriangularPrism objects.
*/

   public int numberOfTriangularPrisms() {
      return arraySize;
   }
   
/**.
*@return a double representing the total 
surface areas for all TriangularPrism objects in the list
*/

   public double totalSurfaceArea() {
      double total = 0;
      for (int i = 0; i < arraySize; i++) {
         total += objList[i].surfaceArea();
      }
      return total;
   }
   
/**.
*@return a double representing the total 
volumes for all TriangularPrism objects in the list
*/

   public double totalVolume() {
      double total = 0;
      for (int i = 0; i < arraySize; i++) {
         total += objList[i].volume();
      }
      return total;
   }
   
/**.
*@return  a double representing the average 
surface area for all TriangularPrism objects in the list
*/

   public double averageSurfaceArea() {
      double total = 0;
      for (int i = 0; i < arraySize; i++) {
         total += (objList[i].surfaceArea()) / arraySize;
      }
      return total;
   }

/**.
*@return a double representing the average 
volume for all TriangularPrism objects in the list
*/

   public double averageVolume() {
      double total = 0;
      for (int i = 0; i < arraySize; i++) {
         total += (objList[i].volume()) / arraySize;
      }
      return total;
   }
   
/**.
*@return a String containing the name of the list
*/

   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "";
      output += "----- Summary for " + listName + " -----" + "\n";
      output += "Number of TriangularPrisms: " 
         + df.format(numberOfTriangularPrisms()) + "\n";
      output += "Total Surface Area: " 
         + df.format(totalSurfaceArea()) + " square units" + "\n";
      output += "Total Volume: " 
         + df.format(totalVolume()) + " cubic units" + "\n";
      output += "Average Surface Area: " 
         + df.format(averageSurfaceArea()) + " square units" + "\n";
      output += "Average Volume: " 
         + df.format(averageVolume()) + " cubic units";
      return output;
   }


/**.
*@return he array of TriangularPrism objects
*/

   public TriangularPrism[] getList() {
      return objList;
   }
   

/**.
*@param labelIn for label
*@param edgeIn for edge
*@param heightIn for height
*/

   public void addTriangularPrism(String labelIn, 
      double edgeIn, double heightIn) { 
      TriangularPrism obj = new TriangularPrism(labelIn, edgeIn, heightIn);
      objList[arraySize] = obj;
      arraySize++;
   }
   
   
/**.
*find TrinagularPrism List
*@param labelIn for label
*@return TriangularPrism object if found in the TriangularPrismLis object
*/

   public TriangularPrism findTriangularPrism(String labelIn) {
      
      for (int i = 0; i < arraySize; i++) {
         if (objList[i].getLabel().equalsIgnoreCase(labelIn)) {
            return objList[i];
         }    
      }
      return null;
   }


   
/**.
*@param labelIn for label
*@return the TriangularPrism if it is found in 
the TriangularPrismList object and deleted
*/


   public TriangularPrism deleteTriangularPrism(String labelIn) {
   
      TriangularPrism tP = null;
     
      for (int i = 0; i < arraySize; i++) {
         if (objList[i].getLabel().equalsIgnoreCase(labelIn)) {
            tP = objList[i];
            for (int x = i; x < (arraySize - 1); x++)
            {
               objList[x] = objList[x + 1];
            }
            objList[arraySize - 1] = null;
            arraySize--;
            break;
         }
      }
      return tP;
   }

/**.
*@param labelIn for label
*@param edgeIn for edge
*@param heightIn for height
*@return true if f found, sets the edge and 
height to the respective values passed in as parameters
*/

   public boolean editTriangularPrism(String labelIn, 
      double edgeIn, double heightIn) {
    
      boolean values = false;
      for (int i = 0; i < arraySize; i++) {
         if (objList[i].getLabel().equalsIgnoreCase(labelIn)) {
            objList[i].setEdge(edgeIn);
            objList[i].setHeight(heightIn);
            values = true;
         }    
      }
      return values;
   }



/**.
*@return the TriangularPrism with
the largest volume
*/


   public TriangularPrism findTriangularPrismWithLargestVolume() {
   
      if (numberOfTriangularPrisms() > 0) {
         for (TriangularPrism largestVolume : objList) {
            for (int i = 0; i < arraySize; i++) {
               if (objList[i].volume() > largestVolume.volume()) {
                  largestVolume = objList[i];
               }
            }
            return largestVolume;
         }
      }
      return null;
           
   }
}
