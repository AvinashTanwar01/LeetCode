import java.util.*;
public class basichash{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        int[] hash = new int[100001];
        for(int i =0;i<n;i++){
            hash[arr[i]]+=1;
        }
        int q=sc.nextInt();
        while(q--!=0){
            int num=sc.nextInt();
            //fetch
            System.out.println(num+"="+hash[num]);
        }
    }
}