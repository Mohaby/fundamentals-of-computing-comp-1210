/**. 
 *
 * Project 7B
 * @author Mohab Yousef
 * @version 10/12/2021
 */
 import java.text.DecimalFormat;

/**.
*program that shows the mesurments for decagonal prism.
*/

public class TriangularPrism implements Comparable<TriangularPrism> {
    
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
   *@param labelIn for label
   */
  

    
   public boolean setEdge(double edgeIn) {
   if ( edgeIn >= 0) {
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
   if ( heightIn >= 0) {
   height = heightIn;
   return true;
   }
   return false;
   }
   
   /**.
   @return triangleArea
   */

   public double triangleArea() {
   
   return 0.25 * Math.sqrt(3 * Math.pow(edge, 4));
   }
   
   /**.
   @return rectangleArea
   */
   
   public double rectangleArea() {
   
   return (edge * height);
   }
   
   /**.
   @return surfaceArea
   */
   
   public double surfaceArea () {
   return ((2 * (0.25 * Math.sqrt(3 * Math.pow(edge, 4)))) + (2 * (edge * height)));
  
   }
   
   /**.
   @return Volume
   */
   
   public double volume () {
   return ((0.25 * Math.sqrt(3 * Math.pow(edge, 4))) * height);
   }
   
   
   
   /**.
   *@return output
   */
   
      
      public String toString() {
      DecimalFormat df = new DecimalFormat("#, ##0.0##");
    
      String output = ("TriangularPrism + \"" + label + "\" with"
      + " triangle edge of" + edge + " units and prism"
      + " height of" + df.format(height) + " units has:");
      output += ("\n\ttriangle area = " 
              + df.format(triangleArea()) + "square units");
      output += "\n\trectangle area = " 
               + df.format(rectangleArea()) + "square units";
      output += "\n\surface area = " 
               + df.format(surfaceArea()) + "square units";
      output += "\n\tvolume = " + df.format(volume()) + "cubic units";
      return output;
   }


      public static int getCount() {
      return count;
      }
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
   @Override
   public int compareTo(TriangularPrism obj) {
      if (Math.abs(this.volume() - obj.volume()) < 0.000001) {
         return -1;
      }
      else if (Math.abs(this.volume() - obj.volume()) > 0.000001) {
         return 1;
      }
      
       else {
      return 0;
      
      }
      }
      
      }
    
      
   


   
   