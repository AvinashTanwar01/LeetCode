import java.util.*;
public class sort102 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        optimal(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }

    }
    public static void optimal(ArrayList<Integer> arr,int n){
        int mid=0,low=0,high=n-1;
        while(mid<=high){
            if(arr.get(mid)==0){
                int temp = arr.get(low);
                arr.set(low,arr.get(mid));
                arr.set(mid,temp);
                low++;
                mid++;
            }else if(arr.get(mid)==1){
                mid++;
            }else if(arr.get(mid)==2){
                int temp = arr.get(mid);
                arr.set(mid,arr.get(high));
                arr.set(high,temp);

                high--;
            }
        }
    }
}
