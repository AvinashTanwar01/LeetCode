class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] new1 = new int[nums.length];
        int i=0;
        int j= nums.length-1;
        int k=nums.length-1;
        while(i<=j){
            int leftsq= nums[i]*nums[i];
            int rightsq=nums[j]*nums[j];
            if(leftsq>=rightsq){
                new1[k]=leftsq;
                i++;
            }else{
                new1[k]=rightsq;
                j--;
            }
            k--;
        }
    return new1;
    }
}