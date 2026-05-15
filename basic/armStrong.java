public class armStrong {
    public static void main(String[] args){
        int a=371;
        int sum=0;
        int dup=a;
        while(a>0){
            int lastD=a%10;
            sum += lastD*lastD*lastD;
            a=a/10;
        }
        if(sum == dup){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
