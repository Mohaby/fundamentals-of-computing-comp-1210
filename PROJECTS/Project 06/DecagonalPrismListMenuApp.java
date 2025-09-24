/**.
    * COMP 1213 Project 06.
    * @ Mohab Yousef
    * @ 03/01/2021
    */



import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**.
   *ConeListMenuApp
   */
public class DecagonalPrismListMenuApp {
   static Scanner sc = new Scanner(System.in);
      /**.
   * Creating an Scanner class object which is used to get the inputs entered
   *@param args for args
   * by the user
   *@throws for throws
   */

   public static void main(String[] args) throws FileNotFoundException {
      char choice;
      String listName = "";
      ArrayList<DecagonalPrism> myNewList = new ArrayList<DecagonalPrism>();
      while (true) {
         choice = menu();
         switch (choice) {
            case 'R':
            case 'r':
               System.out.print("\tFile Name: ");
               String file = sc.nextLine();
               Scanner readFile = new Scanner(new File(file));
               listName = readFile.nextLine();
               while (readFile.hasNextLine()) {
                  String label = readFile.nextLine();
                  double height = Double.parseDouble(readFile.nextLine());
                  double edge = Double.parseDouble(readFile.nextLine());

                 DecagonalPrism d = new DecagonalPrism(label, edge, height);
  
                  myNewList.add(d);
  
               }
               readFile.close();
               System.out.println("\tFile read in and Cone List Created");
  
               continue;
            case 'P':
            case 'p':
  
                ArrayList<DecagonalPrism>getList();
               System.out.println(d.getName());
               for (int i = 0; i < list.size(); i++)
               {
                  System.out.println(list.get(i));
               }
               continue;
            case 'S':
            case 's':
               System.out.println(el.summaryInfo());
               continue;
            case 'A':
            case 'a':
  
               System.out.print("\tLabel: ");
               String label = sc.nextLine();
     
               System.out.print("\tHeight: ");
               double height = sc.nextDouble();
               System.out.print("\tRadius: ");
               double radius = sc.nextDouble();
               DecagonalPrism cn = new DecagonalPrism(label, height, edge);
               arl.add(cn);
               el = new DecagonalPrismList(listName, arl);
               System.out.println("*** DecagonalPrism added ***");
               sc.nextLine();
               continue;
            case 'D':
            case 'd':
               System.out.print("\tLabel: ");
               label = sc.nextLine();
               int index = isConeExists(label, el.getList());
               if (index == -1)
               {
                  System.out.println(label + " not found");
               }
               else
               {
                  el.getList().remove(index);
                  System.out.println("\t" + "\"" + label  + "\" deleted");
               }
               continue;
            case 'F':
            case 'f':
               System.out.print("\tLabel: ");
               label = sc.nextLine();
               index = isConeExists(label, el.getList());
               if (index == -1)
               {
                  System.out.println("\t" + "\"" + label + "\" not found");
               }
               else
               {
                  System.out.println(el.getList().get(index));
               }
               continue;
            case 'E':
            case 'e':
               System.out.print("\tLabel: ");
               label = sc.nextLine();
               System.out.print("\tHeight: ");
               height = sc.nextDouble();
               System.out.print("\tRadius: ");
               radius = sc.nextDouble();
               index = isConeExists(label, el.getList());
               if (index == -1)
               {
                  System.out.println("\t" + "\"" + label + "\" not found");
               }
               else
               {
                  el.getList().get(index).setHeight(height);
                  el.getList().get(index).setRadius(radius);
                  System.out.println("\t" + "\"" + label 
                  + "\" successfully edited");
               }
               sc.nextLine();
               continue;
            case 'Q':
            case 'q':
               break;
            default: {
               System.out.println("*** Invalid code ***");
               continue;
            }
         }
         break;
      }
   }
   private static int isConeExists(String label,
      ArrayList <DecagonalPrism> list) {
      for (int i = 0; i < list.size(); i++)
      {
         if (list.get(i).getLabel().equalsIgnoreCase(label))
         {
            return i;
         }
      }
      return -1;
   }
   private static char menu() {
      System.out.println("\nCone List System Menu");
      System.out.println("R - Read File and Create Cone List");
      System.out.println("P - Print Cone List");
      System.out.println("S - Print Summary");
      System.out.println("A - Add Cone");
      System.out.println("D - Delete Cone");
      System.out.println("F - Find Cone");
      System.out.println("E - Edit Cone");
      System.out.println("Q - Quit");
      System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
      char choice = sc.nextLine().charAt(0);
      return choice;
   }
}