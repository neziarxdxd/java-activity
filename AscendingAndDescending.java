// import scanner
import java.util.Scanner;
public class AscendingAndDescending{
    // Write an application that asks a user to enter three integers. Display them in ascending and descending order
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        int one = input.nextInt();
        int two = input.nextInt();
        int three = input.nextInt();
        
        // display in Ascending order
        System.out.println("Ascending order:");        
        if(one < two && one < three){
            System.out.println(one + " " + two + " " + three);
        }
        else if(two < one && two < three){
            System.out.println(two + " " + one + " " + three);
        }
        else if(three < one && three < two){
            System.out.println(three + " " + one + " " + two);
        }
        System.out.println("\n");

        // Display in Descending order
        System.out.println("Descending order:");
        if(one > two && two > three)
          {
             System.out.println(one + " " + two + " " + three);
          }
          else if(two > one && one > three)
          {
             System.out.println(two + " " + one + " " + three);
          }
          else if(three > two && two > one)
          {
             System.out.println(three + " " + two + " " + one);
          }
          else
          {
             System.out.println(one + " " + three + " " + two);
          }


    }

}