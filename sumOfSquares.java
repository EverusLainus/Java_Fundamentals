import java.util.HashMap;
import java.util.Map;

public class sumOfSquares {
    /*
    boolean flag = false;
    for(int i=0; i< Math.sqrt(k); i++){
        for(int j=i; j<Math.sqrt(k); j++){
            if(i*i + j*j == k){
                flag = true;
                break;
            }
        }
        if(flag){
            break;
        }
        
}
static boolean isPrime(long p){
    boolean flag = true;
    //int count =0;
    for(int i=2; i<p; i++){
        if(p%i == 0){
            flag = false;
            break;
        }
    }
    if(flag) return true;
    else return false;
}
public static void solve(long k){
    //An integer greater than one can be written as a sum of two squares
    //if and only if its prime decomposition contains no factor pk,
    //where prime p ≡ 3 ( mod 4 ) {\displaystyle p\equiv 3{\pmod {4}}} and k is odd.
    boolean flag = true;
    for(int i=2; i*i <k; i++){
        //System.out.println("i: "+i);
    //find the prime factors
        int primePower =0;
    
        if(k%i ==0){
            //System.out.println("i is prime ");
            while(k%i == 0){
                k /= i;
                primePower ++;
                //System.out.println("k becomes "+ k);
            }
            if(primePower %2 == 0 && i%4 != 3){
            flag = false;
            break;
            }
        }
    }
System.out.println(flag);
}
*/
/**
 * store squares of all numbers from 1 to sqrt(x) as key
 * check if any k-sqrt(x) is a key each time
 * @param k for the total sum
 */
public static void sumOfSquare(long k){
    boolean flag = false;
    Map <Integer, Integer> map = new HashMap<>();
    for(int i = 1; i < Math.sqrt(k); i++){
        map.put(i*i, 1);
        //System.out.println(k-(i*i));
        int  l = (int) k-(i*i);
        if(map.containsKey(l) ){
            flag = true;
            break;
        }
    }
    System.out.println(flag);
}

}
