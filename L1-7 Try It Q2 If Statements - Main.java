import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
       Scanner input = new Scanner( System.in );

       int age = 18;

       System.out.print("Enter your age: ");
       age = input.nextInt();

       if(age == 18 || age > 18);
       {
           System.out.println("You are eligible to vote in the election!");
       }

       System.out.println("You can't vote, your still young to vote.");
   }
}
