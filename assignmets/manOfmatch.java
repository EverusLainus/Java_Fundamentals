

public class manOfmatch {
    public static void solve(int n, int[] runs) {
        int A =0;
        int B = 0;
        A+= runs[0];
        int flag =1;
        
        for(int i=1; i<n*6; i++){
            //same is gonna play
            if(i%6 == 0 || runs[i-1]== 1 || runs[i-1]== 3){
                if(i%6 == 0 && runs[i-1] == 1 || runs[i-1]== 3){
                    if(flag ==1){ flag = 2;
                    }else{ flag =1;
                    }
                }
                if(flag ==1){
                    B += runs[i];
                    flag = 2;
                }else{
                      A += runs[i];
                      flag =1;
                }//System.out.println(i+ " "+flag);
            }else{
                if(flag == 1){
                    A+= runs[i];
                }else{
                    B += runs[i];
                }//System.out.println(i+ " "+flag);
            } //System.out.println(i+": A:"+A + "B "+B);
        }//System.out.println("A:"+A + "B"+B);
        if(A > B){
            System.out.println("AB de Villiers");
        }else if ( B > A){
            System.out.println("Virat Kohli");
        }else{
            System.out.println("Tie");
        }
    }
    
    public static void main(String[] args){
        for(int i)
    }
}
