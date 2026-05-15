// // ...existing code...
// class queue {
//     int size = 10;
//     int[] arr = new int[size];
//     int start = -1, end = -1;
//     int currSize = 0;

//     void push(int x){
//         if(currSize==size){
//             System.out.println("Queue is full");
//             return;
//         }
//         if(currSize==0){
//             start=0;
//             end=0;
//             arr[end]=x;
//             currSize++;
//         }
//         end=(end+1)%size;
//         arr[end]=x;
//         currSize++;
//     }
//     int pop(){
//         if(currSize==0){
//             System.out.println("Queue is Empty");
//         }
//         int val=arr[start];
//         if(currSize==1){
//             start=-1;
//             end=-1;
//             currSize=0;
//         }else{
//             start=(start+1)% size;
//             currSize--;
//         }
//         return val;
//     }
//     int peek(){
//         if(currSize==0){
//             System.out.println("Queue is empty");
//         }
//         return arr[start];
//     }
//     int size(){
//         if(currSize==0){
//             return -1;
//         }
//         return currSize;
//     }
// }

// public class queueusingarrat {
//     public static void main(String[] args) {
//         queue q = new queue();
//         q.push(6);
//         q.push(10);
//         q.push(12);

//         System.out.println(q.peek());
//         System.out.println(q.pop());
//         System.out.println(q.size());
//         System.out.println(q.peek());
//         System.out.println(q.pop());
//         System.out.println(q.size());

//     }
// }
class queue {
    int size = 10;
    int[] arr = new int[size];
    int start = -1, end = -1;
    int currSize = 0;

    void push(int x) {
        if (currSize == size) {
            System.out.println("Queue is full");
            return;
        }
        if (currSize == 0) {
            start = 0;
            end = 0;
            arr[end] = x;
            currSize = 1;
            return;
        }
        end = (end + 1) % size;
        arr[end] = x;
        currSize++;
    }

    int pop() {
        if (currSize == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int val = arr[start];
        if (currSize == 1) {
            start = -1;
            end = -1;
            currSize = 0;
        } else {
            start = (start + 1) % size;
            currSize--;
        }
        return val;
    }

    int peek() {
        if (currSize == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[start];
    }

    int size() {
        return currSize;
    }

    boolean isEmpty() {
        return currSize == 0;
    }
}

public class queueusingarrat {
    public static void main(String[] args) {
        queue q = new queue();
        q.push(6);
        q.push(10);
        q.push(12);

        System.out.println(q.peek());   // 6
        System.out.println(q.pop());    // 6
        System.out.println(q.size());   // 2
        System.out.println(q.peek());   // 10
        System.out.println(q.pop());    // 10
        System.out.println(q.size());   // 1
        System.out.println(q.pop());    // 12
        System.out.println(q.pop());    // prints "Queue is empty" and returns -1
    }
}