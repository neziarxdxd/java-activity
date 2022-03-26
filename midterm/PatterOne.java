public class PatterOne {
    public static void main(String[] args) {
        /** 
        - create the first loop that iterates through the numbers 1 to 6, this iteration it increases by 1
        - inside the loop, create a loop that iterates 1 to 6 increasing by 1 then print a number with a single space 
        - after the looping of the first loop, print a new line      
        **/
        for(int i=1;i<=6;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
