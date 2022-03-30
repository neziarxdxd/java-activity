import java.util.Scanner;

public class OccursTimes {
    public static void main(String[] args) {
        
        /**
            Machine Problem no. 6
            Example output
            Enter numbers separated by a space: 44 44 78 44 100 1 1 1 100 44 55 0
            1 occurs 3 times
            44 occurs 4 times
            55 occurs 1 time
            78 occurs 1 time
            100 occurs 2 times
        **/

        Scanner input = new Scanner(System.in);
        int [] num = new int[200]; 
        int [] count = new int[200];
        //Declare counter variable i
        //and temp variable that will
        //temporarily hold the value
        //at a certain index of num[] array
        int i,temp = 0;
        System.out.println("Enter the integers between 1 and 100: ");

        //Initialize num[] array with user input
        for(i=0; i < num.length; i++){
            num[i] = input.nextInt();
            //expected input will end when user enters zero
            if(num[i] == 0){
                break;
            }
        }//end of for loop

        //value at a given index of num array 
        //will be stored in temp variable
        //temp variable will act as an index value
        //for count array and keep track of number
        //of occurences of each number
        for(i = 0; i < num.length; i++){
                temp = num[i];
                count[temp]++;
            }//end of for looop

        for(i=1; i < count.length; i++){

            if(count[i] > 0 && count[i] == 1){
                System.out.println(i + " occurs " + count[i] + " times");
             }
            else if(count[i] >=2){
               System.out.println(i + " occurs " + count[i] + " times");
            }


         }
        



    }
}
