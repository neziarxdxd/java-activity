import java.util.Scanner;
public class Barchart
{
   public static void main(String[] args)
   {
      int artPoints, bobPoints, calPoints, danPoints, eliPoints;
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
   public static void displayBar(int pp)
   {
      int points;
      for(points = 0; points < pp; ++points)
      {
         System.out.print("*");
      }
      System.out.println();
   }
}  