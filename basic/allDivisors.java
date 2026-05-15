import java.util.*;
public class allDivisors {
    public static void main(String[] args) {
        int n = 6;
        int[] result = divisors(n);
        System.out.println(Arrays.toString(result));
    }
    public static int[] divisors(int n){
        List<Integer> list = new ArrayList<>();
        for(int i =1;i<=n;i++){
            if(n%i==0){
                list.add(i);
            }
        }
        int[] result = new int[list.size()];
        for(int i =0;i<list.size();i++){
            result[i]= list.get(i);
        }
        return result;
    }
}
