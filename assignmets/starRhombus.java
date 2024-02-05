/*
Write a program to print a diamond pattern using asterisks (\*) and spaces. The size of the diamond should be taken as input from the user.
*/
public class starRhombus {
    public static void main(String[] args) {
      int n=6;
      int x = (n/2)+1;
      for(int i=1;i<=x; i++){
        for(int j=1;j<=x-i;j++){
          System.out.print(" ");
        }//j for
        for(int j= (x-(i-1));j<=(x+(i-1));j++){
          System.out.print("*");
        }
        for(int j= (x-i);j<=n;j++){
          System.out.print(" ");
        }
        System.out.println();
        
      }//i for
      for(int i=1;i<x; i++){
        for(int j=1;j<=(i);j++){
          System.out.print(" ");
        }//j for
  
        for(int k=1; k<= (2*(x-i))-1; k++){
          System.out.print("*");
        }
        System.out.println();
      }
    }
  }