import java.util.ArrayList;
import java.util.Scanner;

public class sortedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int[] arr= new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]= sc.nextInt();
        // }
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        // System.err.println(max2(arr));
        System.err.println(sortedArr(arr));
    }
    public static boolean sortedArr(ArrayList<Integer> nums){
        for(int i=1;i<nums.size();i++){
            if(nums.get(i)>=nums.get(i-1)){

            }else{
                return false;
            }
        }
        return true;
    }
}
