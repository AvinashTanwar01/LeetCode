import java.util.*;
public class recurAraayRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        reverse(0, arr, n);  
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void reverse(int i, int[] arr, int n){
        if(i >= n/2){
            return;
        }
        swap(arr, i, n-i-1);
        reverse(i+1, arr, n);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}