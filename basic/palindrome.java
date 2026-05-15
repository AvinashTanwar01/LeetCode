public class palindrome {
    public static void main(String[] args) {
        int n=121;
        boolean  a= palindrome(n);
        System.out.println(a);
    }
    public static boolean  palindrome(int n){
        int dup = n;
        int revN=0;
        while(n>0){
            int lastD= n%10;
            n = n/10;
            revN= (revN*10)+lastD;
        }
        if(revN==dup){
            return true;
        }else{
            return false;
        }
    }
}
