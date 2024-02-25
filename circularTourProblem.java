import java.util.*;

public class circularTourProblem {

    public static void circularTour(int n, int[] gas, int[] cost) {
        int start =0;
        int remaining = 0;
        int value =0;
        for(int i=0; i<n; i++){
            value += gas[i]-cost[i];
            //System.out.println(value +"wiht star: "+start);
            if(value < 0){
                remaining += value;
                start =i+1;
                value =0;
            }
        }
        //System.out.println("remaining: "+remaining+" value"+value);
        if(remaining +value >=0){
            System.out.println(start);
        }else{
            System.out.println(-1);
        }      
    }

    public static void solve1(int n, int[] gas, int[] cost) {
        int start =0;
        int remaining = 0;
        int value =0;
        int total = 0;
        for(int i=0; i<n; i++){
            value = gas[i]-cost[i];
            //System.out.println(value +"wiht star: "+start);
            if(value < 0){
                remaining += value;
            }else{
                total += value;
            }
            if(total + remaining < 0){
                start = i+1;
            }
            System.out.println("toatl: "+total + " remaining : "+remaining +" statts "+start);
        }
       // System.out.println("toatl: "+total + " remaining : "+remaining );
       // System.out.println("remaining: "+remaining+" value"+value);
        if(total +remaining >=0){
            System.out.println(start);
        }else{
            System.out.println(-1);
        }
        
    }


    public static void main(String[] args){
        int[] gas = {    1, 2, 3, 4 ,5};
        int[] cost = {    3, 4, 5, 1 ,2};
        circularTour(5, gas, cost);
        solve1(5, gas, cost);
    }
    
}
/**
 * test cases:
 5
 1 2 3 4 5
 3 4 5 1 2
//output : 3

 5
 1 2 3 4 5 
 3 4 1 2 3
 //output  : 2
 */
