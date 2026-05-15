
public class lowerbound {
    public static void main(String[] args){
        int[] arr = {3, 5, 8, 15, 19};
        int n = 5, x = 9;
        int result= binray(arr, n, x);
        System.out.println(result);
    }

    public static int binray(int[] arr,int n ,int x){
        int start=0;
        int end=n-1;
        int ans=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>=x){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans-1;
    }
}
