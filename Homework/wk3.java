package Homework;
import java.util.Scanner; 
import java.util.Random; 


public class wk3 
{ 
public static void main(String[] args) 
{       
   System.out.println("Would you like to play Rock, Paper, Scissors?");

    String personPlay; //User's play -- "R", "P", or "S" 
    String computerPlay = ""; //Computer's play -- "R", "P", or "S" 
    int computerNum; //Randomly generated number used to determine 
                     //computer's play 


    Scanner scan = new Scanner(System.in); 
    Random generator = new Random(); 

    System.out.println("Hey, let's play Rock, Paper, Scissors!\n" + 
                       "Please enter a move.\n" + "Rock = R, Paper " + 
                       "= P, and Scissors = S.");

    System.out.println();

    //Generate computer's play (0,1,2) 
    computerNum = generator.nextInt(3)+1; 

    //Translate computer's randomly generated play to 
    //string using if //statements 

    if (computerNum == 1) 
       computerPlay = "R"; 
    else if (computerNum == 2) 
       computerPlay = "P"; 
    else if (computerNum == 3) 
       computerPlay = "S"; 


    //Get player's play from input-- note that this is 
    // stored as a string 
    System.out.println("Enter your play: "); 
    personPlay = scan.next();

    //Make player's play uppercase for ease of comparison 
    personPlay = personPlay.toUpperCase(); 

    //Print computer's play 
    System.out.println("Computer play is: " + computerPlay); 


    //See who won. Use nested ifs 

    if (personPlay.equals(computerPlay)) 
       System.out.println("It's a tie!"); 
    else if (personPlay.equals("R")) 
       if (computerPlay.equals("S")) 
          System.out.println("Rock crushes scissors. You win!!");
    else if (computerPlay.equals("P")) 
            System.out.println("Paper eats rock. You lose!!"); 
    else if (personPlay.equals("P")) 
       if (computerPlay.equals("S")) 
       System.out.println("Scissor cuts paper. You lose!!"); 
    else if (computerPlay.equals("R")) 
            System.out.println("Paper eats rock. You win!!"); 
    else if (personPlay.equals("S")) 
         if (computerPlay.equals("P")) 
         System.out.println("Scissor cuts paper. You win!!"); 
    else if (computerPlay.equals("R")) 
            System.out.println("Rock breaks scissors. You lose!!"); 
    else 
         System.out.println("Invalid user input."); 
      }
   }