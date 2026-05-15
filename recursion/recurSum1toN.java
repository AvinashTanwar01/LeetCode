//parametrized way
public class recurSum1toN{
    //n to 1 sum
    // public static void main(String[] args){
    //     int n =6;
    //     sum(n,0);
    // }
    // public static void sum(int i,int sum){
    //     if(i<1){
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum(i-1,sum+i);
    // }
    //1 to n sum
    public static void main(String[] args) {
        int n =2 ;
        sum(1,n,0);

    }
    public static void sum(int i, int n, int sum){
        if(i>n){
            System.out.println(sum);
            return; 
        }
        sum(i+1,n,sum+i);

    }
}
