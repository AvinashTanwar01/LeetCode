import java.util.Scanner;

public class bubble {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubblesort(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");    
        }
    }

    public static void bubblesort(int[] nums,int n){
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
}
