public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances
   

    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    
    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance() {
        return checkingBalance;
    }
    public BankAccount() {
        accounts++;
    }
    public double getSavingsBalance() {
        return savingsBalance;
    }
    public static int getAccounts() {
        return accounts;
    }
    public static double getTotalMoney() {
        return totalMoney;
    }
    // METHODS
    // deposit
    public void Deposit(double amount ,String acc){
        if(acc=="checking"){
            this.checkingBalance+=amount;
        }
        if(acc=="saving"){
            this.savingsBalance+=amount;
        }
        totalMoney+=amount;
    }
    // - users should be able to deposit money into their checking or savings account
    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    public String withdraw(String acc,double amount){
        String msg="";
        if(acc=="checking"){
            if(amount>this.checkingBalance){
                msg="insufficient funds";
            }
            else{
                this.checkingBalance-=amount;
                totalMoney-=amount;
                msg="success";
            }
        }else{
            if(amount>this.savingsBalance){
                msg="insufficient funds";
            }
            else{
                this.savingsBalance-=amount;
                totalMoney-=amount;
                msg="success";
            }
        }
        return msg;
    }
    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public void getBalance(){
        System.out.println("your total is : %s"+(getCheckingBalance()+getSavingsBalance()));
    }
}   
