import java.util.Stack;

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data1,Node next1, Node prev1){
        this.data=data1;
        this.next= next1;
        this.prev= prev1;
    }

    Node(int data1){
        this.data=data1;
        this.next=null;
        this.prev=null;
    }
}



public class reversedll {

    public static Node convert(int[] arr){
        Node head= new Node(arr[0]);
        Node prev= head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            prev.next=temp;
            temp.prev= prev;
            prev=temp;
        }
        return head;
    }

    public static Node reversebrute(Node head){
        Node temp=head;
        Stack<Integer> st= new Stack<>();
        while(temp!=null){
            st.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            temp.data=st.peek();
            st.pop();
            temp=temp.next;
        }
        return head;

    }

    public static Node reverseoptimal(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node back= null;
        Node temp=head;
        while(temp!=null){
            back= temp.prev;
            temp.prev=temp.next;
            temp.next=back; 

            temp=temp.prev;
        }
        return back.prev;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        Node head= convert(arr);
        // head= reversebrute(head);
        head=reverseoptimal(head);
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
