
public class firstandlastocc {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int n = 6, x = 8;
        int[] ans={-1,-1};
        int start= binary(arr, x, true);
        int end= binary(arr, x, false);
        ans[0]=start;
        ans[1]=end;
        System.out.println(ans[0]+ " "+ans[1]);
    }
    public static int binary(int[] arr,int x , boolean startindex){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<x){
                start=mid+1;
            }else if(arr[mid]>x){
                end=mid-1;
            }else{
                ans=mid;
                if( startindex ) {
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
