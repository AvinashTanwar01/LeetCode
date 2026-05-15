import java.util.*;

public class singleNum {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {2, 2, 1};
        System.out.println("Output: " + sol.singleNumber(nums1));
        
        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println("Output: " + sol.singleNumber(nums2));
        
        int[] nums3 = {1};
        System.out.println("Output: " + sol.singleNumber(nums3));
    }
}

class Solution {
    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            hash.put(nums[i], hash.getOrDefault(nums[i], 0) + 1);
        }
        

        for(int num : nums){
            if(hash.get(num) == 1){
                return num;
            }
        }
        
        return 0;
    }
    

    public int singleNumberXOR(int[] nums) {
        int result = 0;
        for(int num : nums){
            result ^= num; 
        }
        return result;
    }
}