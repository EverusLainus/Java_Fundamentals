
/**
 * Virat and Rohit don't like each other though they have many similarities. 
 * You are given 2 texts (strings) written by Virat and Rohit. Your task is to 
 * write a program that calculates the length of the longest similar characters
 *  in the text written by both.

If the string written by Virat is “AGGTAB” and that by Rohit is “GXTXAYB”, then 
the longest set of similar characters is “GTAB”, which is of length 4.

Please note that the longest set of similar characters need not be continuous.

Input Format: The first line contains text/string written by Virat. The second line
 contains text/string written by Rohit. 

Sample Input: AEDFHR ABCDGH

Sample Output: 3

//edge cases:
- empty string - 0
- assuse : uppercase letter
- char can be repeating

 */
//time complexity = O(Max(n, m))
 import java.util.*;

 class similarChar{
    public static void longestSimilarChar(String str1, String str2){
        HashMap <Character, Integer> similarChar = new HashMap<>();
        //AAEDFHR
        char ch = ' ';
        for(int i=0; i<str1.length(); i++){//n
            ch = str1.charAt(i);
            if(similarChar.containsKey(ch)){
                int k = similarChar.get(ch);
                similarChar.put(ch, k+1);
            }else{
                similarChar.put(ch, 1);
            }
        }
        int count = 0;//2
        //AAEDF
        for(int i=0; i<str2.length(); i++){//m
            ch = str2.charAt(i);
            if(similarChar.containsKey(ch)){
                count++;
                int k = similarChar.get(ch);
                if(k== 1){
                    similarChar.remove(ch);
                }else{
                    similarChar.put(ch, k-1);
                } 
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args){
        // AEDFHR ABCDGH
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        longestSimilarChar( str1, str2);
    }
 }
