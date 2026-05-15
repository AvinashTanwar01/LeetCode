import java.util.*;
import java.util.Map.Entry;

public class maxeleN2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        int ans = optimal(arr,n);
        System.out.println(ans);
    }

    public static int better(int[] arr,int n){
        HashMap<Integer,Integer> mpp= new HashMap<>();
        for(int i =0;i<n;i++){
            int count = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i],count+1);
        }
        for(Map.Entry<Integer, Integer> it:mpp.entrySet()){
            if(it.getValue()>(n/2)){
                return it.getKey();
            }
        }
        return -1;

    }
    public static int optimal(int[] arr,int n){
        int count=0;
        int ele = 0;
        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                ele=arr[i];
            }else if(arr[i]==ele){
                count++;
            }else{
                count--;
            }
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            if(arr[i]==ele) cnt++;
        }
        if(cnt > n/2){
            return ele;
        }
        return -1;
    }

}
