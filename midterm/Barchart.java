import java.util.Scanner;
public class Barchart
{
   public static void main(String[] args)
   {
     /** 
      Steps to complete the application:
      - Create an array for name of players 
      - Create an array for the number of goals they scored
      - assign the values to the arrays by inputting the values from the user
      - the points index is corresponding to the name of player index
      - create a loop that multiplies the "*" by the number of points the player scored

      **/

      String nameOfPlayers [] = {"Art", "Bob", "Cal", "Dan", "Eli"};
      int [] points = new int[5];
      Scanner input = new Scanner(System.in);
      System.out.print("Enter points scored by Art >> ");
      points[0] = input.nextInt();
        System.out.print("Enter points scored by Bob >> ");
        points[1] = input.nextInt();
        System.out.print("Enter points scored by Cal >> ");
        points[2] = input.nextInt();
        System.out.print("Enter points scored by Dan >> ");
        points[3] = input.nextInt();
        System.out.print("Enter points scored by Eli >> ");
        points[4] = input.nextInt();

      System.out.println();
      System.out.println("Points for Game");
      System.out.println();
      for(int i=0; i<5; i++)
      {
            System.out.print(nameOfPlayers[i] + "   ");
            for(int j=0; j<points[i]; j++)
            {
                System.out.print("*");
            }
            System.out.println();
      }
   }
  
}  