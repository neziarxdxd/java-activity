public class PatterTwo {
    public static void main(String[] args) {
        /** 
        
        print the pattern
        1 2 3 4 5 6
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
        
        - create the first loop that iterates through the numbers 6 to 1, this iteration it decreases by 1
        - inside the loop, create a loop that iterates through the numbers 1 to the first current number, this iteration in increments of 1 then print a  number with a space then print new line after the first loop
        **/

        for(int i=6;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
        
    }
    
}
