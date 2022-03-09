// import scanner
import java.util.Scanner;
public class AscendingAndDescending{
    // Write an application that asks a user to enter three integers. Display them in ascending and descending order
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        
        // display in Ascending order
        System.out.println("Ascending order:");        
        if(num1 < num2 && num1 < num3){
            System.out.println(num1 + " " + num2 + " " + num3);
        }
        else if(num2 < num1 && num2 < num3){
            System.out.println(num2 + " " + num1 + " " + num3);
        }
        else if(num3 < num1 && num3 < num2){
            System.out.println(num3 + " " + num1 + " " + num2);
        }
        System.out.println("\n");

        // Display in Descending order
        System.out.println("Descending order:");        
        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " " + num2 + " " + num3);
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println(num2 + " " + num1 + " " + num3);
        }
        else if(num3 > num1 && num3 > num2){
            System.out.println(num3 + " " + num1 + " " + num2);
        }
    }

}