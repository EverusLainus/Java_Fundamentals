

public class substringC {


    long countSubstrings(String s, char c) {
        long count =0;
        long factorial =0;
        char a = ' ';
        
        for(int i=0; i<s.length(); i++){
            a = s.charAt(i);
            if( a == c){
                count++;
                factorial = factorial + count;
            }
        }
        return factorial;
    }

    
    
}
