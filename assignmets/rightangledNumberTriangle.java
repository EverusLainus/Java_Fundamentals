/*
Write a program to print a right triangle pattern using numbers. The size of the triangle should be taken as input from the user.
*/

public class rightangledNumberTriangle {
    public static void main(String[] args) {
        int num =5;
        for(int i=1; i<=num; i++){
          for(int j=1; j<=i; j++){
            System.out.print(j);
          }
          System.out.println();
        }
    
      }
}
