
class Node {

    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class merge2sorted {

    public static void main(String[] args) {
 
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        Node head1 = createList(arr1);
        Node head2 = createList(arr2);

        Node merged = merge(head1, head2);


        Node temp = merged;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node createList(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new Node(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    public static Node merge(Node head1, Node head2) {
        Node t1 = head1, t2 = head2;
        Node dnode = new Node(-1);
        Node temp = dnode;
        while (t1 != null && t2 != null) {
            if (t1.data < t2.data) {
                temp.next = t1;
                t1 = t1.next;
            } else {
                temp.next = t2;
                t2 = t2.next;
            }
            temp = temp.next;
        }
        if (t1 != null) {
            temp.next = t1;
        } else {
            temp.next = t2;
        }
        return dnode.next;
    }
}
