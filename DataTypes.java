import java.util.Scanner;

public class DataTypes {

public static void main(String[] args) {
    /*int thisInteger = 5;
    boolean thisTrue = false; 
    double thisDouble = 5.14123456789;*/
    String msg1 = new String("Hello World! This is Noel");
    boolean result;
    Scanner myScan = new Scanner(System.in);

    result = myScan.nextBoolean();
    msg1 = myScan.nextLine();

   System.out.println("Are you a male " + result + " my message is " + msg1);
} 

    
}
    