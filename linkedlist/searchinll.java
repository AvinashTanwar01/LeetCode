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



public class searchinll {

    public static Node convert2ll(int[] arr){
        Node head= new Node(arr[0]);
        Node mover=head;
        for(int i=0;i<arr.length;i++){
            Node temp= new Node(arr[i]);
            mover.next=temp;
        }
        return head;
    }

    public static int search(Node head,int val){
        Node temp=head;
        while(temp!=null){
            if(temp.data==val){
                return 1;
            }
            temp=temp.next;
        }
        return 0;
    }
    public static void main(String[] args){
        int[] arr= {1,10,3,40};
        int val=40;
        Node head= convert2ll(arr);
        int check = search(head,val);
        System.out.println(check);

    }
}
