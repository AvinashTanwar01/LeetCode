class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}

public class startloop {

    public static Node convert(int[] arr){
        Node head= new Node(arr[0]);
        Node mover= head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    public static Node loops(Node head){
        Node slow=head,fast=head;
        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                int c=findlength(slow,fast);//for finding loop length
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static int findlength(Node slow,Node fast){
        int count=1;
        fast=fast.next;
        while(slow!=fast){
            count++;
            fast=fast.next;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        Node head=  convert(arr);
        head=loops(head); 
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }  
    }
}
