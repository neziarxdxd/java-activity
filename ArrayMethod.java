import java.util.Scanner;

public class ArrayMethod {
    public static void main(String[] args) {
        /**
                 Create an application containing an array that stores 10 integers. The application should call 
                five methods that in turn (1) display all the integers, (2) display all the integers in reverse 
                order, (3) display the sum of the integers, (4) display all values less than a limiting argument, 
                and (5) display all values that are higher than the calculated average value. Save the file as 
                ArrayMethod.java. 
         */
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        System.out.print("Enter an integer: ");
        for (int i = 0; i < array.length; i++) {            
            array[i] = input.nextInt();
        }
        System.out.println("Enter the limit number: ");
        
        int limit = input.nextInt();
        
        System.out.println("The array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nThe array in reverse order is: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nThe sum of the array is: ");
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
        
        // less than the limit 
        for (int i = 0; i < array.length; i++) {
            if (array[i] < limit) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println(" are less than the limit " + limit);

        System.out.println("\nThe average value of the array is: ");
        double average = sum / array.length;
        System.out.println(average);

        // higher than the average value
        for (int i = 0; i < array.length; i++) {
            if (array[i] > average) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println(" are higher than the average value " + average);


    }}