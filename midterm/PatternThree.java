public class PatternThree {
    public static void main(String[] args) {
        /**
       - create the first loop that iterates through the numbers 1 to 6, this iteration it increases by 1 
       - inside the loop, create a loop that iterates through the numbers 6 to 1, this iteration in decrements by 1 then print a number with a single space if the number is less than the current number
       - else print a two spaces
       - after the looping of the first loop, print a new line
        **/
       


       for (int i=1;i<=6;i++){
           for(int j=6; j>=1;j--){
            if(j<=i){
                System.out.print(j+" ");
            }
            else
                System.out.print("  ");
            
           }
        System.out.println();
       }

    }
}
