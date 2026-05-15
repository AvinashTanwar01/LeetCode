import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        // int low=0;
        // int high = s.length()-1;
        // while(low<=high){
        //     if(s.charAt(low)==s.charAt(high)){
        //         low++;
        //         high--;
        //     }else{
        //         System.out.println("No palindrome");
        //         return;
        //     }
        // }
        // System.out.println("It is plaindrome");
        System.out.println(builder(s));
    }

    public static boolean builder(String s){
        s= s.toLowerCase();
        StringBuilder check= new StringBuilder(s);
        String rev= check.reverse().toString();
        if(s.equals(rev)){
            return  true;
        }
        return false;
    }
}
