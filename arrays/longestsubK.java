import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class longestsubK {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int result = optimal(arr, n, k);
        System.out.println(result);
    }
    public static int brute(int[] arr, int n, int k){
        int len=0;
        for(int i=0;i<n;i++){
            long sum=0;
            for(int j=i;j<n;j++){
                // long sum=0;
                // for(int K=i;K<=j;K++){ o(n^3 time complexity as for another one its n^2)
                    sum+=arr[j];
                // }
                if(sum==k){
                    len = Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }
     public static int hashing(int[] arr, int n, int k){
        long sum=0;
        int maxlen=0;
        Map<Long,Integer> presum= new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];

            if(sum==k){
                maxlen=Math.max(maxlen,i+1);
            }

            long rem= sum-k;
            if(presum.containsKey(rem)){
                int len = i-presum.get(rem);
                maxlen=Math.max(len,maxlen);
            }

            if(!presum.containsKey(rem)){
                presum.put(sum, i);
            }
        }
        return maxlen;
     }

     public static int optimal(int[] arr, int n, int k){
        int right=0,left=0;
        int sum=arr[0];
        int maxlen=0;
        while(right<n){
            while(left<=right && sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                maxlen=Math.max(maxlen,right-left +1);
            }
            right++;
            if(right<n) sum+=arr[right];
        }
        return maxlen;
     }
}

