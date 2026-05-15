public class recurFib {
    public static void main(String[] args){
        int n =3;
        System.out.println(Rfib(n));
        System.out.println(fib(n));
    }
    public static int Rfib(int n){
        if(n<=1){
            return n;
        }
        return Rfib(n-1)+Rfib(n-2);
    }
    //without recur
    public static int fib(int n ){
        if(n==0){
            return 0;
        }
        int prev1=0;
        int prev=1;
        for(int i=2;i<=n;i++){
            int curr= prev+prev1;
            System.out.print(curr+" ");
            prev1=prev;
            prev=curr;
        }
        return prev;
    }
}
