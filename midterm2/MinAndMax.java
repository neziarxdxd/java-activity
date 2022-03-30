package midterm2;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        /**
        Machine Problem no. 4
        Example output
        Enter the value of elements in array: 1 2 3 4 5 6 7 8 9 10
        The maximum value of array is 9.
        The minimum value of array is 1
        **/
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of elements in array: ");
        int size = 10;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        // To find the maximum value of array, we need to find the maximum value of the first element in array, and compare it with the maximum value of the rest elements in array
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The maximum value of array is " + max);
        System.out.println("The minimum value of array is " + min);
        


    }
}
