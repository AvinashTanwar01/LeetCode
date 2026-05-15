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

public class deletedoublell {

    public static Node convert(int[] arr){
        Node head= new Node(arr[0]);
        Node prev= head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next=temp;
            temp.prev = prev;
            prev=temp;
        }
        return head;
    }

    public static Node delhead(Node head){
        if(head==null || head.next==null) return null;
        Node temp= head;
        head=head.next;

        head.prev=null;
        temp.next=null;
        return head;
    }

    public static Node deltail(Node head){
        if(head.next== null || head==null){
            return null;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node back = temp.prev;
        back.next=null;
        temp.prev=null;

        return head;
    }
    public static Node kth(Node head,int k){
        if(head==null) return null;
        int count=0;
        Node knode= head;
        while(knode!=null){
            count++;
            if(count==k) break;
            knode=knode.next;
        }
        Node back= knode.prev;
        Node front=knode.next;
        if(back ==null && front==null){
            return null;
        }else if(back==null){
            Node temp= head;
            head=head.next;
            head.prev=null;
            temp.next=null;
            return head;
        }else if(front==null){
            // Node tail= head;
            // while(tail!=null){
            //     tail=tail.next;
            // }
            // Node backt=tail.prev;
            // back.next=null;
            // tail.prev=null;
            back.next=null;
            knode.prev=null;
            return head;
        }
        back.next=front;
        front.prev=back;
        knode.next=null;
        knode.prev=null;
        return head; 
    }

    public static Node ele(Node head,int ele){
        Node temp=head;

        while(temp!=null && temp.data!=ele){
            temp=temp.next;
        }
        Node front= temp.next;
        Node back= temp.prev;

        if(front==null){
            back.next=null;
            temp.prev=null;
            return head;
        }

        back.next=front;
        front.prev=back;
        temp.next=temp.prev=null;
        return head;
    }

    public static void main(String[] args){
    int[] arr= {1,2,3,4,5,7};
    Node head = convert(arr);

    // head = delhead(head);      // Delete head
    // head = deltail(head);      // Delete tail
    // head= kth(head,3);
    head= ele(head,3);

    Node temp = head;
    while(temp != null){
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
}
}
