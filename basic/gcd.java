public class gcd {
    public static void main(String[] args) {
        int a =4;
        int b=6;
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }else{
                b= b%a;
            }
        }
        if(a==0){
            System.out.println(b);
        }else{
            System.out.println(a);
        }
    }
}
