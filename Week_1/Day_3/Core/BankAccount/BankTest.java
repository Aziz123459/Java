public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts

        // Deposit Test
        BankAccount bankAccount1=new BankAccount();
        bankAccount1.Deposit(200, "checking");
        bankAccount1.withdraw("checking", 100);

        BankAccount bankAccount2=new BankAccount();
        bankAccount2.Deposit(200, "saving");
        bankAccount2.withdraw("saving", 50);
        
        
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney

        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney

        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println("there is "+BankAccount.getAccounts());
        System.out.println("totle "+BankAccount.getTotalMoney());
    }
}

