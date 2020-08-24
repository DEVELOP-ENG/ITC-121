package PracticeIt;

public class ch8 {
    // A BankAccount keeps track of a user's money balance and ID,
// and counts how many transactions (deposits/withdrawals) are made.

    public boolean transactionFee(double fee) {
        double amount = (fee * transactions * (transactions + 1)) / 2;
        
        if(balance > amount) {
            balance -= amount;
            return true;
        }
        
        balance = 0;
        return false;
    
    }
}