package PracticeIt;
import java.util.Random;
import java.util.Scanner;
public class ch6 {

public static void inputStats(Scanner input) {
	 String longestLine = "";
    int lineNum = 0;
    
    while(input.hasNextLine()) {
        lineNum++;
        String line = input.nextLine();
        Scanner lineInput = new Scanner(line);
        int count = 0;
        int longestToken = 0;
        
        while(lineInput.hasNext()) {
            String token = lineInput.next();
            count++;
            
            if(token.length() > longestToken)
                longestToken = token.length();
        }
        
        System.out.println("Line " + lineNum + " has " + count + 
            " tokens (longest = " + longestToken + ")");
        
        if(line.length() > longestLine.length())
            longestLine = line;
    }
    
    System.out.println("Longest line: " + longestLine);

}

public String readEntireFile(Scanner sc) {
    StringBuilder text = new StringBuilder();
    
    while(sc.hasNextLine()) {
        text.append(sc.nextLine() + "\n");
    }
    
    return text.toString();
}

public static void wordWrap(Scanner input) { 
        while(input.hasNextLine()) {
            String line = input.nextLine();
            
            while(line.length() > 60) {
                System.out.println(line.substring(0, 60));
                line = line.substring(60);
            }
            
            System.out.println(line);
        }
    }
}

