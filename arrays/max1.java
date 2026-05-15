import java.util.*;

public class max1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int result = max(arr, n);
        System.out.println(result);

    }
    public static int max(int[] arr,int n){
        int count=0;
        int maxi=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                maxi=Math.max(maxi, count);
            }else{
                count=0;
            }
        }
        return maxi;
    }

}
