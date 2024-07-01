public class main {
    public static boolean main(String[] args){
        int arr[]={ 1, 2, 3, 4, 5};
        int k = 2;
        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i]+ arr[j] == k){
                    return true;
                }
            }
        }
        return false;
    }  
}
