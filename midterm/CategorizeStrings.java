
import java.util.*;
public class CategorizeStrings
{
   public static void main (String[] args)
   {
      /**
       Steps to complete the application:
       - initialize all the variables, Max, cutoff, when to quit, short, lo
       - Create a while loop that asks the user to enter a string. but only if the string is not equal to "ZZZ" and when reach the max, it will quit the loop
       - use if statement to check if the string is longer than the cutoff or shorter than the cutoff
       - then add the string to the appropriate array
       - if user exits or reaches the max
       - ask the use what output they want to see, short or long
       - then create a loop that displays the strings in the appropriate array
      
      **/
      final int MAX = 10;
      final int CUTOFF = 10;
      final String QUIT = "ZZZ";
      String entry;
      int shortSub = 0;
      int longSub = 0;
      Scanner input = new Scanner(System.in);
      String[] longStrings = new String[MAX];
      String[] shortStrings = new String[MAX];

      System.out.print("Enter a string or " +
         QUIT + " to quit >> ");
      entry = input.nextLine();
      while(!entry.equals(QUIT) && (shortSub + longSub < MAX))
      {
         if(entry.length() <= CUTOFF)
         {
            shortStrings[shortSub] = entry;
            ++shortSub;
         }
         else
         {
            longStrings[longSub] = entry;
            ++longSub;
         }
         if(shortSub + longSub < MAX)
         {
            System.out.print("Enter a string or " +
               QUIT + " to quit >> ");
            entry = input.nextLine();
         }
      }
      System.out.println("\nDo you want to see the list of short strings or the list of long strings?");
      System.out.print("   Please enter S or L or " +
         QUIT + " to quit >> ");
      entry = input.nextLine();
      while(!entry.equals(QUIT))
      {
          if(entry.substring(0, 1).toLowerCase().equals("s")){
            

             System.out.println();
            if(shortSub == 0)
                System.out.println("The list is empty");
            else
                for(int x = 0; x < shortSub; ++x)
                    System.out.println(shortStrings[x]);  
          }
             
          else{
            
             System.out.println();
            if(longSub == 0)
                System.out.println("The list is empty");
            else
                for(int x = 0; x < longSub; ++x)
                    System.out.println(longStrings[x]); 
          }
          System.out.println("\nDo you want to see the list of short strings or the list of long strings?");
          System.out.print("   Please enter S or L or " +
             QUIT + " to quit >> ");
          entry = input.nextLine();
      }
   }
  
}