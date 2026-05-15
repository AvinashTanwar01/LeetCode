import java.util.Scanner;

public class rotateRK {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
        int k= sc.nextInt();
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // rightk(arr,k);
        
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void rightk(int[] nums, int k) {
        int n = nums.length;
        if(n == 0) return;  
        k = k % n;
        if(k == 0) return;  

        int[] temp = new int[k];
        for(int i = 0; i < k; i++){
            temp[i] = nums[n - k + i];  
        }
        for(int i = n - k - 1; i >= 0; i--){  
            nums[i + k] = nums[i];
        }
        
        for(int i = 0; i < k; i++){
            nums[i] = temp[i]; 
        }
    }

    public static void reverse(int[] nums,int start,int end) {
        while(start<=end){
            int temp= nums[start];
            nums[start]= nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
    }
}