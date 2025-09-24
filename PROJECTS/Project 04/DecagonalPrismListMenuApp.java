/**. 
 *
 * Project 05
 * @author Mohab Yousef
 * @version 09/26/2021
 */
 
 
 

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

   /**.
   ecagonalPrismListMenuApp
   */
public class DecagonalPrismListMenuApp {


/**.
@param args - is not used.
*@throws FileNotFoundException if the file cannot be opened.
*/

public static void main(String[] args) throws FileNotFoundException {
 String dListName = "";
 ArrayList<DecagonalPrism>myNewList = new ArrayList<DecagonalPrism>();
 DecagonalPrismList myDList = new DecagonalPrismList(dListName, myNewList);
  double  s2, s3;
 String code = "";
 
 Scanner scan = new Scanner(System.in);
 System.out.println("DecagonalPrism List System Menu\n"
      + "R - Read File and Create DecagonalPrism List\n"
      + "P - Print DecagonalPrism List\n"
      + "S - Print Summary\n"
      + "A - Add DecagonalPrism\n"
      + "D - Delete DecagonalPrism\n"
       +"F - Find DecagonalPrism\n"
       +"E - Edit DecagonalPrism\n"
       +"Q - Quit");
       
       do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         
         String label;
         String fileName = ("no file name");

         code = scan.nextLine();
         if (code.length() == 0) {
         continue;
         }
         
         code = code.toUpperCase();
         char codeChar = code.charAt(0);
         switch(codeChar) {
         case 'R': //Read in File and Create DicagonalPrismList
         System.out.print("\tFile Name: ");
         fileName = scan.nextLine();
         
         
         myDList = myDList.readFile(fileName);
         
         System.out.println("\tFile read in and DecgaonalPrism List created");
         
         break;
         
         case 'P':
         Sysytem.out.println(dList);
         break;
         
         
         case 'S':
          System.out.println(dList.summaryInfo());
          break;
          
          case 'A':
             System.out.print("\tLabel: ");
               s1 = scan.nextLine();
     
               System.out.print("\tEdge: ");              
               s2 = scan.nextDouble();
               
               System.out.print("\tHeight: ");
               s3 = scan.nextDouble();
               
               DecagonalPrism d = new DecagonalPrism(s1, s2, s3);
               dList.add(d);
               dList = new DecagonalPrismList(listName, myNewList);
               System.out.println("*** DecagonalPrism added ***\n");
               scan.nextLine();
               break;
               
               
               case 'D':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               int index = isDisagonalPrismExists(label, myDList.getList());
               if (index == -1)
               {
                  System.out.println(label + " not found");
               }
               else
               {
                  myDlist.getList().remove(index);
                  System.out.println("\t" + "\"" + label  + "\" deleted");
               }


break;
                  
                case 'F':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               index = isDicagonalPrismExists(label, myDList.getList());
               if (index == -1)
               {
                  System.out.println("\t" + "\"" + label + "\" not found");
               }
               else
               {
                  System.out.println(myDList.getList().get(index));
               }

           break;
           
           
               case 'E':
               
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tEdge: ");
               edge = scan.nextDouble();
               System.out.print("\tHeight: ");
               height = scan.nextDouble();
               index = isDiscagonalExists(label, myDList.getList());
               if (index == -1)
               {
                  System.out.println("\t" + "\"" + label + "\" not found");
               }
               else
               {
                  myDList.getList().get(index).setHeight(height);
                  myDList.getList().get(index).setRadius(radius);
                  System.out.println("\t" + "\"" + label 
                  + "\" successfully edited");
               }
               scan.nextLine();
                
                break;
                
                
                
            case 'Q':
              break;
              
             default: {
               System.out.println("*** Invalid code ***");
               break;
            }
         }

      
   }while(!scan.equalsIgnoreCase('Q'));}
}