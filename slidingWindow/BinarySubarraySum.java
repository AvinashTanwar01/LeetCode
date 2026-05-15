public class BinarySubarraySum {
    public static void main(String[] args){
        int[] arr= {1,0,1,0,1};
        int goal=2;
        int result = Optimal(arr,goal) - Optimal(arr,goal-1);
        System.out.println(result);

    }
    public static  int  Optimal(int[] nums,int goal){
        int left=0,right=0,count=0,sum=0;
        if(goal<0) return 0;
        while(right < nums.length){
            sum+=nums[right];
            while(sum>goal){
                sum-=nums[left];
                left++;
            }
            count+= right-left+1;
            right++;
        }
        return count;
    }
}
