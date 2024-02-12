public class spiderman {
//i to i+`1, ... i+K`
static int findMin(int K, int N, int[] heights){
    
    int min[] = new int[N];
    min[0]=0;
    for(int i=1; i< N  ; i++){
        
       
        int m = Integer.MAX_VALUE;
       for(int j=i-1; j>=i-K && j>=0 ;j-- ){
           //System.out.println("i: "+i+"j: "+j);
           int a =Math.abs(heights[i] - heights[j]) + min[j];
           if(a < m){
               m=a;
           }
       }
       min[i]= m;
    }
    for(int k=0; k<N; k++){
        //System.out.println(min[k]);
    }
    
    return min[N-1];
    
}

public static void solve(int N, int K, int[] heights) {
    
    int min = findMin(K, N, heights);
    System.out.println(min);
       
}
public static void main(String[] args){
    int heights[]={ 1, 3, 7, 8, 1};
    solve(5, 3, heights);
}
}