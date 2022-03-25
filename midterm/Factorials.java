public class Factorials {
    public static void main(String[] args) {
        /**
          Write an application that displays the factorial for every integer value from 1 to 16. A factorial of a number is the 
product of that number multiplied by each positive integer lower than it. For example, 4 factorial is 4 * 3 * 2 * 1, or 
24. Save the file as Factorials.java.
         **/


         // print  4 factorial is 4 * 3 * 2 * 1, or 24.
        for (int i = 1; i <= 16; i++) {
            long factorial = 1;
            for (long j = 1; j <= i; j++) {
                factorial *= j;
            }

            System.out.println(i + " factorial is " + factorial);

        }
    }
}
