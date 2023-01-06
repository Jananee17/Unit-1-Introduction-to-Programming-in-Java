import java.util.*;

public class Main
{
   public static void main(String[] args)
   {
       Scanner keyboard = new Scanner( System.in );
       String input;
       char key;

       while(true)
       {
           System.out.print("Do you want to quit? ");
           input = keyboard.next();
           // Get the first character from the input string
           key = input.charAt(0);

           System.out.println("You entered: " + key);
           break;
       }
   }
}
