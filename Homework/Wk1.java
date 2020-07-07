package Homework;
import java.util.Scanner;
public class Wk1 {

public static void main(String[] args) {
    /*int thisInteger = 5;
    boolean thisTrue = false; 
    double thisDouble = 5.14123456789;*/
    Scanner myScan = new Scanner(System.in);
    double price; 
    double tax = 1.1; 
    boolean dinner = true;
    int q = 0;

    price = myScan.nextInt();
    double tip = (price * tax) * 0.2; 
do{
   System.out.println((price * tax) + tip );
    q++;
        }while (q < 10);
        
        
    } 
}
