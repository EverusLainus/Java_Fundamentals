package ll;

import org.w3c.dom.Node;

public class addOne {

      class Node{
        int data;
        Node next;
        
        Node(int data){
        this.data = data;
        this.next = null;
        }
      }

      public Node reverse(Node head) {
        Node pre = null;
        Node cur = head;
        Node nex = null;
        while (cur != null) {
            nex = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nex;
        }
        head = pre;
        return head;
    }


    public Node addOneToLinkedList(Node head) {

        // write your code here.
        Node end = reverse(head);

        while (end != null) {
            System.out.println("end not null" + " " + end.data);
            if (end.data != 9) {
                end.data++;
                break;
            } else {
                end.data = 0;

                if (end.next == null) {
                    System.out.println("next is null");
                    Node new_node = new Node(1);
                    end.next = new_node;

                } else {
                    System.out.println("move next");
                    end = end.next;
                }
            }
        }
        return end.next;
    }

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
