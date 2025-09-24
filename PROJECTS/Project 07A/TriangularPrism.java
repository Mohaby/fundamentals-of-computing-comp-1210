/**. 
 *
 * Project 7A
 * @author Mohab Yousef
 * @version 10/12/2021
 */
import java.text.DecimalFormat;

/**.
*program that shows the mesurments for decagonal prism.
*/

public class TriangularPrism {
    
  //instance Variables
   private String label = "";
   private double edge = 0;
   private double height = 0;
 
 //class variables
   private static int count = 0;

 //Constructor 
 /**.
  *@param labelIn to set label
  *@param heightIn to se height
  *@param edgeIn to set edge
  */

   public TriangularPrism(String labelIn, double edgeIn, double heightIn) {
      setLabel(labelIn);
      setEdge(edgeIn);
      setHeight(heightIn);
      count++;


   }
 
 
  // methods
  
  /**.
  *get label
  *@return label
  */
  
   public String getLabel() {
      return label;
   }
   
   /**.
   *set label
   *@return true if label != null
   *@param labelIn for label
   */
  

    
   public boolean setLabel(String labelIn) {
    
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      }
      return false;
   }

    
  /**.
  *@return edge
  *getEdge
  */
   
   public double getEdge() {
      return edge;
   }
    
  /**.
   *set egde
   *@return true if edge >= 0
   *@param edgeIn for edge
   */
  

    
   public boolean setEdge(double edgeIn) {
      if (edgeIn >= 0) {
         edge = edgeIn;
         return true;
      }
      return false;
   }
   
   
   /**.
   *setHeight
   *@return height
   */
   
   public double getHeight() {
      return height;
   }
   
   
 
   /**.
   *set height
   *@return true if height >= 0
   *@param heightIn for height
   */
  

    
   public boolean setHeight(double heightIn) {
      if (heightIn >= 0) {
         height = heightIn;
         return true;
      }
      return false;
   }
   
   /**.
   @return triangleArea
   */

   public double triangleArea() {
   
      double ta =  0.25 * Math.sqrt(3 * Math.pow(edge, 4));
      return ta;
   }
   
   /**.
   @return rectangleArea
   */
   
   public double rectangleArea() {
   
      double ar = (edge * height);
      return ar;
   }
   
   /**.
   @return surfaceArea
   */
   
   public double surfaceArea() {
      double a = ((2 * (0.25 * Math.sqrt(3 * Math.pow(edge, 4)))) 
         + (3 * (edge * height)));
      return a;
  
   }
   
   /**.
   @return Volume
   */
   
   public double volume() {
      double v = ((0.25 * Math.sqrt(3 * Math.pow(edge, 4))) * height);
      return v;
   }
   
   
   
   /**.
   *@return output
   */
   
   
   public String toString() {
      DecimalFormat df = new DecimalFormat("#, ##0.0##");
    
      String output = ("TriangularPrism \"" + label + "\" with"
         + " triangle edge of " + df.format(edge) + " units and prism"
         + " height of " + df.format(height) + " units has:");
      output += ("\n\ttriangle area = "
              + df.format(triangleArea()) + " square units");
      output += "\n\trectangle area = "
               + df.format(rectangleArea()) + " square units";
      output += "\n\tsurface area = "
               + df.format(surfaceArea()) + " square units";
      output += "\tvolume = " 
               + df.format(volume()) + " cubic units";
      return output;
   }

   /**. 
   *@return count
   */
   public static int getCount() {
      return count;
   }
   /**.
   *resetCount and set count to zero
  
   */
   public static void resetCount() {
      count = 0;
   }
     
       /**.
       *@param obj for object
       *@return true if the object is triangular prism
       * if not return false 
       */
  
      
   public boolean equals(Object obj) {
      if (!(obj instanceof TriangularPrism)) { 
         return false;
      }
      else {
         TriangularPrism d = (TriangularPrism) obj; 
         return (label.equalsIgnoreCase(d.getLabel())

                  && (Math.abs(edge - d.getEdge()) < .000001)
                        && (Math.abs(height - d.getHeight()) < .000001));
      } 
   }
      
   /**.
   *@return 0 
   */
   public int hashCode() {
      return 0;
   }

   
}
