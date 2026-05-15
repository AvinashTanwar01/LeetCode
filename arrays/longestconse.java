
import java.util.*;

public class longestconse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println(brute(arr, n));
        // System.out.println(better(arr, n));
        System.out.println(optimal(arr, n));


    }
    public static int brute(int[] arr, int n){
        int length=1;
        for(int i=0;i<n;i++){
            int x= arr[i];
            int count=1;
            while(linears(arr,x+1)==true){
                x=x+1;
                count++;
            }
            length = Math.max(count,length);
        }
        return length;
    }
    public static boolean linears(int[] arr,int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return true;
            }
        }
        return false;
    }

    public static int better(int[] arr, int n){
        Arrays.sort(arr);
        int count=0;
        int lastSmall=Integer.MIN_VALUE;
        int longest=1;
        for(int i=0;i<n;i++){
            if(arr[i]-1==lastSmall){
                count++;
                lastSmall=arr[i];
            }else if(arr[i]!=lastSmall){
                count=1;
                lastSmall=arr[i];
            }
            longest= Math.max(count,longest);
        }
        return longest;
    }

    public static int optimal(int[] arr, int n){
        int longest=1;
        Set<Integer> set= new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }

        for( int it: set){
            if(!set.contains(it-1)){
                int count=1;
                int x= it;
                while(set.contains(x+1)){
                    x=x+1;
                    count++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
    
}
