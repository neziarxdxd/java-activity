
public class MultiplicationTable {
    public static void main(String[] args) {
        /**
    Multiplication Table
    Steps to complete the application:
    - Create a loop that iterates through the numbers 1 to 9
    - Inside the loop, create a loop that iterates through the numbers 1 to 9
    - Inside the inner loop, multiply the two numbers and display the result
    - Display like a multiplication table by formatting the output to be nicely aligned using the String.format method

        **/
        System.out.format("            "); 
        System.out.println("Multiplication Table");
        System.out.format("      ");
        for(int i = 1; i<=9;i++ ) {
            System.out.format("%4d",i);
        }
        System.out.println();
        System.out.println("------------------------------------------");
         
        for(int i = 1 ;i<=9;i++) {
            // print left most column first
            System.out.format("%4d |",i);
            for(int j=1;j<=9;j++) {
                System.out.format("%4d",i*j);
            }
            System.out.println();
        }}
}
