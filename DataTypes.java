import java.util.Scanner;

public class DataTypes {

public static void main(String[] args) {
    int thisInteger = 5;
    boolean thisTrue = false; 
    double thisDouble = 5.14123456789;
    String msg1 = new String("Hello World! This is Noel");
    boolean result;
    Scanner myScan = new Scanner(System.in);

    result = myScan.nextBoolean();
    msg1 = myScan.nextLine();

   System.out.println("Are you a male " + result + " my message is " + msg1);
 /*
    System.out.println(msg1);
    System.out.println(thisInteger);
    System.out.println(thisDouble);
    System.out.println(thisTrue);
    
    result = thisInteger + thisDouble;
    System.out.println(result);
    result = thisInteger % thisDouble;
    System.out.println(result);


    */} 

    
}
    