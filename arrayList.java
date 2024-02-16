import java.util.ArrayList;

public class arrayList {
  public static void main(String[] args){
    int count=0;
    ArrayList <Integer> a = new ArrayList<>();
    a.add(1);
    a.add(2);
    a.add(3);
    for(Integer i: a){
      if(a.contains(i+1 )){
        count++;
      }
    }
    System.out.println(count);   
  }
}
    
