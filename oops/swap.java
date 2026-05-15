
public class swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        // Integer c =30;
        // Integer d =40;
        // c=10;
        // System.out.println(c);
        swap(a,b);
        System.out.println(a+" "+b);
        
    }

    public static void swap(int a , int b){
        int temp=a;
        a=b;
        b=temp;
        
    }
}
