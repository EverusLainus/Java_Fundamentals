/*
Develop a program to create a hollow right triangle pattern with asterisks (\*) and spaces. The triangle's size is based on user input.
*/

public class hollowRightTriangle {
    public static void main(String[] args){
      int n =5;
      for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
          if(j==1 || j==i || i==n){
            System.out.print("*");
          }else{
            System.out.print(" ");
          }
          
        }
        System.out.println();
      }
      
    }
  }
