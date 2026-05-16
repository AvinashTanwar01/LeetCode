class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, int[]> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new int[]{1,i,i});
            }else{
                map.get(nums[i])[0]++;
                map.get(nums[i])[2]=i;
            }
        }
        int degree=0;
        for(int[] val:map.values()){
            degree= Math.max(degree,val[0]);
        }
        int result = Integer.MAX_VALUE;
        for(int[] val:map.values()){
            if(val[0]==degree){
                int length= val[2]-val[1]+1;
                result= Math.min(length,result);
            }
        }
        return result;
    }
}