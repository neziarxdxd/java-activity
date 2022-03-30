import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // check if the year is leap year

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        // To find the leap year, we need to check if the year is divisible by 4
        // if the year is divisible by 4, we need to check if the year is divisible by 100, if it is, we need to check if the year is divisible by 400, if it is, it is a leap year, otherwise it is not a leap year
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " is not a leap year");
                }
            } else {
                System.out.println(year + " is a leap year");
            }
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
