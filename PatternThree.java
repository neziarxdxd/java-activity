public class PatternThree {
    public static void main(String[] args) {
        /**
        print the pattern 
        6 5 4 3 2 1
        6 5 4 3 2 1
        6 5 4 3 2 1
        6 5 4 3 2 1
        6 5 4 3 2 1
        6 5 4 3 2 1
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
