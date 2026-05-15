public class recursion1toN {
    // public static void main(String[] args){
    //     int n =4;
    //     printN(1,n);

    // }
    // public static void printN(int i , int n ){
    //     if(i>n){
    //         return;
    //     }
    //     System.out.println(i);
    //     printN(i+1, n);
    // }

    //by backtracking
    public static void main(String[] args) {
        int n=4;
        backt(n,n);
    }
    public static void backt(int i,int n){
        if(i<1){
            return;
        }
        backt(i-1,n);
        System.out.println(i);

    }
}
