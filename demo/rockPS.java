package demo;
import java.util.Random;
import java.util.Scanner;
public class rockPS {

public static void main(String[] args){ 
        

    System.out.println("Welcome to the Rock, Paper, Scissors game!\n" +
                        "Please enter one of the values below.\n" +
                        "Scissors\n" + "Paper\n" + "Rock\n" + "END = End Game");


    String userChoice; //User's input R,P,S
    String compChoice = ""; //Empty string for computer choice 
    int computerNum; //Randomly generate number for choice 

    boolean run = true;
    Scanner scan = new Scanner(System.in); 
    Random random = new Random(); 
        while (run){
    //Random Num 
    computerNum = random.nextInt(3)+1; 

//while (run){
    if (computerNum == 1) 
    compChoice = "Rock"; 

    else if (computerNum == 2) 
    compChoice = "Paper";

    else if (computerNum == 3) 
    compChoice = "Scissor"; 


    //Get input
 
    System.out.println("Input your choice: "); 
    userChoice = scan.next();

    //Make inputs uppercase for to ward malicious users
    userChoice = userChoice.toUpperCase(); 

    //Print computer's play 
    System.out.println("Computer chose: " + compChoice); 


    //Outcomes 
    if (userChoice.equals("END")){
        System.out.println("You have chose to end the game. Goodbye!");
        run = false;
        System.out.print("Game Has Terminated.");         
    } // placed first so it can Check for End of game first

    else if (userChoice.equals(compChoice)) 
        System.out.println("It's a tie!"); 

    else if (userChoice.equals("Rock") && compChoice.equals("Scissor")) 
        System.out.println("Rock smashes scissors. Rock wins!");

    else if (userChoice.equals("Rock") && compChoice.equals("Paper")) 
        System.out.println("Paper eats rock. Paper Wins!"); 

    else if (userChoice.equals("Paper") && compChoice.equals("Scissor"))
        System.out.println("Scissor cuts paper. Scissor Wins!"); 

    else if (userChoice.equals("Paper") && compChoice.equals("Rock"))
        System.out.println("Paper covers rock. Paper wins!"); 
    
    else if (userChoice.equals("Scissor") && compChoice.equals("Paper"))
        System.out.println("Scissor cuts paper. Scissor wins!"); 

    else if (userChoice.equals("Scissor") && compChoice.equals("Rock"))
        System.out.println("Rock smashes scissor. Rock Wins!"); 
        }
    }
}
