
public class koko {
    public static void main(String[] args) {
        int[] arr = {7, 15, 6, 3};
        int h = 8;
        int ans = optimal(arr, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }
    public static int brute(int[] arr, int h){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           max=Math.max(max,arr[i]);
        }
        for(int i=1;i<= max;i++){
            int reqtime=time(arr,h);
            if(reqtime<=h){
                return reqtime;
            }
        }
        return max;
    }
    public static int time(int[] arr, int h){
        int time=0;
        for(int i=0;i<arr.length;i++){
            time += (int) Math.ceil(((double)(arr[i]))/((double)(h)));
        }
        return time;
    }

    public static int optimal(int[] arr , int h){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           max=Math.max(max,arr[i]);
        }
        int low=0;
        int high=max;
        while(low<=high){
            int mid= low+(high-low)/2;
            int totalh=time(arr, mid);
            if(totalh<=h){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }

}
