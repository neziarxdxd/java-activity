import java.util.Scanner;

public class FindElementPosition {
    public static void main(String[] args) {
        /** 
         Machine Problem no. 3
        Example output
        Enter the size of array: 5
        Enter the value of elements: 10 20 30 40 50
        Enter the element you want to find: 20
        Element found at position 2
        **/
        // scan the input    
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        // get the value of elements from user
        System.out.print("Enter the value of elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Enter the element you want to find: ");
        int element = input.nextInt();
        int position = -1;
        // find the position of element in array
        // we use -1 as the default value of position, and if the element is not found, we will not change the value of position
        // if the element is found, we will change the value of position, and the value of position will be the position of element
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                position = i;
                break;
            }
        }
        if (position == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at position " + position);
        }
        
    }
}
