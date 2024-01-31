package Java_Fundamentals;
/*
 * Problem: Write a program to find factorial of a number
 * 
 * facotial is defined for zero and postive integers.
 * 0! = 1
 * n! = 1 * 2 * 3 * ... * n
 */

public class factorial {
    public static void main(String[] args){
        float n = 4;
        
        if(n%1 == 0 && n > 0){
            int n_factorial = 1;
            int counter = 1;
            while(counter <= n){
                n_factorial = n_factorial * counter;
                counter++;
            }
            System.out.print("Facotial is " + n_factorial );
        }
        else if(n == 0){
            System.out.println("Factorial is " + 1);
        }
        else{
            System.out.println("Factorial is not defined");
        }

    }
    
}
