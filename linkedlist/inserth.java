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

public class inserth{
    public static Node convert(int[] arr){
        Node head= new Node(arr[0]);
        Node mover= head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next= temp;
            mover=temp;
        }
        return head;

    }

    public static Node insert(Node head, int val){
        Node temp= new Node(val,head);
        return temp;
    }

    public static Node insertt(Node head, int val){
        if(head==null){
            return new Node(val,head);
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node newNode= new Node(val);
        temp.next= newNode;
        return head;
    }

    public static Node insertk(Node head,int val, int k){
        if(head==null){
            if(k==1) return new Node(val,head);
        }
        if(k==1){
            return new Node(val,head);
        }
        int count=0;
        Node temp= head;
        while(temp!=null){
            count++;
            if(count==(k-1)){
            Node x= new Node(val,temp.next);
            temp.next=x;
            }
            temp=temp.next;
        }
        return head;
    }
    public static Node insertbeforeval(Node head,int val, int valN){
        if(head==null){
            return null;
        }
        if(head.data==valN){
            return new Node(val,head);
        }

        Node temp= head;
        while(temp.next!=null){

            if(temp.data==valN){
            Node x= new Node(val,temp.next);
            temp.next=x;
            }
            temp=temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int val=5,k=2,valN=2;
        Node head=convert(arr);
        Node add= insert(head,val);
        Node tail= insertt(head,val);
        Node kth= insertk(head,val,k);
        Node vali=insertbeforeval(head,val,valN);
        Node temp = vali;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
    }
}