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

public class delk {

    public static Node convert(int[] arr){
        Node head = new Node(arr[0]);
        Node mover= head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next= temp;
            mover=temp;
        }
        return head;
    }

    public static Node delete(Node head, int k){
        if(head==null) return head;
        if(k==1){
            head=head.next;
            return head;
        }
        int count=0;
        Node prev=null;
        Node temp= head;
        while(temp!=null){
            count++;
            if(count==k){
                prev.next= prev.next.next;
                break;
            }
            prev=temp;
            temp=head.next;
        }
        return head;

    }
    public static Node deletel(Node head,int el){
        if(head==null) return head;
        if(head.data==el){
            head=head.next;
            return head;
        }
        Node prev= null;
        Node temp= head;
        while(temp!=null){
            if(temp.data==el){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }

    // public static void  deletewihouthead(Node el){
    //     el.data= el.next.data;
    //     el.next=el.next.next;

    // }

    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int k=3;
        // Node el=3;
        Node head=convert(arr);
        Node del= delete(head,k);
        // Node del= deletewihouthead(el);
        // Node del= deletel(head,el);
        Node temp = del;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
