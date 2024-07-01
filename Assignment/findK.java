/**
 * Use REACTO framework to explain the following question :

You are given n different numbers and an integer k. 
Write a program that finds number of times k is present in log(n) time complexity.
///edge case
1. if no such k - -1

//approach:
for loop to go through indices of array and check if the value is k
if value is call increment the counter

//assume array is sorted
input
6 3
2 3 3 3 6 9

output
3
 */
import java.util.*;


public class findK {
    public static int l_binary_search(int a[], int l, int r, int k){
        int count = -1;
        while(l < r){
            int m = (l+r)/2;
            if(a[m] == k){
                count = m;
                r = m-1;
            }else if(a[m] < k){
                count = m;
                l = m+1;
            }else{//a[m]>k 
                r = m-1;
            }
        }
        return count;
    }
    public static int binary_search(int a[], int l, int r, int k){
        int count = -1;
        while(l < r){
            int m = (l+r)/2;
            if(a[m] == k){
                count = m;
                l = m+1;
            }else if(a[m] < k){
                l = m+1;
            }else{
                count = m;
                r = m-1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int idx = binary_search(a, 0, n-1, k);
        int l_idx = l_binary_search(a, 0, n-1, k);
        System.out.println(idx+" "+l_idx);
    }
}
