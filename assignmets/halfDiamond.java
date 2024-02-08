/*
Write a program to print a half diamond pattern using asterisks (\*) and spaces. The size of the diamond should be taken as input from the user.
*/

public class halfDiamond {

    public static void main(String[] args){
      int n=6;
      for(int i=1;i<=n; i++){
        for(int j=1; j<=i; j++){
          System.out.print("*");
        }
        System.out.println();
      }
      for(int i = 1; i<= n-1; i++){
        for(int j=1; j<=(n-i); j++){
          System.out.print("*");
        }
        System.out.println();
      }
      
    }
}
    

