import java.util.Scanner;
public class InBetween {
    /**
    
    4.	Write an application that prompts a user for two integers and displays every integer between them. Display a message if there are no integers between the entered values. Make sure the program works regardless of which entered value is larger. Save the file as Inbetween.java. 
    
    Steps to solve the problem:
    - Create a Scanner object for user input such as the first and second integers
    - get the difference between the two integers and get the absolute value of the difference
    - find which is the larger integer and use that as the ending points and the smaller (with + 1) as starting point by using Min and Max methods 
    - if the difference is 0 or 1, display a message saying there are no integers between the two numbers
    - else print all the integers between the two numbers by using a for loop 
    
    */

    public static void main(String[] args) {
        // In between numbers 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = input.nextInt();
        System.out.print("Enter the second number: ");
        int second = input.nextInt();
        int difference = Math.abs(first - second);
        // get the min and max
        int min = Math.min(first, second);
        int max = Math.max(first, second);
        if (difference == 0 || difference == 1) {
            System.out.println("There are no numbers between " + first + " and " + second);
        } else {
            // Prints all numbers between first and second
            for (int i = min + 1; i < max; i++) {
                System.out.println(i);
            }
        }
        
    }
}
