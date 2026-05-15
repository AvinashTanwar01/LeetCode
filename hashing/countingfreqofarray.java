import java.util.*;

public class countingfreqofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        
        List<List<Integer>> result = countFrequencies(nums);

        System.out.print("[");
        for(int i = 0; i < result.size(); i++){
            System.out.print("[" + result.get(i).get(0) + ", " + result.get(i).get(1) + "]");
            if(i < result.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        sc.close();
    }
    
    public static List<List<Integer>> countFrequencies(int[] nums) {

        int[] hash = new int[100001];
        

        for(int i = 0; i < nums.length; i++){
            hash[nums[i]] += 1;
        }

        List<List<Integer>> result = new ArrayList<>();
        

        for(int i = 0; i < nums.length; i++){
            if(hash[nums[i]] > 0){
                List<Integer> pair = new ArrayList<>();
                pair.add(nums[i]);           // Element
                pair.add(hash[nums[i]]);     // Frequency
                result.add(pair);
                hash[nums[i]] = 0;           // Mark as processed to avoid duplicates
            }
        }
        
        return result;
    }
}