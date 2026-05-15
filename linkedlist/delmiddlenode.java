
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
public class delmiddlenode {

    public static Node convert(int[] arr){
        Node head= new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp= new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }

    public static Node optimal(Node head){
        // Node temp=head;
        Node slow=head;
        Node fast=head;
        Node temp=head;
        while(fast!=null && fast.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=slow.next;
        return head;
        


    }

    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        Node head= convert(arr);
        head=optimal(head);
        // System.out.println(head.data);
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
