import java.util.*;
public class anagram {
    
    static boolean isAnagram(String s1, String s2){
        boolean flag = true;
        Map <Character, Integer> map = new HashMap<>();
        char c = s1.charAt(0);
        for(int i=0; i<s1.length(); i++){
            c = s1.charAt(i);
            if(map.containsKey((c))){
                int frequency = map.get(c);
                map.put(c, frequency+1);
            }else{
                map.put(c, 1);
            }
        }
        for(int i=0;  i<s2.length(); i++){
            c = s2.charAt(i);
            if(map.containsKey((c))){
                int frequency = map.get(c);
                map.put(c, frequency-1);
            }else{
                flag = false;
                return flag;
            }
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() != 0){
                flag = false;
            }
        }
        return flag;
    }
    
    public static void main(String[] args){
        String str1 = "anne";
        String str2 = "enna";
        boolean x = isAnagram(str1, str2);
        if(x){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }

    }
}
