import java.util.*;
public class sortArotated{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sorted(arr));
    }
    public static boolean sorted(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[(i+1)% arr.length]){
                count++;
            }

        }
        return count<=1;
    }
}