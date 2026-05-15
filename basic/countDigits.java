import  java.util.*;
public class countDigits{
    public static void main(String[] args){
        int a=4478;
        // int count =0;
        // while(a>0){
        //     count = count+1;
        //     a=a/10;
        // }
        
        //2nd method
        int count = (int)(Math.log10(a)+1);
        System.out.println(count);
    }
}