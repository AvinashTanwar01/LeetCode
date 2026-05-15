class Node{
    int data;
    Node prev;
    Node next;

    Node(int data1,Node next1,Node prev1){
        this.data=data1;
        this.next=next1;
        this.prev=prev1;    
    }
    Node(int data1){
        this.data=data1;    
        this.next=null;    
        this.prev=null;    
    }
}

public class doublell {

    public static Node convert(int[] arr){
        Node head= new Node(arr[0]);
        Node prev= head;
        for(int i=1;i<arr.length;i++){
            Node temp= new Node(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }

    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        Node head= convert(arr);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
}
