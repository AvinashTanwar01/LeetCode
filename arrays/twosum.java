import java.util.*;

public class twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int[] result = better(arr, n, k);
        System.out.println(Arrays.toString(result));
    }

    public static int[] better(int[] arr,int n , int k){
        HashMap<Integer,Integer> mpp= new HashMap<>();
        int[] ans= new int[2];
        ans[0]=ans[1]=-1;
        for(int i=0;i<n;i++){
            int sum=arr[i];
            int more= k-sum;
            if(mpp.containsKey(more)){
                ans[0]=mpp.get(more);
                ans[1]=i;
                return ans;
            }
            mpp.put(arr[i],i);
        }
        return ans;
        }
}
