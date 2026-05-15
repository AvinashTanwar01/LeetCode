import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }

    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class detectloop {

     public static Node convert(int[] arr){
        Node head= new Node(arr[0]);
        Node prev=head;
        for(int i=1;i<arr.length;i++){
            Node temp= new Node(arr[i]);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }

    public static Boolean search(Node head){
        Node temp= head;
        Map<Node,Integer> Nodemap= new HashMap<>();
        while(temp!=null){
            if(Nodemap.containsKey(temp)){
                return true;
            }
            Nodemap.put(temp,1);
            temp=temp.next;
        }
        return false;
    }

    public static Boolean searchoptimal(Node head){
        Node temp=head;
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
        
    }

    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        Node head= convert(arr);
        // System.out.println(search(head));
        System.out.println(searchoptimal(head));
        // while(head!=null){
        //     System.out.print(head.data+" ");
        //     head=head.next;
        // }
    }
}
