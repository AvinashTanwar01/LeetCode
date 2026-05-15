
public class booquets {
    public static void main(String[] args){
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3;
        int m = 2;
        int ans = optimal(arr, k, m);
        if (ans == -1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make bouquets on day " + ans);
    }

    public static int brute(int [] arr, int k, int m){
        int n =arr.length;
        int min=0;
        int max=0;
        for(int i=0;i<n;i++){
            min= Math.min(min,arr[i]);
            max= Math.max(max,arr[i]);
        }

        for(int i=min;i<=max;i++){
            if(possible(arr, i, k, m)){
                return i;
            }
        }
        return -1;
    }

    public static boolean possible(int[] arr , int days, int k , int m){
        int count=0;
        int countstore=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=days){
                count++;
            }else{
                countstore+=count/k;
                count=0;
            }
        }
        countstore+=count/k;
        if(countstore>=m){
            return true;
        }
        return false;
    }

    public static int optimal(int[] arr, int k , int m){
        long val = (long) m* k;
        if(val>arr.length) return -1;
        int min=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            min= Math.min(min,arr[i]);
            max= Math.max(max,arr[i]);
        }
        int low=min;
        int high=max;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(possible(arr, mid, k, m)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }

}
