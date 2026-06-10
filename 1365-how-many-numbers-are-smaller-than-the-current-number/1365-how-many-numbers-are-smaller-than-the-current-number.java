class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer,Integer> map1= new HashMap<>();
        for(int n:nums){
            map1.put(n,map1.getOrDefault(n,0)+1);
        }
        int[] arr= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0;
        for(Map.Entry<Integer,Integer> entry : map1.entrySet()){
            if(entry.getKey() < nums[i]){
                count+= entry.getValue();
            }

            arr[i]=count;
        }
        }
        return arr;
    }
}