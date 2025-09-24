/**. 
 *
 * Activity 7A
 * @author Mohab Yousef
 * @version 10/12/2021
 */

public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;
   
   // class variables
   
   private static int loansCreated = 0;
   
 
   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
  /**. 
  @param customerNameIn for customer name
  *@param interestRateIn for interestRate
  */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      String s = "Red Sox";
      loansCreated++;
   } 
   
   
   /**.
   * check if balance + amount < MaxLoanAMount
   * @return wasLoanMade 
   * @param amount for amount
   */

   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
   
    /**.
   * 
   * @return amount if it is >= 0 
   * @param amount for amount
   */


   
   public static boolean isAmountValid(double amount) {
   
      return amount >= 0;
   }
   
    /**.
   * 
   * @return loan if it is > 0 
   * @param loan for loan
   */

   public static boolean isInDebt(BankLoan loan) {
   
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
   
   /**.
   @return loansCreated
   */

   public static int getLoansCreated() {
      return loansCreated;
   }
   
   /**.
   @reset loansCreated to 0
   */

   public static void resetLoansCreated() {
      loansCreated = 0;
   }

   /**.
   *get the difeerence betweent balance and amount paid
   *@return newBalance if it is < 0
   *@param amountPaid for amoutnPaid
   */




   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   /**.
   @return Balance
   */
   public double getBalance() {
      return balance;
   }
   
   /**.
   @return interestRateIn
   @param interestRateIn for interestRateIn
   */

   
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   
   /**.
   @return interestRate.
   */

   
   
   public double getInterestRate() {
      return interestRate;
   }
   
   
   /**.
   *Set balance += interestRate + 1
   */

   
   
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
   
   /**.
   @return output
   */

   
   
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
     
}
