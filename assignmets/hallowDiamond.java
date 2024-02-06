/*
Write a program to print a hollow diamond pattern using asterisks (\*) and spaces. The size of the diamond should be taken as input from the user.
*/

public class hallowDiamond {
  public static void main(String[] args){
    int n = 5;
    for(int i=1; i<=n; i++){
      for(int j=1; j<= n-i; j++){
        System.out.print(" ");
      }
      for(int k=1; k<(2*i); k++){
        if(k==1 || k==(2*i)-1){
          //System.out.println(" j :"+j);
          System.out.print("*");
        }
        else{
          System.out.print("_");
        }
      }
      System.out.println();
    }
    for(int i=1; i<n; i++){
      for(int j=1; j<=i; j++){
        System.out.print(" ");
      }
      for(int k=1; k<((2*(n-i))); k++){
        if(k==1 || k==((2*(n-i))-1)){
          System.out.print("*");
        }else{
          System.out.print("_");
        }
      }
      System.out.println();
    }
  }
}