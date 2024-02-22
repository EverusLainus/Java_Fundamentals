public class distinctCharSubstring {
    static String findDistinctCharSubstring(String s, int k){
        int start = 0; int end = 1;
        int maxWindowSize = 1; int maxWindowStart = 0;
        int countOfChar[];
        int noOfUniqueChar = 0;

        for(int i=0; i<s.length(); i++){          
            if(s[i]==0){
                noOfUniqueChar++;
                countOfChar[s[i]]++;
            }else{
                countOfChar[s[i]]++;
            }
            //check if the no of unique element is  greater than k
            if(noOfUniqueChar < k){
                System.out.println("not enough unique characters in the string");
                return null;
            }

            
        }
    }
    public static void main(String[] args){
        String givenString = "adcdeadbcadbcdes";
        int K = 5;
        String result = findDistinctCharSubstring(givenString, K);
    }
    
}
