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
   if(nthDayOfChristmas != 1 && nthDayOfChristmas !=2 && nthDayOfChristmas !=3 && nthDayOfChristmas <= 12)
   {
   System.out.println("On the " + nthDayOfChristmas + "th day of Christmas, my true love sent to me,"); 
   }
   if(nthDayOfChristmas > 12)
   {
   System.out.println("Bad news!"); 
   }
   
   switch (nthDayOfChristmas) {
        case 12:
            System.out.println("12 drummers drumming,");
        case 11:
            System.out.println("11 pipers piping,");
        case 10:
            System.out.println("10 lords-a-leaping,");
        case 9:
            System.out.println("9 ladies dancing,");
        case 8:
            System.out.println("8 maids-a-milking,");
        case 7:
            System.out.println("7 swans-a-swimming,");
        case 6:
            System.out.println("6 geese-a-laying,");
        case 5:
            System.out.println("5 golden rings,");
        case 4:
            System.out.println("4 calling birds,");
        case 3:
            System.out.println("3 french hens,");
        case 2:
            System.out.println("2 turtle doves,");
        case 1:
            System.out.println("And a partridge in a pear tree!");
            break;
        default:
            System.out.println("There are only 12 days of Christmas!");
            break;
    }
}
}