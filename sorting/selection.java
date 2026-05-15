import java.util.*;
public class selection {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        selectionsort(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");    
        }
    }
    public static void selectionsort(int[] nums, int n){
        for(int i=0;i<=nums.length-2;i++){
            int min=i;
            for(int j=i;j<=nums.length-1;j++){
                if(nums[j]<nums[min]){
                    min=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[min];
            nums[min]=temp;  
        }
    }
}
