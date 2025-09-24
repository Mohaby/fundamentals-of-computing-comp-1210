/**. 
 *
 * Project 05
 * @author Mohab Yousef
 * @version 09/26/2021
 */

import java.util.ArrayList; 
import java.text.DecimalFormat;

/**.
*program that shows the mesurments for decagonal prism.
*/
public class DecagonalPrismList {
 
 //Instance variables
   private String listName;
   private ArrayList<DecagonalPrism>dList;
   
  
 public DecagonalPrismList(String listNameIn, ArrayList<DecagonalPrism> dListIn) {
 listName = listNameIn;
 dList = new ArrayList<DecagonalPrism>();
 for (DecagonalPrism d : dListIn) {
 dList.add(d);
 
 }

}
  public String getName() {
      return listName;
   }

   public int numberOfDecagonalPrisms() {
   return dList.size();
   
     }
     
     
   public double totalSurfaceArea() {
   double total = 0;
   for (DecagonalPrism d : dList) {
   if (d != null) {
   total += (d.surfaceArea());
   }
   }
   return total ;
   }
   
   
   public double totalBaseArea() {
   double total = 0;
   for (DecagonalPrism d : dList) {
   if (d != null) {
   total += (d.baseArea());
   }
   }
   return total ;
   }


  public double totalLateralSurfaceArea() {
  double total = 0;
  for (DecagonalPrism d : dList) {
   if (d != null) {
   total  += (d.lateralSurfaceArea());
   }
   }
   return total ;
   }
   
   public double totalVolume() {
   double total = 0;
   for (DecagonalPrism d : dList) {
   if (d != null) {
   total += (d.volume());
   }
   }
   return total ;
   }
   

   
  public double averageSurfaceArea() {
  if (numberOfDecagonalPrisms() == 0) {
  return 0;
  }
  else {
  return totalLateralSurfaceArea() / numberOfDecagonalPrisms();
  }
  }
  
  public double averageVolume() {
  if (numberOfDecagonalPrisms() == 0) {
  return 0;
  }
  else {
   return totalVolume() / numberOfDecagonalPrisms();
  }
  }
  
  
  public String toString() {
  String result = listName + "\n";
  int index = 0;
  while (index < dList.size()) {
         result += "\n" + dList.get(index) + "\n";
         index++;
      }
      return result;
  }
  
  public String summaryInfo() {
  
  DecimalFormat df = new DecimalFormat("#,##0.0##");
  String result = "";
  result += "----- Summary for " + getName() + "-----";
  result += "\nNumber of Decagonal Prisms: " + numberOfDecagonalPrisms();
  result += "\nTotal Surface Area: " + df.format(totalSurfaceArea());
  result += "\nTotal Base Area: " + df.format(totalBaseArea());
  result += "\nTotal Lateral Surface Area: " + df.format(totalLateralSurfaceArea());
  result += "\nTotal Volume: " + df.format(totalVolume());
  result += "\nAverage Surface Area: " + df.format(averageSurfaceArea());
  result += "\nAverage Volume: " +df.format(averageVolume());
  return result;
  }
  }