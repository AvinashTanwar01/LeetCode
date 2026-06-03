class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] new1 = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            new1[i]= nums[i]*nums[i];
        }
        Arrays.sort(new1);
        return new1;
    }
}