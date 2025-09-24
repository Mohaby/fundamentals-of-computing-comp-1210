/**. 
 *
 * Project 05
 * @author Mohab Yousef
 * @version 09/26/2021
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**.
   *DecagonalPrismApp
   */
public class DecagonalPrismListApp {
  
      /**.
   * Creating an Scanner class object which is used to get the inputs entered
   *@param args for args by the user
   *@throws for throws
   */

   public static void main(String[] args) throws FileNotFoundException {
      ArrayList<DecagonalPrism> arrayList = new ArrayList<DecagonalPrism>();
   

   Scanner sc = new Scanner(System.in);
   
   
   
   System.out.print("Enter file name: ");
   String fileName = sc.nextLine();
   String listName;
 
   Scanner scanFile = new Scanner(new File(fileName));
   listName = scanFile.nextLine();
   
   while(scanFile.hasNext()) {
   String size = scanFile.nextLine();
   double height =Double.parseDouble(scanFile.nextLine());
   double edge =Double.parseDouble(scanFile.nextLine());
   
   DecagonalPrism output = new DecagonalPrism(size,edge,height);
   arrayList.add(output);
   }
   System.out.print(arrayList);
   }
   }