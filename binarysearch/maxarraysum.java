

public class maxarraysum {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int k = 2;
        int ans = optimal(a, k);
        System.out.println("The answer is: " + ans);
    }

    public static int brute(int[] arr, int k){
        int n= arr.length;
        int low= arr[0];
        int high= 0;
        for(int i=0;i<n;i++){
            high=+arr[i];
            low= Math.max(low, arr[i]);
        }

        for(int pages=low; pages<high;pages++){
            int currstu= maxi(arr,pages);
            if(currstu==k){
                return pages;
            }
        }
        return low;


    }
    public static int maxi(int[] arr , int pages){
        int student=1;
        int pagesum=0;
        for(int i=0;i<arr.length;i++){
            if(pagesum+arr[i]<=pages){
                pagesum+=arr[i];
            }else{
                student++;
                pagesum=arr[i];
            }
        }
        return student;
    }

    public static int optimal(int[] arr,int k){
        int n = arr.length;
        int low=arr[0];
        int high=0;
        for(int i=0;i<n;i++){
            high+=arr[i];
            low=Math.max(low,arr[i]);
        }

        while(low<=high){
            int mid= low+(high-low)/2;
            int curr= maxi(arr, mid);
            if(curr>k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        return low;
    }

    

}
