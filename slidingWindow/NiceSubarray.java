public class NiceSubarray {
    public static void main(String[] args){
         int[] arr= {2,4,6};
        int goal=1;
        int result = Optimal(arr,goal) - Optimal(arr,goal-1);
        System.out.println(result);
    }

    public static  int  Optimal(int[] nums,int goal){
        int left=0,right=0,count=0,sum=0;
        if(goal<0) return 0;
        while(right <= nums.length){
            sum+=nums[right]%2;
            while(sum>goal){
                sum-=nums[left]%2;
                left++;
            }
            count+= right-left+1;
            right++;
        }
        return count;
    }
}
