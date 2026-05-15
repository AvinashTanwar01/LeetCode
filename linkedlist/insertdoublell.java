
class Node {

    int data;
    Node next;
    Node prev;

    Node(int data1, Node next1, Node prev1) {
        this.data = data1;
        this.next = next1;
        this.prev = prev1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.prev = null;
    }
}

public class insertdoublell {

    public static Node convert(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            prev.next = temp;
            temp.prev = prev;
            prev = temp;
        }
        return head;
    }

    public static Node inserth(Node head, int val) {
        Node newh = new Node(val, head, null);
        head.prev = newh;
        return newh;
    }

    public static Node insertah(Node head, int val) {
        if (head == null) {
            return new Node(val);
        }
        Node temp = head;
        Node newh = new Node(val, temp.next, temp);
        if (temp.next != null) {
            temp.next.prev = newh;
        }
        temp.next = newh;
        return head;
    }

    public static Node insertbk(Node head, int k, int val) {
        if (head == null) {
            return null;
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == k) {
                break;
            }
            temp = temp.next;
        }
        Node back = temp.prev;
        Node newele = new Node(val, temp, back);
        temp.prev = newele;
        back.next = newele;
        return head;
    }

    public static Node insertbt(Node head, int val) {
        if (head.next == null) {
            return inserth(head, val);
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node back = temp.prev;
        Node newele = new Node(val, temp, back);
        back.next = newele;
        temp.prev = newele;
        return head;
    }

    public static Node insertanode(Node head, int node, int val) {
        if (head == null) {
            return null;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.data == node) {
                break;
            }
            temp = temp.next;
        }
        Node back = temp.prev;
        Node newele = new Node(val, temp, back);
        back.next = newele;
        temp.prev = newele;
        return head;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = convert(arr);
        // head= insertah(head,11);
        // head= insertbt(head,11);
        // head= insertbk(head,4,10);
        head = insertanode(head, 4, 10);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}
