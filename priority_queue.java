
import java.util.*;
import java.io.*;
   
public class priority_queue {
   
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<3;i++){
            pq.add(2-i);
          //  pq.add(1);
        }
        System.out.println(pq);
    }
}
    

