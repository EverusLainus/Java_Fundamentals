import java.util.*;

public class a {
    public static void ModifiedArrayList(int[] arr, int K){
    //Write your code here
    ArrayList<Integer> a = new ArrayList<>();
    for(int i=0;i<arr.length; i++){
      
        if(i%2 ==0){
          a.add(arr[i]);
          int p = arr[i]*K;
          a.add(i+1, p);
        }else{
          a.add(arr[i]);
          int add = arr[i]+K;
          a.add(i+1,add );
        }
    }
    }
    public static void main(String[] args){
        int arr[] ={2, 4, 6, 10};
        ModifiedArrayList(arr, 3);
    }
    
}
