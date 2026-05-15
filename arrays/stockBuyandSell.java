import java.util.*;

public class stockBuyandSell {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        int ans = optimal(arr,n);
        System.out.println(ans);
    }

    public static int optimal(int[] arr,int n){
        int max=0;
        int min=arr[0];
        for(int i=1;i<n;i++){
            min=Math.min(min,arr[i]);
            max= Math.max(max,arr[i]-min);
        }
        return max;
    }
}
