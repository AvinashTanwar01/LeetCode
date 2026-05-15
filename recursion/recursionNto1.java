public class recursionNto1 {
    public static void main(String[] args) {
        int n =5;
        printN(1,n);
    }
    public static void printN(int i, int n){
        if(n<i){
            return;
        }
        printN(i+1,n);
        System.out.println(i);
    }
}
