/*Greatest Common Divisor (GCD): Write a function named findGCD that takes two integers as input and returns their greatest common divisor (GCD). Use this function to find the GCD of two given numbers.

int gcdResult = findGCD(36, 48);
// Sample Output: gcdResult = 12
*/

public class gcd {
    static int  findGCD(int num1, int num2) {
      int num =0;
      if(num1<num2){
        num = num2;
      }else{
        num = num1;
      }
      int max =0;
      for(int i=1; i<=num; i++){
        if(num1%i ==0 && num2%i ==0){
          if(i>max){
            max = i;
          }       
        }
      }
      return max;
    }
  
    public static void main(String[] args) {
      int num1=36;
      int num2= 48;
      int max = findGCD(num1, num2);
        System.out.println(max);
    }
  }