import java.util.Scanner;
public class TwelveDays
{
public static void main(String[] args)
{
   int nthDayOfChristmas;
   Scanner christmasDay = new Scanner(System.in);
   System.out.println("Enter a day of Christmas (1-12), and I will sing you a song.");
   nthDayOfChristmas = christmasDay.nextInt();
   
   if(nthDayOfChristmas == 1)
   {
   System.out.println("On the " + nthDayOfChristmas + "st day of Christmas, my true love sent to me,"); 
   }
   if(nthDayOfChristmas == 2)
   {
   System.out.println("On the " + nthDayOfChristmas + "nd day of Christmas, my true love sent to me,"); 
   }
   if(nthDayOfChristmas == 3)
   {
   System.out.println("On the " + nthDayOfChristmas + "rd day of Christmas, my true love sent to me,"); 
   }
   if(nthDayOfChristmas > 3 && nthDayOfChristmas <= 12)
   {
   System.out.println("On the " + nthDayOfChristmas + "th day of Christmas, my true love sent to me,"); 
   }
   if(nthDayOfChristmas > 12)
   {
   System.out.println("Bad news!"); 
   }
   
   switch (nthDayOfChristmas) {
        case 12:
            System.out.println("Twelve Drummers Drumming,");
        case 11:
            System.out.println("Eleven Pipers Piping,");
        case 10:
            System.out.println("Ten Lords-a-Leaping,");
        case 9:
            System.out.println("Nine Ladies Dancing,");
        case 8:
            System.out.println("Eight Maids-a-Milking,");
        case 7:
            System.out.println("Seven Swans-a-Swimming,");
        case 6:
            System.out.println("Six Geese-a-Laying,");
        case 5:
            System.out.println("Five Gold Rings,");
        case 4:
            System.out.println("Four Calling Birds,");
        case 3:
            System.out.println("Three French Hens,");
        case 2:
            System.out.println("Two Turtle Doves,");
        case 1:
            System.out.println("And a Partridge in a Pear Tree.");
            break;        
        default:
            System.out.println("There are only 12 days of Christmas!");
            break;
    }
}
}