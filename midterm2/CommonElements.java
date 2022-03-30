package midterm2;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        
        /** 
         Machine Problem no. 5
        Example output
        Enter the value of elements in 1st array: 1 2 3 4 5 6 7 8 9 10
        Enter the value of elements in 2nd array: 11 10 12 13 14 2 4 5
        Common elements are 2 4 5 10
        **/
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of elements in 1st array: ");
        // initialize the size of array
        int size = 10;
        int[] array1 = new int[size];
        // get the value of elements in array1 from user
        for (int i = 0; i < size; i++) {
            array1[i] = input.nextInt();
        }
        System.out.print("Enter the value of elements in 2nd array: ");
        // initialize the size of array
        int size2 = 10;
        int[] array2 = new int[size2];
        // get the value of elements in array2 from user
        for (int i = 0; i < size2; i++) {
            array2[i] = input.nextInt();
        }
        // initialize the size of array
        int[] common = new int[size];
        int count = 0;
        // find the common elements in array1 and array2, and store them in common, and count the number of common elements, and store it in count
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size2; j++) {
                if (array1[i] == array2[j]) {
                    common[count] = array1[i];
                    count++;
                }
            }
        }
        // print the common elements
        System.out.print("Common elements are ");
        for (int i = 0; i < count; i++) {
            System.out.print(common[i] + " ");
        }
        System.out.println();
        
    }
}
