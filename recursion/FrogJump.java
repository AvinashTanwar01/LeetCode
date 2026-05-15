import java.util.*;

public class FrogJump {
    public static void main(String[] args) {
        int[] heights= {10,20,30,40};
        int n =heights.length-1;
        int result = Recu(n,heights);
        System.out.println(result);
    }

    public static int Recu(int n,int[] heights){
        if(n==0) return 0;
        int left=0;
        int right=Integer.MAX_VALUE;
        left= Recu(n-1,heights)+Math.abs(heights[n]-heights[n-1]);
        if(n>1){
            right = Recu(n-2,heights)+Math.abs(heights[n]-heights[n-2]);
        }

        return Math.min(left, right);
    }
}