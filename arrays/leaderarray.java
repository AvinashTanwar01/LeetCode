import java.util.*;
public class leaderarray {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<n;i++){
           arr.add(sc.nextInt());
        }
        ArrayList<Integer> ans= optimal(arr,n);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        
    }

    public static ArrayList<Integer> optimal(ArrayList<Integer> arr, int n){
        ArrayList<Integer> ans= new ArrayList<>();
        int max= Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr.get(i)>max){
                ans.add(arr.get(i));
                max=arr.get(i);
            }
        }
        return ans;
    }
}
