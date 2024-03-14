/**
 * Write an algorithm to determine if a number n is happy. A happy number is a number defined by the following process:
Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.
Example 1: Input: n = 19 Output: true Explanation: 1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
 */
import java.util.*;
public class happyNumber  {
  static int squareOfdigits(int n){
      int sum = (n%10)* (n%10);
     while(n/10 != 0){
       n = n/10;
       sum += (n%10)*(n%10);
     }
    return sum;
  }
  
  public static void main(String[] args){
    int startingNumber = 0;
    Set <Integer> visitedNumbers = new HashSet<>();
    while(!visitedNumbers.contains(startingNumber)){
      visitedNumbers.add(startingNumber);
      startingNumber = squareOfdigits(startingNumber);
    }
    if(startingNumber == 1){
      System.out.println("true");
    }else{
      System.out.println("false");
    }

  }    
}
