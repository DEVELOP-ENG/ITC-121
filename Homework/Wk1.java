package Homework;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Wk1 {

public static void main(String[] args) {

    // tool to format numbers to certain decimal place
    DecimalFormat format = new DecimalFormat("##.00");

    // variables used to input data and for equations 
    Scanner myScan = new Scanner(System.in);
    double price; 
    double tax = 1.1; 

    // attempt to create a for loop, but never finished
    boolean dinner = true;
    int q = 0;

    // display message for initial question and interactive
    System.out.println("How much was your meal?");

    // input variable, and equations for corresponding costs
    price = myScan.nextDouble();
    double tip = (price * tax) * 0.2; 
    double cost = ((price * tax) + tip);
    double taxTotal = (price * 0.1);
  
// A series of displays for the varrying costs of the meal
   System.out.println("Your subtotal of the meal is $" + format.format(price));
   System.out.println("Your total tax of the meal is $" + format.format(taxTotal));
   System.out.println("Your total tip of the meal is $" + format.format(tip));
   System.out.println("Your total cost of the meal is $" + format.format(cost));   

    } 
}
