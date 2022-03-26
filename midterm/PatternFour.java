
public class PatternFour {
 public static void main(String[] args) {
        /** 
        1 2 3 4 5 6
        # 1 2 3 4 5 
        # # 1 2 3 4 
        # # # 1 2 3 
        # # # # 1 2 
        # # # # # 1      
        **/
       
/**
 
          - create the first loop that iterates through the numbers 1 to 6, this iteration it decreases by 1
          - inside the loop, create a loop that iterates through the numbers 1 to 6 minus to the first current number, this iteration in increments of 1 then print a two spaces
          - inside the loop, create a second loop that iterates through 1 to first loop current number, it increases by 1 then print the number with a single space
          - after the looping of the first loop, print a new line
 
*/

        for (int i=6; i>=1; i--){
          for (int j=1; j<=6-i; j++){
            System.out.print("  ");
          }
          for(int j=1; j<=i;j++){
            
            System.out.print(j+" ");            
          }
       System.out.println();
      }
 }   
}
