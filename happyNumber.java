
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
