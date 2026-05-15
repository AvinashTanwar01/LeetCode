import java.util.Scanner;

public class max2ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        // System.err.println(max2(arr));
        System.err.println(optimalMax2(arr));
    }

    public static int max2(int[] nums){
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int max2=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max2 && nums[i]!=max){
                max2=nums[i];
            }
        }
        return max2;
    }

    public static int optimalMax2(int[] arr){
        int largest=arr[0];
        int Slargest= -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                Slargest=largest;
                largest=arr[i];
            }else if(arr[i]<largest && arr[i]>Slargest){
                Slargest=arr[i];
            }
        }
        return Slargest;
    }
}
