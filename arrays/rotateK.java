import java.util.Scanner;

public class rotateK{
     public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int k= sc.nextInt();
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // leftK(arr,n,k);
        
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void  leftK(int[] arr,int n,int k){
        k= k%n;
        int[] temp= new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int i=k;i<n;i++){
            arr[i-k]=arr[i];
        }
        for(int i=n-k;i<n;i++){
            arr[i]=temp[i-(n-k)];
        }
    }
    public static void reverse(int[] nums,int start , int end){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
    } 
}