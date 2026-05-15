import java.util.Scanner;

public class insertion {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        insertionsort(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");    
        }
    }

    public static void insertionsort(int[] nums,int n){
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0&&nums[j-1]>nums[j]){
                int temp = nums[j-1];
                nums[j-1]=nums[j];
                nums[j]=temp;
                j--;
            }
        }
    }
}
