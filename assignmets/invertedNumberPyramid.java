/*
Write a program to print an inverted number pyramid pattern. The size of the pyramid should be taken as input from the user.
*/

public class invertedNumberPyramid {
    public static void main(String[] args){
      int n=5;
      for(int i=1; i<=n; i++){
        for(int j=1; j<=(i-1);j++){
          System.out.print(" ");
        }
        for(int k=(n-i+1); k>0;k--){
          System.out.print(k);
        }
        System.out.println();
      }
    
    }
  }