class Solution {
    public int[] frequencySort(int[] nums) {
       
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        Integer[] arr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        Arrays.sort(arr, (a, b) -> {
            int freqA = freq.get(a);
            int freqB = freq.get(b);

            if (freqA != freqB) {
                return freqA - freqB;  
            } else {
                return b - a;          
            }
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

        return nums;
    }
}