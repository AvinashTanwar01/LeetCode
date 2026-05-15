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

public class reverselinked {

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

    public static Node reverse1(Node head){
        Node temp=head;
        Node prev=null;
        Node front=null;
        while(temp!=null){
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }

    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        Node head= convert(arr);
        head=reverse1(head);
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
