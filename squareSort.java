import java.util.*;
import java.io.*;
public class squareSort{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    
    public static void bubbleSquare(int a[], int k){
        for(int i=0; i<(k-1); i++){
            for(int j=0 ; j<(k-i-1) ; j++){
                //System.out.println(i+" "+j);
                if( (a[j]*a[j])  > (a[j+1] * a[j+1]) ){
                    int temp = a[j];
                    a[j]= a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted Using Bubble Sort: ");
        for(int x: a){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    
 public static void selectionSquare (int a[], int k){
        for(int i=0; i<(k-1); i++){
            int min_idx =i;
            for(int j= i+1 ; j< k ; j++){
                //System.out.println(i+" "+j);
                if( (a[i]*a[i])  > (a[j] * a[j]) ){
                    min_idx = j;
                }
                int temp = a[min_idx];
                a[min_idx]= a[i];
                a[i] = temp;
            }
        }
        System.out.print("Sorted Using Selection Sort: ");
        for(int x: a){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try {
            FastReader sc=new FastReader();
                int tc = sc.nextInt();
                for(int m=0; m<tc; m++){
                    int n = sc.nextInt();
                    int a[] = new int[n];
                    for(int l=0; l<n; l++){
                        a[l] = sc.nextInt();
                    }
                    bubbleSquare(a,  n);
                    selectionSquare(a, n);
                }
        }
        catch (Exception e) {
            e.printStackTrace() ;
            return;
        }
    }
}