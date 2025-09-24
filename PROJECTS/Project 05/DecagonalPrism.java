/**. 
 *
 * Project 05
 * @author Mohab Yousef
 * @version 09/26/2021
 */
import java.text.DecimalFormat;

/**.
*program that shows the mesurments for decagonal prism.
*/
public class DecagonalPrism {
 
 //Instance variables
   private String label;
   private double edge;
   private double height;
  
 
 //Constructor 
 /**.
 *@param labelIn to set label
  *@param heightIn to se height
  *@param edgeIn to set edge

    */

   public DecagonalPrism(String labelIn, double edgeIn, double heightIn) {
  
      setLabel(labelIn);
      setEdge(edgeIn);
      setHeight(heightIn);
   }
   
  //methods
  /**.
  *@return label
  */
  
   public String getLabel() {
      return label;
   }
  /**.
  *@param labelIn to check if lable = null
  * @return isSet if it is true.
  */ 
   public boolean setLabel(String labelIn) {
      boolean isSet;
      if (labelIn != null) {
         
         isSet = true;
         label = labelIn.trim();
      }  
      else {
         isSet = false;
      }
      return isSet;
   }
  
  
  /**.
  *@return edge
  */
  
   public double getEdge() {
      return edge;
   } 
  /**.
  *@param edgeIn to check if edge > 0
  *@return isSet if it is true.
  */ 

   public boolean setEdge(double edgeIn) {
      boolean isSet;
      if (edgeIn > 0) {
         isSet = true;
         edge = edgeIn;
         
      }
      else {
         isSet = false;
      }
      return isSet;
   }
  
  
  /**.
  *@return height
  */
  
   public double getHeight() {
      return height;
   }
  /**.
  *@param heightIn to check if hieght > 0
  *@return isSet if it is true.
  */ 

   public boolean setHeight(double heightIn) {
      boolean isSet;
      if (heightIn > 0) {
         isSet = true;
         height = heightIn;
      }
      else {
         isSet = false;
      }
      return isSet;
   }
  
  /**.
  *@return surfaceArea
  */
   
   public double surfaceArea() {
      double surfaceArea = ((10 * edge * height) 
         + (5 * Math.pow(edge, 2) * Math.sqrt(5 + (2 * Math.sqrt(5)))));
      return surfaceArea;
   }
  

  
  /**.
  *@return baseArea
  */
  
   public double baseArea() {
      double baseArea = (2.5 * Math.pow(edge, 2) 
         * Math.sqrt(5 + (2 * Math.sqrt(5))));
      return baseArea;
   }
  
  /**.
  *@return lateralSurfaceAre
  */
  
   public double lateralSurfaceArea() {
      double lateralSurfaceArea = 10 * edge * height;
      return lateralSurfaceArea;
   }
  
  /**.
  *@return Volume
  */
  
   public double volume() {
      double volume = (2.5 * Math.pow(edge, 2) * height
         * Math.sqrt(5 + (2 * Math.sqrt(5))));
      return volume; 
   }
   
   /**.
   *@return string
   */
   
   public String toString() {
      DecimalFormat df = new DecimalFormat("#, ##0.0##");
   
      String output = ("A decagonal prism \"" + label + "\" with edge = "
         + df.format(edge) + "units and height = " + height + " units, has:");
      output += ("\n\tsurface area = " 
              + df.format(surfaceArea()) + "square units");
      output += "\n\tbase area = " 
               + df.format(baseArea()) + "square units";
      output += "\n\tlateral surface area = " 
               + df.format(lateralSurfaceArea()) + "square units";
      output += "\n\tvolume = " + df.format(volume()) + "cubic units";
      return output;
   }
}
                 
   
