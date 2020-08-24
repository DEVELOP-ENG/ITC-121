package PracticeIt;

public class PI812 {

    //transactionFeeBankAccount
    public boolean transactionFee(double fee) {
        double amount = (fee * transactions * (transactions + 1)) / 2;
        
        if(balance > amount) {
            balance -= amount;
            return true;
        }
        
        balance = 0;
        return false;
    
    }
    

    //transferBankAcc
    public void transfer(BankAccount ba, double money) {
        if(balance < 5 || money <= 0)
            return;
        
        if(balance < 5 + money) {
            ba.deposit(balance - 5);
            this.withdraw(balance);
        } else {
            ba.deposit(money);
            this.withdraw(5 + money);
        }
    }
    
    //
    private String name;
    private double balance;
    
    public String toString() {
        String sign = "";
        String pad = "";
        
        if(balance < 0) {
            balance = -balance;
            sign = "-";
        }
        
        int temp = (int) (balance * 100);
        int intPart = temp / 100;
        int decPart = temp % 100;
        
        if(decPart < 10)
            pad = "0";
        
        return name + ", " + sign + "$" + intPart + "." + pad + decPart;
    } 

    //containsRectangle

    public boolean contains(int x, int y) {
        return this.x <= x && x <= this.x + width && this.y <= y &&
            y <= this.y + height;
    }
    
    public boolean contains(Point p) {
        return contains(p.getX(), p.getY());
    }  

    //constructorRectangle
    public Rectangle(Point p, int width, int height) {
        this.x = p.getX();
        this.y = p.getY();
        this.width = width;
        this.height = height;
        }   

    //transactionFeeBankAccount
    public boolean transactionFee(double fee) {
            double amount = (fee * transactions * (transactions + 1)) / 2;
            
            if(balance > amount) {
                balance -= amount;
                return true;
            }
            
            balance = 0;
            return false;
        }



    
}